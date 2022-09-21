package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends StObject
     with Widget_ {
  
  /** Add markers dynamically based on layer and sublayer index value.
    * @returns {void}
    */
  def addMarkers(): Unit = js.native
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Map: Model = js.native
  
  /** Method for navigating to specific shape based on latitude, longitude and zoom level.
    * @param {number} Pass the latitude value for map
    * @param {number} Pass the longitude value for map
    * @param {number} Pass the zoom level for map
    * @returns {void}
    */
  def navigateTo(latitude: Double, longitude: Double, level: Double): Unit = js.native
  
  /** Method to perform map panning
    * @param {string} Pass the direction in which map should be panned
    * @returns {void}
    */
  def pan(direction: String): Unit = js.native
  
  /** Method to reload the map.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Method to reload the specified layer based on layer and sublayer index value.
    * @returns {void}
    */
  def refreshLayer(): Unit = js.native
  
  /** Method to reload the shapeLayers with updated values
    * @returns {void}
    */
  def refreshLayers(): Unit = js.native
  
  /** Method to reload the navigation control with updated values.
    * @param {any} Pass the navigation control instance
    * @returns {void}
    */
  def refreshNavigationControl(navigation: Any): Unit = js.native
  
  /** Method to perform map zooming.
    * @param {number} Pass the zoom level for map to be zoomed
    * @param {boolean} Pass the boolean value to enable or disable animation while zooming
    * @returns {void}
    */
  def zoom(level: Double, isAnimate: Boolean): Unit = js.native
}
object Map {
  
  @js.native
  sealed trait BingMapType extends StObject
  @JSGlobal("ej.datavisualization.Map.BingMapType")
  @js.native
  object BingMapType extends StObject {
    
    //specifies the aerial type
    @js.native
    sealed trait Aerial
      extends StObject
         with BingMapType
    
    //specifies the aerialwithlabel type
    @js.native
    sealed trait Aerialwithlabel
      extends StObject
         with BingMapType
    
    //specifies the road type
    @js.native
    sealed trait Road
      extends StObject
         with BingMapType
  }
  
  @js.native
  sealed trait ColorPalette extends StObject
  @JSGlobal("ej.datavisualization.Map.ColorPalette")
  @js.native
  object ColorPalette extends StObject {
    
    //specifies the custom color
    @js.native
    sealed trait Custompalette
      extends StObject
         with ColorPalette
    
    //specifies the palette1 color
    @js.native
    sealed trait Palette1
      extends StObject
         with ColorPalette
    
    //specifies the palette2 color
    @js.native
    sealed trait Palette2
      extends StObject
         with ColorPalette
    
    //specifies the palette3 color
    @js.native
    sealed trait Palette3
      extends StObject
         with ColorPalette
  }
  
  @js.native
  sealed trait DockPosition extends StObject
  @JSGlobal("ej.datavisualization.Map.DockPosition")
  @js.native
  object DockPosition extends StObject {
    
    //specifies the bottom position
    @js.native
    sealed trait Bottom
      extends StObject
         with DockPosition
    
    //specifies the left position
    @js.native
    sealed trait Left
      extends StObject
         with DockPosition
    
    //specifies the bottom position
    @js.native
    sealed trait Right
      extends StObject
         with DockPosition
    
    //specifies the top position
    @js.native
    sealed trait Top
      extends StObject
         with DockPosition
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.Map.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Map.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Lighter
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Regular
      extends StObject
         with FontWeight
  }
  
  @js.native
  sealed trait GeometryType extends StObject
  @JSGlobal("ej.datavisualization.Map.GeometryType")
  @js.native
  object GeometryType extends StObject {
    
    //specifies the geographic view of map
    @js.native
    sealed trait Geographic
      extends StObject
         with GeometryType
    
    //specifies the normal land view of map
    @js.native
    sealed trait Normal
      extends StObject
         with GeometryType
  }
  
  @js.native
  sealed trait LabelOrientation extends StObject
  @JSGlobal("ej.datavisualization.Map.LabelOrientation")
  @js.native
  object LabelOrientation extends StObject {
    
    //specifies the horizontal position
    @js.native
    sealed trait Horizontal
      extends StObject
         with LabelOrientation
    
    //specifies the vertical position
    @js.native
    sealed trait Vertical
      extends StObject
         with LabelOrientation
  }
  
  @js.native
  sealed trait LabelSize extends StObject
  @JSGlobal("ej.datavisualization.Map.LabelSize")
  @js.native
  object LabelSize extends StObject {
    
    //specifies the default size
    @js.native
    sealed trait Default
      extends StObject
         with LabelSize
    
    //specifies the fixed size
    @js.native
    sealed trait Fixed
      extends StObject
         with LabelSize
  }
  
  @js.native
  sealed trait LayerType extends StObject
  @JSGlobal("ej.datavisualization.Map.LayerType")
  @js.native
  object LayerType extends StObject {
    
    //specifies the bing type
    @js.native
    sealed trait Bing
      extends StObject
         with LayerType
    
    //specifies the geometry type
    @js.native
    sealed trait Geometry
      extends StObject
         with LayerType
    
    //specifies the osm type
    @js.native
    sealed trait Osm
      extends StObject
         with LayerType
  }
  
  @js.native
  sealed trait LegendIcons extends StObject
  @JSGlobal("ej.datavisualization.Map.LegendIcons")
  @js.native
  object LegendIcons extends StObject {
    
    //specifies the circle position
    @js.native
    sealed trait Circle
      extends StObject
         with LegendIcons
    
    //specifies the rectangle position
    @js.native
    sealed trait Rectangle
      extends StObject
         with LegendIcons
  }
  
  @js.native
  sealed trait LegendType extends StObject
  @JSGlobal("ej.datavisualization.Map.LegendType")
  @js.native
  object LegendType extends StObject {
    
    //specifies the bubbles type
    @js.native
    sealed trait Bubbles
      extends StObject
         with LegendType
    
    //specifies the layers type
    @js.native
    sealed trait Layers
      extends StObject
         with LegendType
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("ej.datavisualization.Map.Mode")
  @js.native
  object Mode extends StObject {
    
    //specifies the default mode
    @js.native
    sealed trait Default
      extends StObject
         with Mode
    
    //specifies the interactive mode
    @js.native
    sealed trait Interactive
      extends StObject
         with Mode
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.Map.Position")
  @js.native
  object Position extends StObject {
    
    //specifies the bottomcenter position
    @js.native
    sealed trait Bottomcenter
      extends StObject
         with Position
    
    //specifies the bottomleft position
    @js.native
    sealed trait Bottomleft
      extends StObject
         with Position
    
    //specifies the bottomright position
    @js.native
    sealed trait Bottomright
      extends StObject
         with Position
    
    //specifies the center position
    @js.native
    sealed trait Center
      extends StObject
         with Position
    
    //specifies the centerleft position
    @js.native
    sealed trait Centerleft
      extends StObject
         with Position
    
    //specifies the centerright position
    @js.native
    sealed trait Centerright
      extends StObject
         with Position
    
    //specifies the none position
    @js.native
    sealed trait None
      extends StObject
         with Position
    
    //specifies the topcenter position
    @js.native
    sealed trait Topcenter
      extends StObject
         with Position
    
    //specifies the topleft position
    @js.native
    sealed trait Topleft
      extends StObject
         with Position
    
