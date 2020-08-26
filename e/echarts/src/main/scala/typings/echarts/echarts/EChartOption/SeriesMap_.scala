package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationAnimationDelay
import typings.echarts.anon.AnimationDelayAnimationDelayUpdate
import typings.echarts.anon.AnimationDelayUpdateAnimationDuration
import typings.echarts.anon.AreaColorEmphasis
import typings.echarts.anon.BorderWidth
import typings.echarts.anon.Min
import typings.echarts.echarts.EChartOption.SeriesMap.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Map.**
  *
  * Map is maily used in the visulization of geographic area data, which
  * can be used with
  * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
  * component to visualize the datas such as population distribution
  * density in diffrent areas.
  *
  * Series of same
  * [map type](https://echarts.apache.org/en/option.html#series-map.map)
  * will show in one map.
  * At this point, the configuration of the first series will be used
  * for the map configuration.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-map)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-map
  */
@js.native
trait SeriesMap_ extends js.Object {
  /**
    * Used to scale aspect of geo.
    *
    * The final aspect is calculated by: `geoBoundingRect.width
    * / geoBoundingRect.height * aspectScale`.
    *
    *
    * @default
    * 0.75
    * @see https://echarts.apache.org/en/option.html#series-map.aspectScale
    */
  var aspectScale: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * Two dimension array.
    * Define coord of left-top, right-bottom in layout box.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.boundingCoords
    */
  var boundingCoords: js.UndefOr[js.Array[_]] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.center
    */
  var center: js.UndefOr[js.Array[_]] = js.native
  /**
    * Data array of map series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
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
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data
    */
  var data: js.UndefOr[js.Array[Double | DataObject]] = js.native
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * In default case, map series create exclusive `geo` component
    * for themselves.
    * But `geoIndex` can be used to specify an outer
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * , which can be shared with other series like
    * [pie](https://echarts.apache.org/en/option.html#series-pie)
    * . Moreover, the region color of the outer
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * can be controlled by the map series (via
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * ).
    *
    * When `geoIndex` specified,
    * [series-map.map](https://echarts.apache.org/en/option.html#series-map.map)
    * other style configurations like
    * [series-map.itemStyle](https://echarts.apache.org/en/option.html#series-map.itemStyle)
    * will not work, but cooresponding configurations in
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * will be used.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of Map Area Border, `emphasis` is the style when
    * it is highlighted, like being hovered by mouse, or highlighted
    * via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle
    */
  var itemStyle: js.UndefOr[AreaColorEmphasis] = js.native
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.label
    */
  var label: js.UndefOr[BorderWidth] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * After setting these two values, `left/right/top/bottom/width/height`
    * becomes invalid.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.layoutCenter
    */
  var layoutCenter: js.UndefOr[js.Array[_]] = js.native
  /**
    * Size of map, see `layoutCenter` for more information.
    * Percentage relative to screen width, and absolute pixel values
    * are supported.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.layoutSize
    */
  var layoutSize: js.UndefOr[Double | String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.left
    */
  var left: js.UndefOr[Double | String] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * **JSON importing example**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * ECharts uses
    * [geoJSON](http://geojson.org/)
    * format as map outline.
    * Besides the methods introduced above, you can also get
    * [geoJSON](http://geojson.org/)
    * data through in other methods if you like and register it in
    * ECharts. Reference to
    * [USA Population Estimates](https://echarts.apache.org/examples/en/editor.html?c=map-usa)
    * for more information.
    *
    *
    * @default
    * ''
    * @see https://echarts.apache.org/en/option.html#series-map.map
    */
  var map: js.UndefOr[String] = js.native
  /**
    * Value of multiple series with the same
    * [map type](https://echarts.apache.org/en/option.html#series-map.map)
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
    * @see https://echarts.apache.org/en/option.html#series-map.mapValueCalculation
    */
  var mapValueCalculation: js.UndefOr[String] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdateAnimationDuration] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine
    */
  var markLine: js.UndefOr[AnimationDelayAnimationDelayUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markPoint
    */
  var markPoint: js.UndefOr[AnimationAnimationDelay] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.name
    */
  var name: js.UndefOr[String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.nameMap
    */
  var nameMap: js.UndefOr[js.Object] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Limit of scaling, with `min` and `max`. `1` by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit
    */
  var scaleLimit: js.UndefOr[Min] = js.native
  /**
    * Selected mode decides whether multiple selecting is supported.
    * By default, `false` is used for disabling selection.
    * Its value can also be `'single'` for selecting single area, or
    * `'multiple'` for selecting multiple areas.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.selectedMode
    */
  var selectedMode: js.UndefOr[Boolean | String] = js.native
  /**
    * When
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
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
    * [example](https://echarts.apache.org/examples/en/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://echarts.apache.org/en/option.html#series-map.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Show the symbol in related area (dot of series symbol).
    * Available when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * component exists.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.showLegendSymbol
    */
  var showLegendSymbol: js.UndefOr[Boolean] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "map"
    * @see https://echarts.apache.org/en/option.html#series-map.type
    */
  var `type`: js.UndefOr[String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.z
    */
  var z: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-map.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
  /**
    * Zoom rate of current view-port.
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-map.zoom
    */
  var zoom: js.UndefOr[Double] = js.native
}

object SeriesMap_ {
  @scala.inline
  def apply(): SeriesMap_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMap_]
  }
  @scala.inline
  implicit class SeriesMap_Ops[Self <: SeriesMap_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAspectScale(value: Double): Self = this.set("aspectScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectScale: Self = this.set("aspectScale", js.undefined)
    @scala.inline
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBoundingCoordsVarargs(value: js.Any*): Self = this.set("boundingCoords", js.Array(value :_*))
    @scala.inline
    def setBoundingCoords(value: js.Array[_]): Self = this.set("boundingCoords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingCoords: Self = this.set("boundingCoords", js.undefined)
    @scala.inline
    def setCenterVarargs(value: js.Any*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: js.Array[_]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDataVarargs(value: (Double | DataObject)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Double | DataObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetIndex: Self = this.set("datasetIndex", js.undefined)
    @scala.inline
    def setGeoIndex(value: Double): Self = this.set("geoIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoIndex: Self = this.set("geoIndex", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: AreaColorEmphasis): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: BorderWidth): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLayoutCenterVarargs(value: js.Any*): Self = this.set("layoutCenter", js.Array(value :_*))
    @scala.inline
    def setLayoutCenter(value: js.Array[_]): Self = this.set("layoutCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutCenter: Self = this.set("layoutCenter", js.undefined)
    @scala.inline
    def setLayoutSize(value: Double | String): Self = this.set("layoutSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutSize: Self = this.set("layoutSize", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapValueCalculation(value: String): Self = this.set("mapValueCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapValueCalculation: Self = this.set("mapValueCalculation", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationDelayUpdateAnimationDuration): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: AnimationDelayAnimationDelayUpdate): Self = this.set("markLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkLine: Self = this.set("markLine", js.undefined)
    @scala.inline
    def setMarkPoint(value: AnimationAnimationDelay): Self = this.set("markPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkPoint: Self = this.set("markPoint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameMap(value: js.Object): Self = this.set("nameMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameMap: Self = this.set("nameMap", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRoam(value: Boolean | String): Self = this.set("roam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoam: Self = this.set("roam", js.undefined)
    @scala.inline
    def setScaleLimit(value: Min): Self = this.set("scaleLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleLimit: Self = this.set("scaleLimit", js.undefined)
    @scala.inline
    def setSelectedMode(value: Boolean | String): Self = this.set("selectedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMode: Self = this.set("selectedMode", js.undefined)
    @scala.inline
    def setSeriesLayoutBy(value: String): Self = this.set("seriesLayoutBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesLayoutBy: Self = this.set("seriesLayoutBy", js.undefined)
    @scala.inline
    def setShowLegendSymbol(value: Boolean): Self = this.set("showLegendSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegendSymbol: Self = this.set("showLegendSymbol", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

