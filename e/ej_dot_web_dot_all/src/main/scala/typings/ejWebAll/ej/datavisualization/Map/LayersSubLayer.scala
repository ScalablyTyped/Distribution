package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersSubLayer extends js.Object {
  
  /** to get the type of bing map.
    * @Default {aerial}
    */
  var bingMapType: js.UndefOr[BingMapType | String] = js.native
  
  /** Specifies the bubble settings for map
    */
  var bubbleSettings: js.UndefOr[LayersSubLayersBubbleSettings] = js.native
  
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
  var labelSettings: js.UndefOr[LayersSubLayersLabelSettings] = js.native
  
  /** Specifies the map type.
    * @Default {'geometry'}
    */
  var layerType: js.UndefOr[LayerType | String] = js.native
  
  /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
    */
  var legendSettings: js.UndefOr[LayersSubLayersLegendSettings] = js.native
  
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
  var shapeSettings: js.UndefOr[LayersSubLayersShapeSettings] = js.native
  
  /** Shows or hides the map items.
    * @Default {false}
    */
  var showMapItems: js.UndefOr[Boolean] = js.native
  
  /** Shows or hides the tooltip for shapes
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies the tooltip template for shapes.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the URL template for the OSM type map.
    * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
    */
  var urlTemplate: js.UndefOr[String] = js.native
}
object LayersSubLayer {
  
  @scala.inline
  def apply(): LayersSubLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayer]
  }
  
  @scala.inline
  implicit class LayersSubLayerOps[Self <: LayersSubLayer] (val x: Self) extends AnyVal {
    
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
    def setBubbleSettings(value: LayersSubLayersBubbleSettings): Self = this.set("bubbleSettings", value.asInstanceOf[js.Any])
    
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
    def setLabelSettings(value: LayersSubLayersLabelSettings): Self = this.set("labelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSettings: Self = this.set("labelSettings", js.undefined)
    
    @scala.inline
    def setLayerType(value: LayerType | String): Self = this.set("layerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerType: Self = this.set("layerType", js.undefined)
    
    @scala.inline
    def setLegendSettings(value: LayersSubLayersLegendSettings): Self = this.set("legendSettings", value.asInstanceOf[js.Any])
    
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
    def setShapeSettings(value: LayersSubLayersShapeSettings): Self = this.set("shapeSettings", value.asInstanceOf[js.Any])
    
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
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
  }
}