    //specifies the topright position
    @js.native
    sealed trait Topright
      extends StObject
         with Position
  }
  
  @js.native
  sealed trait SelectionMode extends StObject
  @JSGlobal("ej.datavisualization.Map.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    //specifies the default position
    @js.native
    sealed trait Default
      extends StObject
         with SelectionMode
    
    //specifies the multiple position
    @js.native
    sealed trait Multiple
      extends StObject
         with SelectionMode
  }
  
  trait BubbleRenderingEventArgs extends StObject {
    
    /** Returns the bubble values.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object BubbleRenderingEventArgs {
    
    inline def apply(): BubbleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BubbleRenderingEventArgs]
    }
    
    extension [Self <: BubbleRenderingEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Returns clicked shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    extension [Self <: ClickEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait DisplayTextRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
      * location
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the map model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DisplayTextRenderingEventArgs {
    
    inline def apply(): DisplayTextRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTextRenderingEventArgs]
    }
    
    extension [Self <: DisplayTextRenderingEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Returns double clicked shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    extension [Self <: DoubleClickEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    /** to get the type of bing map.
      * @Default {aerial}
      */
    var bingMapType: js.UndefOr[BingMapType | String] = js.undefined
    
    /** Specifies the bubble settings for map
      */
    var bubbleSettings: js.UndefOr[LayersBubbleSettings] = js.undefined
    
    /** Specifies the datasource for the shape layer
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Enables or disables the shape mouse hover
      * @Default {false}
      */
    var enableMouseHover: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the shape selection
      * @Default {true}
      */
    var enableSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the map view type.
      * @Default {'geographic'}
      */
    var geometryType: js.UndefOr[GeometryType | String] = js.undefined
    
    /** to get the key of bing map
      * @Default {null}
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
      */
    var labelSettings: js.UndefOr[LayersLabelSettings] = js.undefined
    
    /** Specifies the map type.
      * @Default {'geometry'}
      */
    var layerType: js.UndefOr[LayerType | String] = js.undefined
    
    /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
      */
    var legendSettings: js.UndefOr[LayersLegendSettings] = js.undefined
    
    /** Specifies the map items template for shapes.
      */
    var mapItemsTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the map marker template for map layer.
      * @Default {null}
      */
    var markerTemplate: js.UndefOr[String] = js.undefined
    
    /** Specify markers for shape layer.
      */
    var markers: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specify selectedMapShapes for shape layer
      * @Default {[]}
      */
    var selectedMapShapes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
      * @Default {default}
      */
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.undefined
    
    /** Specifies the shape data for the shape layer
      */
    var shapeData: js.UndefOr[Any] = js.undefined
    
    /** Specifies the data path of shape
      */
    var shapeDataPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the data path of shape
      */
    var shapePropertyPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape settings of map layer
      */
    var shapeSettings: js.UndefOr[LayersShapeSettings] = js.undefined
    
    /** Shows or hides the map items.
      * @Default {false}
      */
    var showMapItems: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the tooltip for shapes
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Sublayer is the collection of shape Layer
      */
    var subLayers: js.UndefOr[js.Array[LayersSubLayer]] = js.undefined
    
    /** Specifies the tooltip template for shapes.
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL template for the OSM type map.
      * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
      */
    var urlTemplate: js.UndefOr[String] = js.undefined
  }
  object Layer {
    
    inline def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setBingMapType(value: BingMapType | String): Self = StObject.set(x, "bingMapType", value.asInstanceOf[js.Any])
      
      inline def setBingMapTypeUndefined: Self = StObject.set(x, "bingMapType", js.undefined)
      
      inline def setBubbleSettings(value: LayersBubbleSettings): Self = StObject.set(x, "bubbleSettings", value.asInstanceOf[js.Any])
      
