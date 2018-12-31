package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesLinesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var children: js.Array[DataObject]
  /**
    * An array includes two ore more than two coordinates.
    * Each coordinate could be `[x, y]` in
    * [rectangular coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * and `[lng, lat]` in
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.coords
    */
  var coords: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_LineStyleLabelAnonShadowOffsetXShadowBlur] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_ShadowOffsetXBackgroundColorShowAlignTextBorderWidthVerticalAlignShadowBlurHeightBorderWidth
  ] = js.undefined
  /**
    * The line style of this data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ShadowOffsetXShadowBlurColorShadowColorOpacityShadowOffsetYType] = js.undefined
  /**
    * the name of data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

