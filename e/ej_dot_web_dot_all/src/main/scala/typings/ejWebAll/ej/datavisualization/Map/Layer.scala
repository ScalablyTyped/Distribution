package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /** to get the type of bing map.
    * @Default {aerial}
    */
  var bingMapType: js.UndefOr[BingMapType | String] = js.native
  /** Specifies the bubble settings for map
    */
  var bubbleSettings: js.UndefOr[LayersBubbleSettings] = js.native
  /** Specifies the datasource for the shape layer
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Enables or disables the shape mouse hover
    * @Default {false}
    */
  var enableMouseHover: js.UndefOr[Boolean] = js.native
  /** Enables or disables the shape selection
    * @Default {true}
    */
  var enableSelection: js.UndefOr[Boolean] = js.native
  /** Specifies the map view type.
    * @Default {'geographic'}
    */
  var geometryType: js.UndefOr[GeometryType | String] = js.native
  /** to get the key of bing map
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
  /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
    */
  var labelSettings: js.UndefOr[LayersLabelSettings] = js.native
  /** Specifies the map type.
    * @Default {'geometry'}
    */
  var layerType: js.UndefOr[LayerType | String] = js.native
  /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
    */
  var legendSettings: js.UndefOr[LayersLegendSettings] = js.native
  /** Specifies the map items template for shapes.
    */
  var mapItemsTemplate: js.UndefOr[String] = js.native
  /** Specifies the map marker template for map layer.
    * @Default {null}
    */
  var markerTemplate: js.UndefOr[String] = js.native
  /** Specify markers for shape layer.
    */
  var markers: js.UndefOr[js.Array[_]] = js.native
  /** Specify selectedMapShapes for shape layer
    * @Default {[]}
    */
  var selectedMapShapes: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the shape data for the shape layer
    */
  var shapeData: js.UndefOr[js.Any] = js.native
  /** Specifies the data path of shape
    */
  var shapeDataPath: js.UndefOr[String] = js.native
  /** Specifies the data path of shape
    */
  var shapePropertyPath: js.UndefOr[String] = js.native
  /** Specifies the shape settings of map layer
    */
  var shapeSettings: js.UndefOr[LayersShapeSettings] = js.native
  /** Shows or hides the map items.
    * @Default {false}
    */
  var showMapItems: js.UndefOr[Boolean] = js.native
  /** Shows or hides the tooltip for shapes
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Sublayer is the collection of shape Layer
    */
  var subLayers: js.UndefOr[js.Array[LayersSubLayer]] = js.native
  /** Specifies the tooltip template for shapes.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the URL template for the OSM type map.
    * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
    */
  var urlTemplate: js.UndefOr[String] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
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
    def setBingMapType(value: BingMapType | String): Self = this.set("bingMapType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBingMapType: Self = this.set("bingMapType", js.undefined)
    @scala.inline
    def setBubbleSettings(value: LayersBubbleSettings): Self = this.set("bubbleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleSettings: Self = this.set("bubbleSettings", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEnableMouseHover(value: Boolean): Self = this.set("enableMouseHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseHover: Self = this.set("enableMouseHover", js.undefined)
    @scala.inline
    def setEnableSelection(value: Boolean): Self = this.set("enableSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelection: Self = this.set("enableSelection", js.undefined)
    @scala.inline
    def setGeometryType(value: GeometryType | String): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabelSettings(value: LayersLabelSettings): Self = this.set("labelSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSettings: Self = this.set("labelSettings", js.undefined)
    @scala.inline
    def setLayerType(value: LayerType | String): Self = this.set("layerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerType: Self = this.set("layerType", js.undefined)
    @scala.inline
    def setLegendSettings(value: LayersLegendSettings): Self = this.set("legendSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendSettings: Self = this.set("legendSettings", js.undefined)
    @scala.inline
    def setMapItemsTemplate(value: String): Self = this.set("mapItemsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapItemsTemplate: Self = this.set("mapItemsTemplate", js.undefined)
    @scala.inline
    def setMarkerTemplate(value: String): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
    @scala.inline
    def setMarkersVarargs(value: js.Any*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[_]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setSelectedMapShapesVarargs(value: js.Any*): Self = this.set("selectedMapShapes", js.Array(value :_*))
    @scala.inline
    def setSelectedMapShapes(value: js.Array[_]): Self = this.set("selectedMapShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMapShapes: Self = this.set("selectedMapShapes", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode | String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setShapeData(value: js.Any): Self = this.set("shapeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeData: Self = this.set("shapeData", js.undefined)
    @scala.inline
    def setShapeDataPath(value: String): Self = this.set("shapeDataPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeDataPath: Self = this.set("shapeDataPath", js.undefined)
    @scala.inline
    def setShapePropertyPath(value: String): Self = this.set("shapePropertyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapePropertyPath: Self = this.set("shapePropertyPath", js.undefined)
    @scala.inline
    def setShapeSettings(value: LayersShapeSettings): Self = this.set("shapeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeSettings: Self = this.set("shapeSettings", js.undefined)
    @scala.inline
    def setShowMapItems(value: Boolean): Self = this.set("showMapItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMapItems: Self = this.set("showMapItems", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setSubLayersVarargs(value: LayersSubLayer*): Self = this.set("subLayers", js.Array(value :_*))
    @scala.inline
    def setSubLayers(value: js.Array[LayersSubLayer]): Self = this.set("subLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubLayers: Self = this.set("subLayers", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
  }
  
}