      inline def setBubbleSettingsUndefined: Self = StObject.set(x, "bubbleSettings", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setEnableMouseHover(value: Boolean): Self = StObject.set(x, "enableMouseHover", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseHoverUndefined: Self = StObject.set(x, "enableMouseHover", js.undefined)
      
      inline def setEnableSelection(value: Boolean): Self = StObject.set(x, "enableSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectionUndefined: Self = StObject.set(x, "enableSelection", js.undefined)
      
      inline def setGeometryType(value: GeometryType | String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
      
      inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabelSettings(value: LayersLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      inline def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      inline def setLayerType(value: LayerType | String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
      
      inline def setLayerTypeUndefined: Self = StObject.set(x, "layerType", js.undefined)
      
      inline def setLegendSettings(value: LayersLegendSettings): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      inline def setLegendSettingsUndefined: Self = StObject.set(x, "legendSettings", js.undefined)
      
      inline def setMapItemsTemplate(value: String): Self = StObject.set(x, "mapItemsTemplate", value.asInstanceOf[js.Any])
      
      inline def setMapItemsTemplateUndefined: Self = StObject.set(x, "mapItemsTemplate", js.undefined)
      
      inline def setMarkerTemplate(value: String): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
      
      inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
      
      inline def setMarkers(value: js.Array[Any]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: Any*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setSelectedMapShapes(value: js.Array[Any]): Self = StObject.set(x, "selectedMapShapes", value.asInstanceOf[js.Any])
      
      inline def setSelectedMapShapesUndefined: Self = StObject.set(x, "selectedMapShapes", js.undefined)
      
      inline def setSelectedMapShapesVarargs(value: Any*): Self = StObject.set(x, "selectedMapShapes", js.Array(value*))
      
      inline def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShapeData(value: Any): Self = StObject.set(x, "shapeData", value.asInstanceOf[js.Any])
      
      inline def setShapeDataPath(value: String): Self = StObject.set(x, "shapeDataPath", value.asInstanceOf[js.Any])
      
      inline def setShapeDataPathUndefined: Self = StObject.set(x, "shapeDataPath", js.undefined)
      
      inline def setShapeDataUndefined: Self = StObject.set(x, "shapeData", js.undefined)
      
      inline def setShapePropertyPath(value: String): Self = StObject.set(x, "shapePropertyPath", value.asInstanceOf[js.Any])
      
      inline def setShapePropertyPathUndefined: Self = StObject.set(x, "shapePropertyPath", js.undefined)
      
      inline def setShapeSettings(value: LayersShapeSettings): Self = StObject.set(x, "shapeSettings", value.asInstanceOf[js.Any])
      
      inline def setShapeSettingsUndefined: Self = StObject.set(x, "shapeSettings", js.undefined)
      
      inline def setShowMapItems(value: Boolean): Self = StObject.set(x, "showMapItems", value.asInstanceOf[js.Any])
      
      inline def setShowMapItemsUndefined: Self = StObject.set(x, "showMapItems", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSubLayers(value: js.Array[LayersSubLayer]): Self = StObject.set(x, "subLayers", value.asInstanceOf[js.Any])
      
      inline def setSubLayersUndefined: Self = StObject.set(x, "subLayers", js.undefined)
      
      inline def setSubLayersVarargs(value: LayersSubLayer*): Self = StObject.set(x, "subLayers", js.Array(value*))
      
      inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
      
      inline def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
    }
  }
  
  trait LayersBubbleSettings extends StObject {
    
    /** Specifies the bubble Opacity value of bubbles for shape layer in map
      * @Default {0.9}
      */
    var bubbleOpacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersBubbleSettingsColorMappings] = js.undefined
    
    /** Specifies the bubble color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum size value of bubbles for shape layer in map
      * @Default {20}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum size value of bubbles for shape layer in map
      * @Default {10}
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the showBubble visibility status map
      * @Default {true}
      */
    var showBubble: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the tooltip visibility status of the shape layer in map
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the bubble tooltip template of the shape layer in map
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the bubble valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.undefined
  }
  object LayersBubbleSettings {
    
    inline def apply(): LayersBubbleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettings]
    }
    
    extension [Self <: LayersBubbleSettings](x: Self) {
      
      inline def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
      
      inline def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorMappings(value: LayersBubbleSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      inline def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      inline def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setShowBubble(value: Boolean): Self = StObject.set(x, "showBubble", value.asInstanceOf[js.Any])
      
      inline def setShowBubbleUndefined: Self = StObject.set(x, "showBubble", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      inline def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      inline def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  trait LayersBubbleSettingsColorMappings extends StObject {
    
    /** Specifies the range colorMappings in the bubble layer.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]] = js.undefined
  }
  object LayersBubbleSettingsColorMappings {
    
    inline def apply(): LayersBubbleSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettingsColorMappings]
    }
    
    extension [Self <: LayersBubbleSettingsColorMappings](x: Self) {
      
      inline def setRangeColorMapping(value: js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      inline def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      inline def setRangeColorMappingVarargs(value: LayersBubbleSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value*))
    }
  }
  
  trait LayersBubbleSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Color of the bubble layer.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Start range colorMappings in the bubble layer.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** GradientColors in the bubble layer of map.
      */
    var gradientColors: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** End range colorMappings in the bubble layer.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object LayersBubbleSettingsColorMappingsRangeColorMapping {
    
    inline def apply(): LayersBubbleSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettingsColorMappingsRangeColorMapping]
    }
    
    extension [Self <: LayersBubbleSettingsColorMappingsRangeColorMapping](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGradientColors(value: js.Array[Any]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      inline def setGradientColorsVarargs(value: Any*): Self = StObject.set(x, "gradientColors", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait LayersLabelSettings extends StObject {
    
    /** enable or disable the enableSmartLabel property
      * @Default {false}
      */
    var enableSmartLabel: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[LayersLabelSettingsFont] = js.undefined
    
    /** set the labelLength property
      * @Default {'2'}
      */
    var labelLength: js.UndefOr[Double] = js.undefined
    
    /** set the labelPath property
      * @Default {null}
      */
    var labelPath: js.UndefOr[String] = js.undefined
    
    /** The property specifies whether to show labels or not.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** set the smartLabelSize property
      * @Default {fixed}
      */
    var smartLabelSize: js.UndefOr[LabelSize | String] = js.undefined
  }
  object LayersLabelSettings {
    
    inline def apply(): LayersLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLabelSettings]
    }
    
    extension [Self <: LayersLabelSettings](x: Self) {
      
      inline def setEnableSmartLabel(value: Boolean): Self = StObject.set(x, "enableSmartLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableSmartLabelUndefined: Self = StObject.set(x, "enableSmartLabel", js.undefined)
      
      inline def setFont(value: LayersLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabelLength(value: Double): Self = StObject.set(x, "labelLength", value.asInstanceOf[js.Any])
      
      inline def setLabelLengthUndefined: Self = StObject.set(x, "labelLength", js.undefined)
      
      inline def setLabelPath(value: String): Self = StObject.set(x, "labelPath", value.asInstanceOf[js.Any])
      
      inline def setLabelPathUndefined: Self = StObject.set(x, "labelPath", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setSmartLabelSize(value: LabelSize | String): Self = StObject.set(x, "smartLabelSize", value.asInstanceOf[js.Any])
      
      inline def setSmartLabelSizeUndefined: Self = StObject.set(x, "smartLabelSize", js.undefined)
    }
  }
  
  trait LayersLabelSettingsFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the data label.
      * @Default {normal.}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** NameType DescriptionRegularstring Specifies the font weight as regular.BoldstringSpecifies the font weight as bold.LighterstringSpecifies the font weight as lighter.
      * @Default {regular. See}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LayersLabelSettingsFont {
    
    inline def apply(): LayersLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLabelSettingsFont]
    }
    
    extension [Self <: LayersLabelSettingsFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LayersLegendSettings extends StObject {
    
    /** Determines whether the legend should be placed outside or inside the map bounds
      * @Default {false}
      */
    var dockOnMap: js.UndefOr[Boolean] = js.undefined
    
    /** Determines the legend placement and it is valid only when dockOnMap is true
      * @Default {top}
      */
    var dockPosition: js.UndefOr[DockPosition | String] = js.undefined
    
    /** height value for legend setting
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** to get icon value for legend setting
      * @Default {rectangle}
      */
    var icon: js.UndefOr[LegendIcons | String] = js.undefined
    
    /** icon height value for legend setting
      * @Default {20}
      */
    var iconHeight: js.UndefOr[Double] = js.undefined
    
    /** icon Width value for legend setting
      * @Default {20}
      */
    var iconWidth: js.UndefOr[Double] = js.undefined
    
    /** set the orientation of legend labels
      * @Default {vertical}
      */
    var labelOrientation: js.UndefOr[LabelOrientation | String] = js.undefined
    
    /** to get leftLabel value for legend setting
      * @Default {null}
      */
    var leftLabel: js.UndefOr[String] = js.undefined
    
    /** to get mode of legend setting
      * @Default {default}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** set the position of legend settings
      * @Default {topleft}
      */
    var position: js.UndefOr[Position | String] = js.undefined
    
    /** x position value for legend setting
      * @Default {0}
      */
    var positionX: js.UndefOr[Double] = js.undefined
    
    /** y position value for legend setting
      * @Default {0}
      */
    var positionY: js.UndefOr[Double] = js.undefined
    
    /** to get rightLabel value for legend setting
      * @Default {null}
      */
    var rightLabel: js.UndefOr[String] = js.undefined
    
    /** Enables or Disables the showLabels
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the showLegend
      * @Default {false}
      */
    var showLegend: js.UndefOr[Boolean] = js.undefined
    
    /** To get the field name in the datasource for generating legend items.
      * @Default {null}
      */
    var textPath: js.UndefOr[String] = js.undefined
    
    /** to get title of legend setting
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** Toggle the visibility of the legend.
      * @Default {false}
      */
    var toggleVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** to get type of legend setting
      * @Default {layers}
      */
    var `type`: js.UndefOr[LegendType | String] = js.undefined
    
    /** width value for legend setting
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LayersLegendSettings {
    
    inline def apply(): LayersLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLegendSettings]
    }
    
    extension [Self <: LayersLegendSettings](x: Self) {
      
      inline def setDockOnMap(value: Boolean): Self = StObject.set(x, "dockOnMap", value.asInstanceOf[js.Any])
      
      inline def setDockOnMapUndefined: Self = StObject.set(x, "dockOnMap", js.undefined)
      
      inline def setDockPosition(value: DockPosition | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      inline def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: LegendIcons | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
      
      inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      inline def setLabelOrientation(value: LabelOrientation | String): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
      
      inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
      
      inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
      
      inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
      
      inline def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      inline def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      inline def setTextPath(value: String): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      inline def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleVisibility(value: Boolean): Self = StObject.set(x, "toggleVisibility", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityUndefined: Self = StObject.set(x, "toggleVisibility", js.undefined)
      
      inline def setType(value: LegendType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LayersShapeSettings extends StObject {
    
    /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
      * @Default {false}
      */
    var autoFill: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersShapeSettingsColorMappings] = js.undefined
    
    /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
      * @Default {palette1}
      */
    var colorPalette: js.UndefOr[ColorPalette | String] = js.undefined
    
    /** Specifies the field name in the datasource that contains color values for each shapes.
      * @Default {null}
      */
    var colorPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.undefined
    
    /** Enables or Disables the gradient colors for map shapes.
      * @Default {false}
      */
    var enableGradient: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the shape fill color of the shape layer in map
      * @Default {#E5E5E5}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Specifies the mouse over width of the shape layer in map
      * @Default {1}
      */
    var highlightBorderWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var highlightColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the mouse over stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var highlightStroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection color of the shape layer in map
      * @Default {gray}
      */
    var selectionColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var selectionStroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection stroke width of the shape layer in map
      * @Default {1}
      */
    var selectionStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape stroke thickness value of the shape layer in map
      * @Default {0.2}
      */
    var strokeThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.undefined
  }
  object LayersShapeSettings {
    
    inline def apply(): LayersShapeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettings]
    }
    
    extension [Self <: LayersShapeSettings](x: Self) {
      
      inline def setAutoFill(value: Boolean): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
      
      inline def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
      
      inline def setColorMappings(value: LayersShapeSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      inline def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      inline def setColorPalette(value: ColorPalette | String): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      inline def setColorPaletteUndefined: Self = StObject.set(x, "colorPalette", js.undefined)
      
      inline def setColorPath(value: String): Self = StObject.set(x, "colorPath", value.asInstanceOf[js.Any])
      
      inline def setColorPathUndefined: Self = StObject.set(x, "colorPath", js.undefined)
      
      inline def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      inline def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      inline def setEnableGradient(value: Boolean): Self = StObject.set(x, "enableGradient", value.asInstanceOf[js.Any])
      
      inline def setEnableGradientUndefined: Self = StObject.set(x, "enableGradient", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHighlightBorderWidth(value: Double): Self = StObject.set(x, "highlightBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setHighlightBorderWidthUndefined: Self = StObject.set(x, "highlightBorderWidth", js.undefined)
      
      inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
      
      inline def setHighlightStroke(value: String): Self = StObject.set(x, "highlightStroke", value.asInstanceOf[js.Any])
      
      inline def setHighlightStrokeUndefined: Self = StObject.set(x, "highlightStroke", js.undefined)
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setSelectionStroke(value: String): Self = StObject.set(x, "selectionStroke", value.asInstanceOf[js.Any])
      
      inline def setSelectionStrokeUndefined: Self = StObject.set(x, "selectionStroke", js.undefined)
      
      inline def setSelectionStrokeWidth(value: Double): Self = StObject.set(x, "selectionStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setSelectionStrokeWidthUndefined: Self = StObject.set(x, "selectionStrokeWidth", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      inline def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  trait LayersShapeSettingsColorMappings extends StObject {
    
    /** Specifies the equalColorMapping in the shape layer of map.
      * @Default {null}
      */
    var equalColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]] = js.undefined
    
    /** Specifies the range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]] = js.undefined
  }
  object LayersShapeSettingsColorMappings {
    
    inline def apply(): LayersShapeSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappings]
    }
    
    extension [Self <: LayersShapeSettingsColorMappings](x: Self) {
      
      inline def setEqualColorMapping(value: js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]): Self = StObject.set(x, "equalColorMapping", value.asInstanceOf[js.Any])
      
      inline def setEqualColorMappingUndefined: Self = StObject.set(x, "equalColorMapping", js.undefined)
      
      inline def setEqualColorMappingVarargs(value: LayersShapeSettingsColorMappingsEqualColorMapping*): Self = StObject.set(x, "equalColorMapping", js.Array(value*))
      
      inline def setRangeColorMapping(value: js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      inline def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      inline def setRangeColorMappingVarargs(value: LayersShapeSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value*))
    }
  }
  
  trait LayersShapeSettingsColorMappingsEqualColorMapping extends StObject {
    
    /** Specifies the equalColorMapping color in the shape layer of map.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the equalColorMapping value in the shape layer of map.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object LayersShapeSettingsColorMappingsEqualColorMapping {
    
    inline def apply(): LayersShapeSettingsColorMappingsEqualColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappingsEqualColorMapping]
    }
    
    extension [Self <: LayersShapeSettingsColorMappingsEqualColorMapping](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait LayersShapeSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Specifies the start range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** Specifies the gradientColors in the shape layer of map.
      * @Default {null}
      */
    var gradientColors: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the to range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object LayersShapeSettingsColorMappingsRangeColorMapping {
    
    inline def apply(): LayersShapeSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappingsRangeColorMapping]
    }
    
    extension [Self <: LayersShapeSettingsColorMappingsRangeColorMapping](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGradientColors(value: js.Array[Any]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      inline def setGradientColorsVarargs(value: Any*): Self = StObject.set(x, "gradientColors", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait LayersSubLayer extends StObject {
    
    /** to get the type of bing map.
      * @Default {aerial}
      */
    var bingMapType: js.UndefOr[BingMapType | String] = js.undefined
    
    /** Specifies the bubble settings for map
      */
    var bubbleSettings: js.UndefOr[LayersSubLayersBubbleSettings] = js.undefined
    
    /** Specifies the datasource for the shape layer
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Enables or disables the shape mouse hover
      * @Default {false}
      */
    var enableMouseHover: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the shape selection
      * @Default {true}
      */
    var enableSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the map view type.
      * @Default {'geographic'}
      */
    var geometryType: js.UndefOr[GeometryType | String] = js.undefined
    
    /** to get the key of bing map
      * @Default {null}
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
      */
    var labelSettings: js.UndefOr[LayersSubLayersLabelSettings] = js.undefined
    
    /** Specifies the map type.
      * @Default {'geometry'}
      */
    var layerType: js.UndefOr[LayerType | String] = js.undefined
    
    /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
      */
    var legendSettings: js.UndefOr[LayersSubLayersLegendSettings] = js.undefined
    
    /** Specifies the map items template for shapes.
      */
    var mapItemsTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the map marker template for map layer.
      * @Default {null}
      */
    var markerTemplate: js.UndefOr[String] = js.undefined
    
    /** Specify markers for shape layer.
      */
    var markers: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specify selectedMapShapes for shape layer
      * @Default {[]}
      */
    var selectedMapShapes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
      * @Default {default}
      */
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.undefined
    
    /** Specifies the shape data for the shape layer
      */
    var shapeData: js.UndefOr[Any] = js.undefined
    
    /** Specifies the data path of shape
      */
    var shapeDataPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the data path of shape
      */
    var shapePropertyPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape settings of map layer
      */
    var shapeSettings: js.UndefOr[LayersSubLayersShapeSettings] = js.undefined
    
    /** Shows or hides the map items.
      * @Default {false}
      */
    var showMapItems: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the tooltip for shapes
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the tooltip template for shapes.
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL template for the OSM type map.
      * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
      */
    var urlTemplate: js.UndefOr[String] = js.undefined
  }
  object LayersSubLayer {
    
    inline def apply(): LayersSubLayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayer]
    }
    
    extension [Self <: LayersSubLayer](x: Self) {
      
      inline def setBingMapType(value: BingMapType | String): Self = StObject.set(x, "bingMapType", value.asInstanceOf[js.Any])
      
      inline def setBingMapTypeUndefined: Self = StObject.set(x, "bingMapType", js.undefined)
      
      inline def setBubbleSettings(value: LayersSubLayersBubbleSettings): Self = StObject.set(x, "bubbleSettings", value.asInstanceOf[js.Any])
      
      inline def setBubbleSettingsUndefined: Self = StObject.set(x, "bubbleSettings", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setEnableMouseHover(value: Boolean): Self = StObject.set(x, "enableMouseHover", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseHoverUndefined: Self = StObject.set(x, "enableMouseHover", js.undefined)
      
      inline def setEnableSelection(value: Boolean): Self = StObject.set(x, "enableSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectionUndefined: Self = StObject.set(x, "enableSelection", js.undefined)
      
      inline def setGeometryType(value: GeometryType | String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
      
      inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabelSettings(value: LayersSubLayersLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      inline def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      inline def setLayerType(value: LayerType | String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
      
      inline def setLayerTypeUndefined: Self = StObject.set(x, "layerType", js.undefined)
      
      inline def setLegendSettings(value: LayersSubLayersLegendSettings): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      inline def setLegendSettingsUndefined: Self = StObject.set(x, "legendSettings", js.undefined)
      
      inline def setMapItemsTemplate(value: String): Self = StObject.set(x, "mapItemsTemplate", value.asInstanceOf[js.Any])
      
      inline def setMapItemsTemplateUndefined: Self = StObject.set(x, "mapItemsTemplate", js.undefined)
      
      inline def setMarkerTemplate(value: String): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
      
      inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
      
      inline def setMarkers(value: js.Array[Any]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: Any*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setSelectedMapShapes(value: js.Array[Any]): Self = StObject.set(x, "selectedMapShapes", value.asInstanceOf[js.Any])
      
      inline def setSelectedMapShapesUndefined: Self = StObject.set(x, "selectedMapShapes", js.undefined)
      
      inline def setSelectedMapShapesVarargs(value: Any*): Self = StObject.set(x, "selectedMapShapes", js.Array(value*))
      
      inline def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShapeData(value: Any): Self = StObject.set(x, "shapeData", value.asInstanceOf[js.Any])
      
      inline def setShapeDataPath(value: String): Self = StObject.set(x, "shapeDataPath", value.asInstanceOf[js.Any])
      
      inline def setShapeDataPathUndefined: Self = StObject.set(x, "shapeDataPath", js.undefined)
      
      inline def setShapeDataUndefined: Self = StObject.set(x, "shapeData", js.undefined)
      
      inline def setShapePropertyPath(value: String): Self = StObject.set(x, "shapePropertyPath", value.asInstanceOf[js.Any])
      
      inline def setShapePropertyPathUndefined: Self = StObject.set(x, "shapePropertyPath", js.undefined)
      
      inline def setShapeSettings(value: LayersSubLayersShapeSettings): Self = StObject.set(x, "shapeSettings", value.asInstanceOf[js.Any])
      
      inline def setShapeSettingsUndefined: Self = StObject.set(x, "shapeSettings", js.undefined)
      
      inline def setShowMapItems(value: Boolean): Self = StObject.set(x, "showMapItems", value.asInstanceOf[js.Any])
      
      inline def setShowMapItemsUndefined: Self = StObject.set(x, "showMapItems", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
      
      inline def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
    }
  }
  
  trait LayersSubLayersBubbleSettings extends StObject {
    
    /** Specifies the bubble Opacity value of bubbles for shape layer in map
      * @Default {0.9}
      */
    var bubbleOpacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersSubLayersBubbleSettingsColorMappings] = js.undefined
    
    /** Specifies the field name in the datasource that contains color values for each bubbles.
      * @Default {null}
      */
    var colorPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the bubble color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum size value of bubbles for shape layer in map
      * @Default {20}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum size value of bubbles for shape layer in map
      * @Default {10}
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the showBubble visibility status map
      * @Default {true}
      */
    var showBubble: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the tooltip visibility status of the shape layer in map
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the bubble tooltip template of the shape layer in map
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the bubble valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.undefined
  }
  object LayersSubLayersBubbleSettings {
    
    inline def apply(): LayersSubLayersBubbleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettings]
    }
    
    extension [Self <: LayersSubLayersBubbleSettings](x: Self) {
      
      inline def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
      
      inline def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorMappings(value: LayersSubLayersBubbleSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      inline def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      inline def setColorPath(value: String): Self = StObject.set(x, "colorPath", value.asInstanceOf[js.Any])
      
      inline def setColorPathUndefined: Self = StObject.set(x, "colorPath", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      inline def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setShowBubble(value: Boolean): Self = StObject.set(x, "showBubble", value.asInstanceOf[js.Any])
      
      inline def setShowBubbleUndefined: Self = StObject.set(x, "showBubble", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      inline def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      inline def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  trait LayersSubLayersBubbleSettingsColorMappings extends StObject {
    
    /** Specifies the range colorMappings in the bubble layer.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]] = js.undefined
  }
  object LayersSubLayersBubbleSettingsColorMappings {
    
    inline def apply(): LayersSubLayersBubbleSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappings]
    }
    
    extension [Self <: LayersSubLayersBubbleSettingsColorMappings](x: Self) {
      
      inline def setRangeColorMapping(value: js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      inline def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      inline def setRangeColorMappingVarargs(value: LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value*))
    }
  }
  
  trait LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Color of the bubble layer.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Start range colorMappings in the bubble layer.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** GradientColors in the bubble layer of map.
      */
    var gradientColors: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** End range colorMappings in the bubble layer.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping {
    
    inline def apply(): LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]
    }
    
    extension [Self <: LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGradientColors(value: js.Array[Any]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      inline def setGradientColorsVarargs(value: Any*): Self = StObject.set(x, "gradientColors", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait LayersSubLayersLabelSettings extends StObject {
    
    /** enable or disable the enableSmartLabel property
      * @Default {false}
      */
    var enableSmartLabel: js.UndefOr[Boolean] = js.undefined
    
    /** set the labelLength property
      * @Default {'2'}
      */
    var labelLength: js.UndefOr[Double] = js.undefined
    
    /** set the labelPath property
      * @Default {null}
      */
    var labelPath: js.UndefOr[String] = js.undefined
    
    /** The property specifies whether to show labels or not.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** set the smartLabelSize property
      * @Default {fixed}
      */
    var smartLabelSize: js.UndefOr[LabelSize | String] = js.undefined
  }
  object LayersSubLayersLabelSettings {
    
    inline def apply(): LayersSubLayersLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersLabelSettings]
    }
    
    extension [Self <: LayersSubLayersLabelSettings](x: Self) {
      
      inline def setEnableSmartLabel(value: Boolean): Self = StObject.set(x, "enableSmartLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableSmartLabelUndefined: Self = StObject.set(x, "enableSmartLabel", js.undefined)
      
      inline def setLabelLength(value: Double): Self = StObject.set(x, "labelLength", value.asInstanceOf[js.Any])
      
      inline def setLabelLengthUndefined: Self = StObject.set(x, "labelLength", js.undefined)
      
      inline def setLabelPath(value: String): Self = StObject.set(x, "labelPath", value.asInstanceOf[js.Any])
      
      inline def setLabelPathUndefined: Self = StObject.set(x, "labelPath", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setSmartLabelSize(value: LabelSize | String): Self = StObject.set(x, "smartLabelSize", value.asInstanceOf[js.Any])
      
      inline def setSmartLabelSizeUndefined: Self = StObject.set(x, "smartLabelSize", js.undefined)
    }
  }
  
  trait LayersSubLayersLegendSettings extends StObject {
    
    /** Determines whether the legend should be placed outside or inside the map bounds
      * @Default {false}
      */
    var dockOnMap: js.UndefOr[Boolean] = js.undefined
    
    /** Determines the legend placement and it is valid only when dockOnMap is true
      * @Default {top}
      */
    var dockPosition: js.UndefOr[DockPosition | String] = js.undefined
    
    /** height value for legend setting
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** to get icon value for legend setting
      * @Default {rectangle}
      */
    var icon: js.UndefOr[LegendIcons | String] = js.undefined
    
    /** icon height value for legend setting
      * @Default {20}
      */
    var iconHeight: js.UndefOr[Double] = js.undefined
    
    /** icon Width value for legend setting
      * @Default {20}
      */
    var iconWidth: js.UndefOr[Double] = js.undefined
    
    /** set the orientation of legend labels
      * @Default {vertical}
      */
    var labelOrientation: js.UndefOr[LabelOrientation | String] = js.undefined
    
    /** to get leftLabel value for legend setting
      * @Default {null}
      */
    var leftLabel: js.UndefOr[String] = js.undefined
    
    /** to get mode of legend setting
      * @Default {default}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** set the position of legend settings
      * @Default {topleft}
      */
    var position: js.UndefOr[Position | String] = js.undefined
    
    /** x position value for legend setting
      * @Default {0}
      */
    var positionX: js.UndefOr[Double] = js.undefined
    
    /** y position value for legend setting
      * @Default {0}
      */
    var positionY: js.UndefOr[Double] = js.undefined
    
    /** to get rightLabel value for legend setting
      * @Default {null}
      */
    var rightLabel: js.UndefOr[String] = js.undefined
    
    /** Enables or Disables the showLabels
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the showLegend
      * @Default {false}
      */
    var showLegend: js.UndefOr[Boolean] = js.undefined
    
    /** To get the field name in the datasource for generating legend items.
      * @Default {null}
      */
    var textPath: js.UndefOr[String] = js.undefined
    
    /** to get title of legend setting
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** to get type of legend setting
      * @Default {layers}
      */
    var `type`: js.UndefOr[LegendType | String] = js.undefined
    
    /** width value for legend setting
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LayersSubLayersLegendSettings {
    
    inline def apply(): LayersSubLayersLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersLegendSettings]
    }
    
    extension [Self <: LayersSubLayersLegendSettings](x: Self) {
      
      inline def setDockOnMap(value: Boolean): Self = StObject.set(x, "dockOnMap", value.asInstanceOf[js.Any])
      
      inline def setDockOnMapUndefined: Self = StObject.set(x, "dockOnMap", js.undefined)
      
      inline def setDockPosition(value: DockPosition | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      inline def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: LegendIcons | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
      
      inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      inline def setLabelOrientation(value: LabelOrientation | String): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
      
      inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
      
      inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
      
      inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
      
      inline def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      inline def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      inline def setTextPath(value: String): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      inline def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: LegendType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LayersSubLayersShapeSettings extends StObject {
    
    /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
      * @Default {false}
      */
    var autoFill: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersSubLayersShapeSettingsColorMappings] = js.undefined
    
    /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
      * @Default {palette1}
      */
    var colorPalette: js.UndefOr[ColorPalette | String] = js.undefined
    
    /** Specifies the shape color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.undefined
    
    /** Enables or Disables the gradient colors for map shapes.
      * @Default {false}
      */
    var enableGradient: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the shape fill color of the shape layer in map
      * @Default {#E5E5E5}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Specifies the mouse over width of the shape layer in map
      * @Default {1}
      */
    var highlightBorderWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var highlightColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the mouse over stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var highlightStroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection color of the shape layer in map
      * @Default {gray}
      */
    var selectionColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var selectionStroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape selection stroke width of the shape layer in map
      * @Default {1}
      */
    var selectionStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the shape stroke thickness value of the shape layer in map
      * @Default {0.2}
      */
    var strokeThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.undefined
  }
  object LayersSubLayersShapeSettings {
    
    inline def apply(): LayersSubLayersShapeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettings]
    }
    
    extension [Self <: LayersSubLayersShapeSettings](x: Self) {
      
      inline def setAutoFill(value: Boolean): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
      
      inline def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
      
      inline def setColorMappings(value: LayersSubLayersShapeSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      inline def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      inline def setColorPalette(value: ColorPalette | String): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      inline def setColorPaletteUndefined: Self = StObject.set(x, "colorPalette", js.undefined)
      
      inline def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      inline def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      inline def setEnableGradient(value: Boolean): Self = StObject.set(x, "enableGradient", value.asInstanceOf[js.Any])
      
      inline def setEnableGradientUndefined: Self = StObject.set(x, "enableGradient", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHighlightBorderWidth(value: Double): Self = StObject.set(x, "highlightBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setHighlightBorderWidthUndefined: Self = StObject.set(x, "highlightBorderWidth", js.undefined)
      
      inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
      
      inline def setHighlightStroke(value: String): Self = StObject.set(x, "highlightStroke", value.asInstanceOf[js.Any])
      
      inline def setHighlightStrokeUndefined: Self = StObject.set(x, "highlightStroke", js.undefined)
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setSelectionStroke(value: String): Self = StObject.set(x, "selectionStroke", value.asInstanceOf[js.Any])
      
      inline def setSelectionStrokeUndefined: Self = StObject.set(x, "selectionStroke", js.undefined)
      
      inline def setSelectionStrokeWidth(value: Double): Self = StObject.set(x, "selectionStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setSelectionStrokeWidthUndefined: Self = StObject.set(x, "selectionStrokeWidth", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      inline def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  trait LayersSubLayersShapeSettingsColorMappings extends StObject {
    
    /** Specifies the equalColorMapping in the shape layer of map.
      * @Default {null}
      */
    var equalColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]] = js.undefined
    
    /** Specifies the range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]] = js.undefined
  }
  object LayersSubLayersShapeSettingsColorMappings {
    
    inline def apply(): LayersSubLayersShapeSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappings]
    }
    
    extension [Self <: LayersSubLayersShapeSettingsColorMappings](x: Self) {
      
      inline def setEqualColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]): Self = StObject.set(x, "equalColorMapping", value.asInstanceOf[js.Any])
      
      inline def setEqualColorMappingUndefined: Self = StObject.set(x, "equalColorMapping", js.undefined)
      
      inline def setEqualColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping*): Self = StObject.set(x, "equalColorMapping", js.Array(value*))
      
      inline def setRangeColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      inline def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      inline def setRangeColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value*))
    }
  }
  
  trait LayersSubLayersShapeSettingsColorMappingsEqualColorMapping extends StObject {
    
    /** Specifies the equalColorMapping color in the shape layer of map.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the equalColorMapping value in the shape layer of map.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object LayersSubLayersShapeSettingsColorMappingsEqualColorMapping {
    
    inline def apply(): LayersSubLayersShapeSettingsColorMappingsEqualColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]
    }
    
    extension [Self <: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait LayersSubLayersShapeSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Specifies the start range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** Specifies the gradientColors in the shape layer of map.
      * @Default {null}
      */
    var gradientColors: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the to range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object LayersSubLayersShapeSettingsColorMappingsRangeColorMapping {
    
    inline def apply(): LayersSubLayersShapeSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]
    }
    
    extension [Self <: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGradientColors(value: js.Array[Any]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      inline def setGradientColorsVarargs(value: Any*): Self = StObject.set(x, "gradientColors", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** startX - X-coordinate of legend item in pixel        LegendItem - Instance of the legend item object that is about to be rendered    style - Options to customize the legend item
      * styles such as border, color, size, etcâ€¦,        symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    map - Instance
      * of the map object corresponding to the legend item
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendItemClickEventArgs {
    
    inline def apply(): LegendItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemClickEventArgs]
    }
    
    extension [Self <: LegendItemClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LegendItemRenderingEventArgs extends StObject {
    
    /** Returns the legend item.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object LegendItemRenderingEventArgs {
    
    inline def apply(): LegendItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderingEventArgs]
    }
    
    extension [Self <: LegendItemRenderingEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait MarkerEnterEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MarkerEnterEventArgs {
    
    inline def apply(): MarkerEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerEnterEventArgs]
    }
    
    extension [Self <: MarkerEnterEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MarkerLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MarkerLeaveEventArgs {
    
    inline def apply(): MarkerLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerLeaveEventArgs]
    }
    
    extension [Self <: MarkerLeaveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MarkerSelectedEventArgs extends StObject {
    
    /** Returns marker object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object MarkerSelectedEventArgs {
    
    inline def apply(): MarkerSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSelectedEventArgs]
    }
    
    extension [Self <: MarkerSelectedEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the map.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the background color for map
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Specifies the index of the map to determine the shape layer to be displayed
      * @Default {0}
      */
    var baseMapIndex: js.UndefOr[Double] = js.undefined
    
    /** Triggered while rendering the each bubbles in maps.
      */
    var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, Unit]] = js.undefined
    
    /** Specify the center position where map should be displayed
      * @Default {[0,0]}
      */
    var centerPosition: js.UndefOr[Any] = js.undefined
    
    /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
      */
    var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, Unit]] = js.undefined
    
    /** Fires, on double clicking the map.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Controls the selection through dragging
      * @Default {false}
      */
    var draggingOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the map animation
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the animation for layer change in map
      * @Default {false}
      */
    var enableLayerChangeAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the map panning
      * @Default {true}
      */
    var enablePan: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables right to left(RTL) support for maps.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Determines whether map need to resize when container is resized
      * @Default {true}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** Determines whether map need to resize when container is resized
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Layer for holding the map shapes
      */
    var layers: js.UndefOr[js.Array[Layer]] = js.undefined
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.undefined
    
    /** Triggered while rendering the each legend in maps.
      */
    var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.undefined
    
    /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
      * automatically. Provide localized text as value to string type properties.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Triggers while entering the hovered marker shape.
      */
    var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, Unit]] = js.undefined
    
    /** Triggers while leaving the hovered marker shape.
      */
    var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, Unit]] = js.undefined
    
    /** Triggered on selecting the map markers.
      */
    var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggers while leaving the hovered map shape
      */
    var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, Unit]] = js.undefined
    
    /** Triggers while hovering the map shape.
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
    
    /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
      */
    var navigationControl: js.UndefOr[NavigationControl] = js.undefined
    
    /** Fires before loading the map.
      */
    var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, Unit]] = js.undefined
    
    /** Triggers once map render completed.
      */
    var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when map panning ends.
      */
    var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, Unit]] = js.undefined
    
    /** Triggers after refreshing the map items.
      */
    var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.undefined
    
    /** Fires, on right clicking the map.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Triggered while rendering the each shapes in maps.
      */
    var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, Unit]] = js.undefined
    
    /** Triggered on selecting the map shapes.
      */
    var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, Unit]] = js.undefined
    
    /** Enables or Disables the Zooming for map.
      */
    var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
    
    /** Triggered when map is zoomed-in.
      */
    var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, Unit]] = js.undefined
    
    /** Triggers when map is zoomed out.
      */
    var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, Unit]] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.Map.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Map.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.datavisualization.Map.Model](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBaseMapIndex(value: Double): Self = StObject.set(x, "baseMapIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseMapIndexUndefined: Self = StObject.set(x, "baseMapIndex", js.undefined)
      
      inline def setBubbleRendering(value: /* e */ BubbleRenderingEventArgs => Unit): Self = StObject.set(x, "bubbleRendering", js.Any.fromFunction1(value))
      
      inline def setBubbleRenderingUndefined: Self = StObject.set(x, "bubbleRendering", js.undefined)
      
      inline def setCenterPosition(value: Any): Self = StObject.set(x, "centerPosition", value.asInstanceOf[js.Any])
      
      inline def setCenterPositionUndefined: Self = StObject.set(x, "centerPosition", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => Unit): Self = StObject.set(x, "displayTextRendering", js.Any.fromFunction1(value))
      
      inline def setDisplayTextRenderingUndefined: Self = StObject.set(x, "displayTextRendering", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setDraggingOnSelection(value: Boolean): Self = StObject.set(x, "draggingOnSelection", value.asInstanceOf[js.Any])
      
      inline def setDraggingOnSelectionUndefined: Self = StObject.set(x, "draggingOnSelection", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableLayerChangeAnimation(value: Boolean): Self = StObject.set(x, "enableLayerChangeAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableLayerChangeAnimationUndefined: Self = StObject.set(x, "enableLayerChangeAnimation", js.undefined)
      
      inline def setEnablePan(value: Boolean): Self = StObject.set(x, "enablePan", value.asInstanceOf[js.Any])
      
      inline def setEnablePanUndefined: Self = StObject.set(x, "enablePan", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      inline def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = StObject.set(x, "legendItemRendering", js.Any.fromFunction1(value))
      
      inline def setLegendItemRenderingUndefined: Self = StObject.set(x, "legendItemRendering", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMarkerEnter(value: /* e */ MarkerEnterEventArgs => Unit): Self = StObject.set(x, "markerEnter", js.Any.fromFunction1(value))
      
      inline def setMarkerEnterUndefined: Self = StObject.set(x, "markerEnter", js.undefined)
      
      inline def setMarkerLeave(value: /* e */ MarkerLeaveEventArgs => Unit): Self = StObject.set(x, "markerLeave", js.Any.fromFunction1(value))
      
      inline def setMarkerLeaveUndefined: Self = StObject.set(x, "markerLeave", js.undefined)
      
      inline def setMarkerSelected(value: /* e */ MarkerSelectedEventArgs => Unit): Self = StObject.set(x, "markerSelected", js.Any.fromFunction1(value))
      
      inline def setMarkerSelectedUndefined: Self = StObject.set(x, "markerSelected", js.undefined)
      
      inline def setMouseleave(value: /* e */ MouseleaveEventArgs => Unit): Self = StObject.set(x, "mouseleave", js.Any.fromFunction1(value))
      
      inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      inline def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      inline def setNavigationControl(value: NavigationControl): Self = StObject.set(x, "navigationControl", value.asInstanceOf[js.Any])
      
      inline def setNavigationControlUndefined: Self = StObject.set(x, "navigationControl", js.undefined)
      
      inline def setOnLoad(value: /* e */ OnLoadEventArgs => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnRenderComplete(value: /* e */ OnRenderCompleteEventArgs => Unit): Self = StObject.set(x, "onRenderComplete", js.Any.fromFunction1(value))
      
      inline def setOnRenderCompleteUndefined: Self = StObject.set(x, "onRenderComplete", js.undefined)
      
      inline def setPanned(value: /* e */ PannedEventArgs => Unit): Self = StObject.set(x, "panned", js.Any.fromFunction1(value))
      
      inline def setPannedUndefined: Self = StObject.set(x, "panned", js.undefined)
      
      inline def setRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = StObject.set(x, "refreshed", js.Any.fromFunction1(value))
      
      inline def setRefreshedUndefined: Self = StObject.set(x, "refreshed", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setShapeRendering(value: /* e */ ShapeRenderingEventArgs => Unit): Self = StObject.set(x, "shapeRendering", js.Any.fromFunction1(value))
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setShapeSelected(value: /* e */ ShapeSelectedEventArgs => Unit): Self = StObject.set(x, "shapeSelected", js.Any.fromFunction1(value))
      
      inline def setShapeSelectedUndefined: Self = StObject.set(x, "shapeSelected", js.undefined)
      
      inline def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
      
      inline def setZoomSettingsUndefined: Self = StObject.set(x, "zoomSettings", js.undefined)
      
      inline def setZoomedIn(value: /* e */ ZoomedInEventArgs => Unit): Self = StObject.set(x, "zoomedIn", js.Any.fromFunction1(value))
      
      inline def setZoomedInUndefined: Self = StObject.set(x, "zoomedIn", js.undefined)
      
      inline def setZoomedOut(value: /* e */ ZoomedOutEventArgs => Unit): Self = StObject.set(x, "zoomedOut", js.Any.fromFunction1(value))
      
      inline def setZoomedOutUndefined: Self = StObject.set(x, "zoomedOut", js.undefined)
    }
  }
  
  trait MouseleaveEventArgs extends StObject {
    
    /** Returns hovered map shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object MouseleaveEventArgs {
    
    inline def apply(): MouseleaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseleaveEventArgs]
    }
    
    extension [Self <: MouseleaveEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait MouseoverEventArgs extends StObject {
    
    /** Returns hovered map shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object MouseoverEventArgs {
    
    inline def apply(): MouseoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoverEventArgs]
    }
    
    extension [Self <: MouseoverEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait NavigationControl extends StObject {
    
    /** Set the absolutePosition for navigation control
      * @Default {{x:0,y:0}}
      */
    var absolutePosition: js.UndefOr[Any] = js.undefined
    
    /** Specifies the navigation control template for map
      * @Default {null}
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** Set the dockPosition value for navigation control
      * @Default {centerleft}
      */
    var dockPosition: js.UndefOr[Position | String] = js.undefined
    
    /** Enables or Disables the Navigation for handling zooming map
      * @Default {false}
      */
    var enableNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Set the orientation value for navigation control
      * @Default {vertical}
      */
    var orientation: js.UndefOr[LabelOrientation | String] = js.undefined
  }
  object NavigationControl {
    
    inline def apply(): NavigationControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationControl]
    }
    
    extension [Self <: NavigationControl](x: Self) {
      
      inline def setAbsolutePosition(value: Any): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDockPosition(value: Position | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      inline def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      inline def setEnableNavigation(value: Boolean): Self = StObject.set(x, "enableNavigation", value.asInstanceOf[js.Any])
      
      inline def setEnableNavigationUndefined: Self = StObject.set(x, "enableNavigation", js.undefined)
      
      inline def setOrientation(value: LabelOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  trait OnLoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OnLoadEventArgs {
    
    inline def apply(): OnLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnLoadEventArgs]
    }
    
    extension [Self <: OnLoadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OnRenderCompleteEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object OnRenderCompleteEventArgs {
    
    inline def apply(): OnRenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRenderCompleteEventArgs]
    }
    
    extension [Self <: OnRenderCompleteEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait PannedEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object PannedEventArgs {
    
    inline def apply(): PannedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PannedEventArgs]
    }
    
    extension [Self <: PannedEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait RefreshedEventArgs extends StObject {
    
    /** Refresh and load the map.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object RefreshedEventArgs {
    
    inline def apply(): RefreshedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshedEventArgs]
    }
    
    extension [Self <: RefreshedEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Returns right clicked shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    extension [Self <: RightClickEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait ShapeRenderingEventArgs extends StObject {
    
    /** Returns the shape values.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object ShapeRenderingEventArgs {
    
    inline def apply(): ShapeRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeRenderingEventArgs]
    }
    
    extension [Self <: ShapeRenderingEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait ShapeSelectedEventArgs extends StObject {
    
    /** Returns selected shape object.
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
  }
  object ShapeSelectedEventArgs {
    
    inline def apply(): ShapeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeSelectedEventArgs]
    }
    
    extension [Self <: ShapeSelectedEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait ZoomSettings extends StObject {
    
    /** Specifies animation duration for map shapes while zooming.
      * @Default {600}
      */
    var animationDuration: js.UndefOr[String] = js.undefined
    
    /** Enables or Disables the zoom on mouse wheel the map.
      * @Default {true}
      */
    var enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the zooming of map
      * @Default {true}
      */
    var enableZoom: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disables the zoom on selecting the map shape
      * @Default {false}
      */
    var enableZoomOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the zoom factor for map zoom value.
      * @Default {1}
      */
    var factor: js.UndefOr[Double] = js.undefined
    
    /** Specifies the zoom level value for which map to be zoomed
      * @Default {1}
      */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Specifies the maximum zoom level of the map
      * @Default {100}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum zoomSettings level of the map
      * @Default {1}
      */
    var minValue: js.UndefOr[Double] = js.undefined
  }
  object ZoomSettings {
    
    inline def apply(): ZoomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSettings]
    }
    
    extension [Self <: ZoomSettings](x: Self) {
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setEnableMouseWheelZoom(value: Boolean): Self = StObject.set(x, "enableMouseWheelZoom", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseWheelZoomUndefined: Self = StObject.set(x, "enableMouseWheelZoom", js.undefined)
      
      inline def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      inline def setEnableZoomOnSelection(value: Boolean): Self = StObject.set(x, "enableZoomOnSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableZoomOnSelectionUndefined: Self = StObject.set(x, "enableZoomOnSelection", js.undefined)
      
      inline def setEnableZoomUndefined: Self = StObject.set(x, "enableZoom", js.undefined)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    }
  }
  
  trait ZoomedInEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
    
    /** Returns zoom level value for which the map is zoomed.
      */
    var zoomLevel: js.UndefOr[Any] = js.undefined
  }
  object ZoomedInEventArgs {
    
    inline def apply(): ZoomedInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedInEventArgs]
    }
    
    extension [Self <: ZoomedInEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setZoomLevel(value: Any): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
    }
  }
  
  trait ZoomedOutEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[Any] = js.undefined
    
    /** Returns zoom level value for which the map is zoomed.
      */
    var zoomLevel: js.UndefOr[Any] = js.undefined
  }
  object ZoomedOutEventArgs {
    
    inline def apply(): ZoomedOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedOutEventArgs]
    }
    
    extension [Self <: ZoomedOutEventArgs](x: Self) {
      
      inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setZoomLevel(value: Any): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
    }
  }
}
