package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SeriesCustom {
  
  /**
    * `custom series` requires developers to write a render logic by
    * themselves. This render logic is called
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * .
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * will be called on each data item.
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * provides two parameters:
    *
    * + [params](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params)
    * : provides info about the current series and data and coordinate
    * system.
    * + [api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * : includes some methods.
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * method should returns graphic elements definitions.See
    * [renderItem.return](https://echarts.apache.org/en/option.html#series-custom.renderItem.return)
    * .
    *
    * Generally, the main process of
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * is that retrieve value from data and convert them to graphic
    * elements on the current coordinate system. Two methods in
    * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * are always used in this procedure:
    *
    * + [api.value(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value)
    * is used to retrieve value from data.
    * For example, `api.value(0)`
    * retrieve the value of the first dimension in the current data
    * item.
    * + [api.coord(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord)
    * is used to convert data to coordinate.
    * For example, `var point = api.coord([api.value(0),
    * api.value(1)])`
    * converet the data to the point on the current coordinate system.
    *
    * Sometimes
    * [api.size(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.size)
    * method is needed, which calculates the size on the coordinate
    * system by a given data range.
    *
    * Moreover,
    * [api.style(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.style)
    * method can be used to set style.
    * It provides not only the style settings specified in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-custom.itemStyle)
    * , but also the result of visual mapping.
    * This method can also be called like `api.style({fill:
    * 'green', stroke: 'yellow'})` to override those style settings.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem
    */
  type RenderItem = js.Function2[
    /* params */ typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemParams, 
    /* api */ typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemApi, 
    typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnGroup | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPath | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnImage | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnText | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnRect | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnCircle | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnRing | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnSector | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnArc | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPolygon | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPolyline | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnLine | typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnBezierCurve
  ]
}
