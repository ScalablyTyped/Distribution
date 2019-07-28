package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEmphasis
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdData
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdDataItemStyle
import typings.echarts.Anon_AreaColorEmphasis
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_Max
import typings.echarts.echartsNs.EChartOptionNs.SeriesMapNs.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Map.**
  *
  * Map is maily used in the visulization of geographic area data, which
  * can be used with
  * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
  * component to visualize the datas such as population distribution
  * density in diffrent areas.
  *
  * Series of same
  * [map type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
  * will show in one map.
  * At this point, the configuration of the first series will be used
  * for the map configuration.
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map
  */
trait SeriesMap extends Series {
  /**
    * Used to scale aspect of geo.
    *
    * The final aspect is calculated by: `geoBoundingRect.width
    * / geoBoundingRect.height * aspectScale`.
    *
    *
    * @default
    * 0.75
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.aspectScale
    */
  var aspectScale: js.UndefOr[Double] = js.undefined
  /**
    * Distance between component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * Two dimension array.
    * Define coord of left-top, right-bottom in layout box.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.boundingCoords
    */
  var boundingCoords: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Center of current view-port, in longitude and latitude.
    *
    * Example:
    *
    * ```
    * center: [115.97, 29.71]
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.center
    */
  var center: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Data array of map series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data
    */
  var data: js.UndefOr[js.Array[Double | DataObject]] = js.undefined
  /**
    * If
    * [series.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.undefined
  /**
    * In default case, map series create exclusive `geo` component
    * for themselves.
    * But `geoIndex` can be used to specify an outer
    * [geo component](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * , which can be shared with other series like
    * [pie](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie)
    * . Moreover, the region color of the outer
    * [geo component](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * can be controlled by the map series (via
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * ).
    *
    * When `geoIndex` specified,
    * [series-map.map](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    * other style configurations like
    * [series-map.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.itemStyle)
    * will not work, but cooresponding configurations in
    * [geo component](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * will be used.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of Map Area Border, `emphasis` is the style when
    * it is highlighted, like being hovered by mouse, or highlighted
    * via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_AreaColorEmphasis] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEmphasis] = js.undefined
  /**
    * `layoutCenter` and `layoutSize` provides layout strategy other
    * than `left/right/top/bottom/width/height`.
    *
    * When using `left/right/top/bottom/width/height`, it is hard to
    * put the map inside a box area with a fixed width-height ratio.
    * In this case, `layoutCenter` attribute can be used to define
    * the center position of map, and `layoutSize` can be used to define
    * the size of map. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    * After setting these two values, `left/right/top/bottom/width/height`
    * becomes invalid.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.layoutCenter
    */
  var layoutCenter: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Size of map, see `layoutCenter` for more information.
    * Percentage relative to screen width, and absolute pixel values
    * are supported.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.layoutSize
    */
  var layoutSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Distance between component and the left side of the container.
    *
    * `left` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or `'right'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
  /**
    * Map charts.
    *
    * Due to the increase of fineness of map, ECharts 3 doesn't include
    * map data by default for package size consideration.
    * You may find map files you need on
    * [map download page](http://ecomfe.github.io/echarts-builder-web/map3.html
    * )
    * and then include and register them in ECharts.
    *
    * Two formats of map data are provided in ECharts, one of which
    * can be included in `<script>` tag as JavaScript file, and the
    * other of is in JSON format and should be loaded using AJAX.
    * Map name and data will be loaded automatically once the JavaScript
    * file is loaded, while in the JSON form, you have to assign name
    * explicitly.
    *
    * Here are examples of these two types:
    *
    * **JavaScript importing example**
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    * **JSON importing example**
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    *
    * ECharts uses
    * [geoJSON](http://geojson.org/)
    * format as map outline.
    * Besides the methods introduced above, you can also get
    * [geoJSON](http://geojson.org/)
    * data through in other methods if you like and register it in
    * ECharts. Reference to
    * [USA Population Estimates](https://ecomfe.github.io/echarts-examples/public/editor.html?c=map-usa)
    * for more information.
    *
    *
    * @default
    * ''
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map
    */
  var map: js.UndefOr[String] = js.undefined
  /**
    * Value of multiple series with the same
    * [map type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.map)
    * can use this option to get a statistical value.
    *
    * Supported statistical methods:
    *
    * + `'sum'`
    * + `'average'`
    * + `'max'`
    * + `'min'`
    *
    *
    * @default
    * "sum"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.mapValueCalculation
    */
  var mapValueCalculation: js.UndefOr[String] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea
    */
  var markArea: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdDataItemStyle
  ] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markLine
    */
  var markLine: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdData
  ] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markPoint
    */
  var markPoint: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold
  ] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name mapping for customized areas. For example:
    *
    * ```
    * {
    * 'China' : '中国'
    * }
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.nameMap
    */
  var nameMap: js.UndefOr[js.Object] = js.undefined
  /**
    * Distance between component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Limit of scaling, with `min` and `max`. `1` by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.scaleLimit
    */
  var scaleLimit: js.UndefOr[Anon_Max] = js.undefined
  /**
    * Selected mode decides whether multiple selecting is supported.
    * By default, `false` is used for disabling selection.
    * Its value can also be `'single'` for selecting single area, or
    * `'multiple'` for selecting multiple areas.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.selectedMode
    */
  var selectedMode: js.UndefOr[Boolean | String] = js.undefined
  /**
    * When
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * is used, `seriesLayoutBy` specifies whether the column or the
    * row of `dataset` is mapped to the series, namely, the series
    * is "layout" on columns or rows. Optional values:
    *
    * + 'column': by default, the columns of `dataset` are mapped the
    * series. In this case, each column represents a dimension.
    * + 'row'：the rows of `dataset` are mapped to the series.
    * In this case, each row represents a dimension.
    *
    * Check this
    * [example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.undefined
  /**
    * Show the symbol in related area (dot of series symbol).
    * Available when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * component exists.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.showLegendSymbol
    */
  var showLegendSymbol: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Distance between component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or `'bottom'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * @default
    * "map"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
  /**
    * Zoom rate of current view-port.
    *
    *
    * @default
    * 1
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.zoom
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object SeriesMap {
  @scala.inline
  def apply(
    aspectScale: Int | Double = null,
    bottom: Double | String = null,
    boundingCoords: js.Array[_] = null,
    center: js.Array[_] = null,
    data: js.Array[Double | DataObject] = null,
    datasetIndex: Int | Double = null,
    geoIndex: Int | Double = null,
    id: String = null,
    itemStyle: Anon_AreaColorEmphasis = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEmphasis = null,
    layoutCenter: js.Array[_] = null,
    layoutSize: Double | String = null,
    left: Double | String = null,
    map: String = null,
    mapValueCalculation: String = null,
    markArea: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdDataItemStyle = null,
    markLine: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdData = null,
    markPoint: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold = null,
    name: String = null,
    nameMap: js.Object = null,
    right: Double | String = null,
    roam: Boolean | String = null,
    scaleLimit: Anon_Max = null,
    selectedMode: Boolean | String = null,
    seriesLayoutBy: String = null,
    showLegendSymbol: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tooltip: Anon_BackgroundColorBorderColor = null,
    top: Double | String = null,
    `type`: String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null,
    zoom: Int | Double = null
  ): SeriesMap = {
    val __obj = js.Dynamic.literal()
    if (aspectScale != null) __obj.updateDynamic("aspectScale")(aspectScale.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (boundingCoords != null) __obj.updateDynamic("boundingCoords")(boundingCoords)
    if (center != null) __obj.updateDynamic("center")(center)
    if (data != null) __obj.updateDynamic("data")(data)
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layoutCenter != null) __obj.updateDynamic("layoutCenter")(layoutCenter)
    if (layoutSize != null) __obj.updateDynamic("layoutSize")(layoutSize.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapValueCalculation != null) __obj.updateDynamic("mapValueCalculation")(mapValueCalculation)
    if (markArea != null) __obj.updateDynamic("markArea")(markArea)
    if (markLine != null) __obj.updateDynamic("markLine")(markLine)
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (roam != null) __obj.updateDynamic("roam")(roam.asInstanceOf[js.Any])
    if (scaleLimit != null) __obj.updateDynamic("scaleLimit")(scaleLimit)
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy)
    if (!js.isUndefined(showLegendSymbol)) __obj.updateDynamic("showLegendSymbol")(showLegendSymbol)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMap]
  }
}

