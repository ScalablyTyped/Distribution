package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /** to get the type of bing map.
    * @Default {aerial}
    */
  var bingMapType: js.UndefOr[BingMapType | java.lang.String] = js.undefined
  /** Specifies the bubble settings for map
    */
  var bubbleSettings: js.UndefOr[LayersBubbleSettings] = js.undefined
  /** Specifies the datasource for the shape layer
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Enables or disables the shape mouse hover
    * @Default {false}
    */
  var enableMouseHover: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the shape selection
    * @Default {true}
    */
  var enableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the map view type.
    * @Default {'geographic'}
    */
  var geometryType: js.UndefOr[GeometryType | java.lang.String] = js.undefined
  /** to get the key of bing map
    * @Default {null}
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
    */
  var labelSettings: js.UndefOr[LayersLabelSettings] = js.undefined
  /** Specifies the map type.
    * @Default {'geometry'}
    */
  var layerType: js.UndefOr[LayerType | java.lang.String] = js.undefined
  /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
    */
  var legendSettings: js.UndefOr[LayersLegendSettings] = js.undefined
  /** Specifies the map items template for shapes.
    */
  var mapItemsTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the map marker template for map layer.
    * @Default {null}
    */
  var markerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specify markers for shape layer.
    */
  var markers: js.UndefOr[js.Array[_]] = js.undefined
  /** Specify selectedMapShapes for shape layer
    * @Default {[]}
    */
  var selectedMapShapes: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[SelectionMode | java.lang.String] = js.undefined
  /** Specifies the shape data for the shape layer
    */
  var shapeData: js.UndefOr[js.Any] = js.undefined
  /** Specifies the data path of shape
    */
  var shapeDataPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the data path of shape
    */
  var shapePropertyPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape settings of map layer
    */
  var shapeSettings: js.UndefOr[LayersShapeSettings] = js.undefined
  /** Shows or hides the map items.
    * @Default {false}
    */
  var showMapItems: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the tooltip for shapes
    * @Default {false}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Sublayer is the collection of shape Layer
    */
  var subLayers: js.UndefOr[js.Array[LayersSubLayer]] = js.undefined
  /** Specifies the tooltip template for shapes.
    */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL template for the OSM type map.
    * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
    */
  var urlTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    bingMapType: BingMapType | java.lang.String = null,
    bubbleSettings: LayersBubbleSettings = null,
    dataSource: js.Any = null,
    enableMouseHover: js.UndefOr[scala.Boolean] = js.undefined,
    enableSelection: js.UndefOr[scala.Boolean] = js.undefined,
    geometryType: GeometryType | java.lang.String = null,
    key: java.lang.String = null,
    labelSettings: LayersLabelSettings = null,
    layerType: LayerType | java.lang.String = null,
    legendSettings: LayersLegendSettings = null,
    mapItemsTemplate: java.lang.String = null,
    markerTemplate: java.lang.String = null,
    markers: js.Array[_] = null,
    selectedMapShapes: js.Array[_] = null,
    selectionMode: SelectionMode | java.lang.String = null,
    shapeData: js.Any = null,
    shapeDataPath: java.lang.String = null,
    shapePropertyPath: java.lang.String = null,
    shapeSettings: LayersShapeSettings = null,
    showMapItems: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    subLayers: js.Array[LayersSubLayer] = null,
    tooltipTemplate: java.lang.String = null,
    urlTemplate: java.lang.String = null
  ): Layer = {
    val __obj = js.Dynamic.literal()
    if (bingMapType != null) __obj.updateDynamic("bingMapType")(bingMapType.asInstanceOf[js.Any])
    if (bubbleSettings != null) __obj.updateDynamic("bubbleSettings")(bubbleSettings)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(enableMouseHover)) __obj.updateDynamic("enableMouseHover")(enableMouseHover)
    if (!js.isUndefined(enableSelection)) __obj.updateDynamic("enableSelection")(enableSelection)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (labelSettings != null) __obj.updateDynamic("labelSettings")(labelSettings)
    if (layerType != null) __obj.updateDynamic("layerType")(layerType.asInstanceOf[js.Any])
    if (legendSettings != null) __obj.updateDynamic("legendSettings")(legendSettings)
    if (mapItemsTemplate != null) __obj.updateDynamic("mapItemsTemplate")(mapItemsTemplate)
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (selectedMapShapes != null) __obj.updateDynamic("selectedMapShapes")(selectedMapShapes)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (shapeData != null) __obj.updateDynamic("shapeData")(shapeData)
    if (shapeDataPath != null) __obj.updateDynamic("shapeDataPath")(shapeDataPath)
    if (shapePropertyPath != null) __obj.updateDynamic("shapePropertyPath")(shapePropertyPath)
    if (shapeSettings != null) __obj.updateDynamic("shapeSettings")(shapeSettings)
    if (!js.isUndefined(showMapItems)) __obj.updateDynamic("showMapItems")(showMapItems)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (subLayers != null) __obj.updateDynamic("subLayers")(subLayers)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate)
    __obj.asInstanceOf[Layer]
  }
}

