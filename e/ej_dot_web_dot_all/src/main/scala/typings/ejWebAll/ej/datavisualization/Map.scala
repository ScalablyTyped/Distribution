package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends Widget_ {
  
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
  def refreshNavigationControl(navigation: js.Any): Unit = js.native
  
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
    sealed trait Aerial extends BingMapType
    
    //specifies the aerialwithlabel type
    @js.native
    sealed trait Aerialwithlabel extends BingMapType
    
    //specifies the road type
    @js.native
    sealed trait Road extends BingMapType
  }
  
  @js.native
  sealed trait ColorPalette extends StObject
  @JSGlobal("ej.datavisualization.Map.ColorPalette")
  @js.native
  object ColorPalette extends StObject {
    
    //specifies the custom color
    @js.native
    sealed trait Custompalette extends ColorPalette
    
    //specifies the palette1 color
    @js.native
    sealed trait Palette1 extends ColorPalette
    
    //specifies the palette2 color
    @js.native
    sealed trait Palette2 extends ColorPalette
    
    //specifies the palette3 color
    @js.native
    sealed trait Palette3 extends ColorPalette
  }
  
  @js.native
  sealed trait DockPosition extends StObject
  @JSGlobal("ej.datavisualization.Map.DockPosition")
  @js.native
  object DockPosition extends StObject {
    
    //specifies the bottom position
    @js.native
    sealed trait Bottom extends DockPosition
    
    //specifies the left position
    @js.native
    sealed trait Left extends DockPosition
    
    //specifies the bottom position
    @js.native
    sealed trait Right extends DockPosition
    
    //specifies the top position
    @js.native
    sealed trait Top extends DockPosition
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.Map.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic extends FontStyle
    
    //string
    @js.native
    sealed trait Normal extends FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Map.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold extends FontWeight
    
    //string
    @js.native
    sealed trait Lighter extends FontWeight
    
    //string
    @js.native
    sealed trait Regular extends FontWeight
  }
  
  @js.native
  sealed trait GeometryType extends StObject
  @JSGlobal("ej.datavisualization.Map.GeometryType")
  @js.native
  object GeometryType extends StObject {
    
    //specifies the geographic view of map
    @js.native
    sealed trait Geographic extends GeometryType
    
    //specifies the normal land view of map
    @js.native
    sealed trait Normal extends GeometryType
  }
  
  @js.native
  sealed trait LabelOrientation extends StObject
  @JSGlobal("ej.datavisualization.Map.LabelOrientation")
  @js.native
  object LabelOrientation extends StObject {
    
    //specifies the horizontal position
    @js.native
    sealed trait Horizontal extends LabelOrientation
    
    //specifies the vertical position
    @js.native
    sealed trait Vertical extends LabelOrientation
  }
  
  @js.native
  sealed trait LabelSize extends StObject
  @JSGlobal("ej.datavisualization.Map.LabelSize")
  @js.native
  object LabelSize extends StObject {
    
    //specifies the default size
    @js.native
    sealed trait Default extends LabelSize
    
    //specifies the fixed size
    @js.native
    sealed trait Fixed extends LabelSize
  }
  
  @js.native
  sealed trait LayerType extends StObject
  @JSGlobal("ej.datavisualization.Map.LayerType")
  @js.native
  object LayerType extends StObject {
    
    //specifies the bing type
    @js.native
    sealed trait Bing extends LayerType
    
    //specifies the geometry type
    @js.native
    sealed trait Geometry extends LayerType
    
    //specifies the osm type
    @js.native
    sealed trait Osm extends LayerType
  }
  
  @js.native
  sealed trait LegendIcons extends StObject
  @JSGlobal("ej.datavisualization.Map.LegendIcons")
  @js.native
  object LegendIcons extends StObject {
    
    //specifies the circle position
    @js.native
    sealed trait Circle extends LegendIcons
    
    //specifies the rectangle position
    @js.native
    sealed trait Rectangle extends LegendIcons
  }
  
  @js.native
  sealed trait LegendType extends StObject
  @JSGlobal("ej.datavisualization.Map.LegendType")
  @js.native
  object LegendType extends StObject {
    
    //specifies the bubbles type
    @js.native
    sealed trait Bubbles extends LegendType
    
    //specifies the layers type
    @js.native
    sealed trait Layers extends LegendType
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("ej.datavisualization.Map.Mode")
  @js.native
  object Mode extends StObject {
    
    //specifies the default mode
    @js.native
    sealed trait Default extends Mode
    
    //specifies the interactive mode
    @js.native
    sealed trait Interactive extends Mode
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.Map.Position")
  @js.native
  object Position extends StObject {
    
    //specifies the bottomcenter position
    @js.native
    sealed trait Bottomcenter extends Position
    
    //specifies the bottomleft position
    @js.native
    sealed trait Bottomleft extends Position
    
    //specifies the bottomright position
    @js.native
    sealed trait Bottomright extends Position
    
    //specifies the center position
    @js.native
    sealed trait Center extends Position
    
    //specifies the centerleft position
    @js.native
    sealed trait Centerleft extends Position
    
    //specifies the centerright position
    @js.native
    sealed trait Centerright extends Position
    
    //specifies the none position
    @js.native
    sealed trait None extends Position
    
    //specifies the topcenter position
    @js.native
    sealed trait Topcenter extends Position
    
    //specifies the topleft position
    @js.native
    sealed trait Topleft extends Position
    
    //specifies the topright position
    @js.native
    sealed trait Topright extends Position
  }
  
  @js.native
  sealed trait SelectionMode extends StObject
  @JSGlobal("ej.datavisualization.Map.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    //specifies the default position
    @js.native
    sealed trait Default extends SelectionMode
    
    //specifies the multiple position
    @js.native
    sealed trait Multiple extends SelectionMode
  }
  
  @js.native
  trait BubbleRenderingEventArgs extends StObject {
    
    /** Returns the bubble values.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object BubbleRenderingEventArgs {
    
    @scala.inline
    def apply(): BubbleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BubbleRenderingEventArgs]
    }
    
    @scala.inline
    implicit class BubbleRenderingEventArgsMutableBuilder[Self <: BubbleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** Returns clicked shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait DisplayTextRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
      * location
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the map model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DisplayTextRenderingEventArgs {
    
    @scala.inline
    def apply(): DisplayTextRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTextRenderingEventArgs]
    }
    
    @scala.inline
    implicit class DisplayTextRenderingEventArgsMutableBuilder[Self <: DisplayTextRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** Returns double clicked shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait Layer extends StObject {
    
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
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.native
    
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
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBingMapType(value: BingMapType | String): Self = StObject.set(x, "bingMapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBingMapTypeUndefined: Self = StObject.set(x, "bingMapType", js.undefined)
      
      @scala.inline
      def setBubbleSettings(value: LayersBubbleSettings): Self = StObject.set(x, "bubbleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleSettingsUndefined: Self = StObject.set(x, "bubbleSettings", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setEnableMouseHover(value: Boolean): Self = StObject.set(x, "enableMouseHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseHoverUndefined: Self = StObject.set(x, "enableMouseHover", js.undefined)
      
      @scala.inline
      def setEnableSelection(value: Boolean): Self = StObject.set(x, "enableSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectionUndefined: Self = StObject.set(x, "enableSelection", js.undefined)
      
      @scala.inline
      def setGeometryType(value: GeometryType | String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabelSettings(value: LayersLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      @scala.inline
      def setLayerType(value: LayerType | String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerTypeUndefined: Self = StObject.set(x, "layerType", js.undefined)
      
      @scala.inline
      def setLegendSettings(value: LayersLegendSettings): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendSettingsUndefined: Self = StObject.set(x, "legendSettings", js.undefined)
      
      @scala.inline
      def setMapItemsTemplate(value: String): Self = StObject.set(x, "mapItemsTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapItemsTemplateUndefined: Self = StObject.set(x, "mapItemsTemplate", js.undefined)
      
      @scala.inline
      def setMarkerTemplate(value: String): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
      
      @scala.inline
      def setMarkers(value: js.Array[_]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMarkersVarargs(value: js.Any*): Self = StObject.set(x, "markers", js.Array(value :_*))
      
      @scala.inline
      def setSelectedMapShapes(value: js.Array[_]): Self = StObject.set(x, "selectedMapShapes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMapShapesUndefined: Self = StObject.set(x, "selectedMapShapes", js.undefined)
      
      @scala.inline
      def setSelectedMapShapesVarargs(value: js.Any*): Self = StObject.set(x, "selectedMapShapes", js.Array(value :_*))
      
      @scala.inline
      def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShapeData(value: js.Any): Self = StObject.set(x, "shapeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeDataPath(value: String): Self = StObject.set(x, "shapeDataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeDataPathUndefined: Self = StObject.set(x, "shapeDataPath", js.undefined)
      
      @scala.inline
      def setShapeDataUndefined: Self = StObject.set(x, "shapeData", js.undefined)
      
      @scala.inline
      def setShapePropertyPath(value: String): Self = StObject.set(x, "shapePropertyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapePropertyPathUndefined: Self = StObject.set(x, "shapePropertyPath", js.undefined)
      
      @scala.inline
      def setShapeSettings(value: LayersShapeSettings): Self = StObject.set(x, "shapeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeSettingsUndefined: Self = StObject.set(x, "shapeSettings", js.undefined)
      
      @scala.inline
      def setShowMapItems(value: Boolean): Self = StObject.set(x, "showMapItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMapItemsUndefined: Self = StObject.set(x, "showMapItems", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setSubLayers(value: js.Array[LayersSubLayer]): Self = StObject.set(x, "subLayers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubLayersUndefined: Self = StObject.set(x, "subLayers", js.undefined)
      
      @scala.inline
      def setSubLayersVarargs(value: LayersSubLayer*): Self = StObject.set(x, "subLayers", js.Array(value :_*))
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
    }
  }
  
  @js.native
  trait LayersBubbleSettings extends StObject {
    
    /** Specifies the bubble Opacity value of bubbles for shape layer in map
      * @Default {0.9}
      */
    var bubbleOpacity: js.UndefOr[Double] = js.native
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersBubbleSettingsColorMappings] = js.native
    
    /** Specifies the bubble color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.native
    
    /** Specifies the maximum size value of bubbles for shape layer in map
      * @Default {20}
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum size value of bubbles for shape layer in map
      * @Default {10}
      */
    var minValue: js.UndefOr[Double] = js.native
    
    /** Specifies the showBubble visibility status map
      * @Default {true}
      */
    var showBubble: js.UndefOr[Boolean] = js.native
    
    /** Specifies the tooltip visibility status of the shape layer in map
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specifies the bubble tooltip template of the shape layer in map
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.native
    
    /** Specifies the bubble valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.native
  }
  object LayersBubbleSettings {
    
    @scala.inline
    def apply(): LayersBubbleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettings]
    }
    
    @scala.inline
    implicit class LayersBubbleSettingsMutableBuilder[Self <: LayersBubbleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappings(value: LayersBubbleSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setShowBubble(value: Boolean): Self = StObject.set(x, "showBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBubbleUndefined: Self = StObject.set(x, "showBubble", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  @js.native
  trait LayersBubbleSettingsColorMappings extends StObject {
    
    /** Specifies the range colorMappings in the bubble layer.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]] = js.native
  }
  object LayersBubbleSettingsColorMappings {
    
    @scala.inline
    def apply(): LayersBubbleSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettingsColorMappings]
    }
    
    @scala.inline
    implicit class LayersBubbleSettingsColorMappingsMutableBuilder[Self <: LayersBubbleSettingsColorMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRangeColorMapping(value: js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMappingVarargs(value: LayersBubbleSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayersBubbleSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Color of the bubble layer.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Start range colorMappings in the bubble layer.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.native
    
    /** GradientColors in the bubble layer of map.
      */
    var gradientColors: js.UndefOr[js.Array[_]] = js.native
    
    /** End range colorMappings in the bubble layer.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.native
  }
  object LayersBubbleSettingsColorMappingsRangeColorMapping {
    
    @scala.inline
    def apply(): LayersBubbleSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersBubbleSettingsColorMappingsRangeColorMapping]
    }
    
    @scala.inline
    implicit class LayersBubbleSettingsColorMappingsRangeColorMappingMutableBuilder[Self <: LayersBubbleSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[_]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      @scala.inline
      def setGradientColorsVarargs(value: js.Any*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait LayersLabelSettings extends StObject {
    
    /** enable or disable the enableSmartLabel property
      * @Default {false}
      */
    var enableSmartLabel: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[LayersLabelSettingsFont] = js.native
    
    /** set the labelLength property
      * @Default {'2'}
      */
    var labelLength: js.UndefOr[Double] = js.native
    
    /** set the labelPath property
      * @Default {null}
      */
    var labelPath: js.UndefOr[String] = js.native
    
    /** The property specifies whether to show labels or not.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.native
    
    /** set the smartLabelSize property
      * @Default {fixed}
      */
    var smartLabelSize: js.UndefOr[LabelSize | String] = js.native
  }
  object LayersLabelSettings {
    
    @scala.inline
    def apply(): LayersLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLabelSettings]
    }
    
    @scala.inline
    implicit class LayersLabelSettingsMutableBuilder[Self <: LayersLabelSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableSmartLabel(value: Boolean): Self = StObject.set(x, "enableSmartLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSmartLabelUndefined: Self = StObject.set(x, "enableSmartLabel", js.undefined)
      
      @scala.inline
      def setFont(value: LayersLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLabelLength(value: Double): Self = StObject.set(x, "labelLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLengthUndefined: Self = StObject.set(x, "labelLength", js.undefined)
      
      @scala.inline
      def setLabelPath(value: String): Self = StObject.set(x, "labelPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPathUndefined: Self = StObject.set(x, "labelPath", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setSmartLabelSize(value: LabelSize | String): Self = StObject.set(x, "smartLabelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartLabelSizeUndefined: Self = StObject.set(x, "smartLabelSize", js.undefined)
    }
  }
  
  @js.native
  trait LayersLabelSettingsFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the data label.
      * @Default {normal.}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** NameType DescriptionRegularstring Specifies the font weight as regular.BoldstringSpecifies the font weight as bold.LighterstringSpecifies the font weight as lighter.
      * @Default {regular. See}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LayersLabelSettingsFont {
    
    @scala.inline
    def apply(): LayersLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLabelSettingsFont]
    }
    
    @scala.inline
    implicit class LayersLabelSettingsFontMutableBuilder[Self <: LayersLabelSettingsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LayersLegendSettings extends StObject {
    
    /** Determines whether the legend should be placed outside or inside the map bounds
      * @Default {false}
      */
    var dockOnMap: js.UndefOr[Boolean] = js.native
    
    /** Determines the legend placement and it is valid only when dockOnMap is true
      * @Default {top}
      */
    var dockPosition: js.UndefOr[DockPosition | String] = js.native
    
    /** height value for legend setting
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** to get icon value for legend setting
      * @Default {rectangle}
      */
    var icon: js.UndefOr[LegendIcons | String] = js.native
    
    /** icon height value for legend setting
      * @Default {20}
      */
    var iconHeight: js.UndefOr[Double] = js.native
    
    /** icon Width value for legend setting
      * @Default {20}
      */
    var iconWidth: js.UndefOr[Double] = js.native
    
    /** set the orientation of legend labels
      * @Default {vertical}
      */
    var labelOrientation: js.UndefOr[LabelOrientation | String] = js.native
    
    /** to get leftLabel value for legend setting
      * @Default {null}
      */
    var leftLabel: js.UndefOr[String] = js.native
    
    /** to get mode of legend setting
      * @Default {default}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** set the position of legend settings
      * @Default {topleft}
      */
    var position: js.UndefOr[Position | String] = js.native
    
    /** x position value for legend setting
      * @Default {0}
      */
    var positionX: js.UndefOr[Double] = js.native
    
    /** y position value for legend setting
      * @Default {0}
      */
    var positionY: js.UndefOr[Double] = js.native
    
    /** to get rightLabel value for legend setting
      * @Default {null}
      */
    var rightLabel: js.UndefOr[String] = js.native
    
    /** Enables or Disables the showLabels
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the showLegend
      * @Default {false}
      */
    var showLegend: js.UndefOr[Boolean] = js.native
    
    /** To get the field name in the datasource for generating legend items.
      * @Default {null}
      */
    var textPath: js.UndefOr[String] = js.native
    
    /** to get title of legend setting
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.native
    
    /** Toggle the visibility of the legend.
      * @Default {false}
      */
    var toggleVisibility: js.UndefOr[Boolean] = js.native
    
    /** to get type of legend setting
      * @Default {layers}
      */
    var `type`: js.UndefOr[LegendType | String] = js.native
    
    /** width value for legend setting
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LayersLegendSettings {
    
    @scala.inline
    def apply(): LayersLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersLegendSettings]
    }
    
    @scala.inline
    implicit class LayersLegendSettingsMutableBuilder[Self <: LayersLegendSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDockOnMap(value: Boolean): Self = StObject.set(x, "dockOnMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockOnMapUndefined: Self = StObject.set(x, "dockOnMap", js.undefined)
      
      @scala.inline
      def setDockPosition(value: DockPosition | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: LegendIcons | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      @scala.inline
      def setLabelOrientation(value: LabelOrientation | String): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      @scala.inline
      def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
      
      @scala.inline
      def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
      
      @scala.inline
      def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      @scala.inline
      def setTextPath(value: String): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToggleVisibility(value: Boolean): Self = StObject.set(x, "toggleVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleVisibilityUndefined: Self = StObject.set(x, "toggleVisibility", js.undefined)
      
      @scala.inline
      def setType(value: LegendType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LayersShapeSettings extends StObject {
    
    /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
      * @Default {false}
      */
    var autoFill: js.UndefOr[Boolean] = js.native
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersShapeSettingsColorMappings] = js.native
    
    /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
      * @Default {palette1}
      */
    var colorPalette: js.UndefOr[ColorPalette | String] = js.native
    
    /** Specifies the field name in the datasource that contains color values for each shapes.
      * @Default {null}
      */
    var colorPath: js.UndefOr[String] = js.native
    
    /** Specifies the shape color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.native
    
    /** Enables or Disables the gradient colors for map shapes.
      * @Default {false}
      */
    var enableGradient: js.UndefOr[Boolean] = js.native
    
    /** Specifies the shape fill color of the shape layer in map
      * @Default {#E5E5E5}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Specifies the mouse over width of the shape layer in map
      * @Default {1}
      */
    var highlightBorderWidth: js.UndefOr[Double] = js.native
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var highlightColor: js.UndefOr[String] = js.native
    
    /** Specifies the mouse over stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var highlightStroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection color of the shape layer in map
      * @Default {gray}
      */
    var selectionColor: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var selectionStroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection stroke width of the shape layer in map
      * @Default {1}
      */
    var selectionStrokeWidth: js.UndefOr[Double] = js.native
    
    /** Specifies the shape stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var stroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape stroke thickness value of the shape layer in map
      * @Default {0.2}
      */
    var strokeThickness: js.UndefOr[Double] = js.native
    
    /** Specifies the shape valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.native
  }
  object LayersShapeSettings {
    
    @scala.inline
    def apply(): LayersShapeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettings]
    }
    
    @scala.inline
    implicit class LayersShapeSettingsMutableBuilder[Self <: LayersShapeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFill(value: Boolean): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
      
      @scala.inline
      def setColorMappings(value: LayersShapeSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      @scala.inline
      def setColorPalette(value: ColorPalette | String): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPaletteUndefined: Self = StObject.set(x, "colorPalette", js.undefined)
      
      @scala.inline
      def setColorPath(value: String): Self = StObject.set(x, "colorPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPathUndefined: Self = StObject.set(x, "colorPath", js.undefined)
      
      @scala.inline
      def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      @scala.inline
      def setEnableGradient(value: Boolean): Self = StObject.set(x, "enableGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGradientUndefined: Self = StObject.set(x, "enableGradient", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHighlightBorderWidth(value: Double): Self = StObject.set(x, "highlightBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightBorderWidthUndefined: Self = StObject.set(x, "highlightBorderWidth", js.undefined)
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
      
      @scala.inline
      def setHighlightStroke(value: String): Self = StObject.set(x, "highlightStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStrokeUndefined: Self = StObject.set(x, "highlightStroke", js.undefined)
      
      @scala.inline
      def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setSelectionStroke(value: String): Self = StObject.set(x, "selectionStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStrokeUndefined: Self = StObject.set(x, "selectionStroke", js.undefined)
      
      @scala.inline
      def setSelectionStrokeWidth(value: Double): Self = StObject.set(x, "selectionStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStrokeWidthUndefined: Self = StObject.set(x, "selectionStrokeWidth", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  @js.native
  trait LayersShapeSettingsColorMappings extends StObject {
    
    /** Specifies the equalColorMapping in the shape layer of map.
      * @Default {null}
      */
    var equalColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
    
    /** Specifies the range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
  }
  object LayersShapeSettingsColorMappings {
    
    @scala.inline
    def apply(): LayersShapeSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappings]
    }
    
    @scala.inline
    implicit class LayersShapeSettingsColorMappingsMutableBuilder[Self <: LayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEqualColorMapping(value: js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]): Self = StObject.set(x, "equalColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualColorMappingUndefined: Self = StObject.set(x, "equalColorMapping", js.undefined)
      
      @scala.inline
      def setEqualColorMappingVarargs(value: LayersShapeSettingsColorMappingsEqualColorMapping*): Self = StObject.set(x, "equalColorMapping", js.Array(value :_*))
      
      @scala.inline
      def setRangeColorMapping(value: js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMappingVarargs(value: LayersShapeSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayersShapeSettingsColorMappingsEqualColorMapping extends StObject {
    
    /** Specifies the equalColorMapping color in the shape layer of map.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the equalColorMapping value in the shape layer of map.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.native
  }
  object LayersShapeSettingsColorMappingsEqualColorMapping {
    
    @scala.inline
    def apply(): LayersShapeSettingsColorMappingsEqualColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappingsEqualColorMapping]
    }
    
    @scala.inline
    implicit class LayersShapeSettingsColorMappingsEqualColorMappingMutableBuilder[Self <: LayersShapeSettingsColorMappingsEqualColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait LayersShapeSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Specifies the start range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.native
    
    /** Specifies the gradientColors in the shape layer of map.
      * @Default {null}
      */
    var gradientColors: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the to range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.native
  }
  object LayersShapeSettingsColorMappingsRangeColorMapping {
    
    @scala.inline
    def apply(): LayersShapeSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersShapeSettingsColorMappingsRangeColorMapping]
    }
    
    @scala.inline
    implicit class LayersShapeSettingsColorMappingsRangeColorMappingMutableBuilder[Self <: LayersShapeSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[_]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      @scala.inline
      def setGradientColorsVarargs(value: js.Any*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayer extends StObject {
    
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
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.native
    
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
    implicit class LayersSubLayerMutableBuilder[Self <: LayersSubLayer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBingMapType(value: BingMapType | String): Self = StObject.set(x, "bingMapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBingMapTypeUndefined: Self = StObject.set(x, "bingMapType", js.undefined)
      
      @scala.inline
      def setBubbleSettings(value: LayersSubLayersBubbleSettings): Self = StObject.set(x, "bubbleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleSettingsUndefined: Self = StObject.set(x, "bubbleSettings", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setEnableMouseHover(value: Boolean): Self = StObject.set(x, "enableMouseHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseHoverUndefined: Self = StObject.set(x, "enableMouseHover", js.undefined)
      
      @scala.inline
      def setEnableSelection(value: Boolean): Self = StObject.set(x, "enableSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectionUndefined: Self = StObject.set(x, "enableSelection", js.undefined)
      
      @scala.inline
      def setGeometryType(value: GeometryType | String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabelSettings(value: LayersSubLayersLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      @scala.inline
      def setLayerType(value: LayerType | String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerTypeUndefined: Self = StObject.set(x, "layerType", js.undefined)
      
      @scala.inline
      def setLegendSettings(value: LayersSubLayersLegendSettings): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendSettingsUndefined: Self = StObject.set(x, "legendSettings", js.undefined)
      
      @scala.inline
      def setMapItemsTemplate(value: String): Self = StObject.set(x, "mapItemsTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapItemsTemplateUndefined: Self = StObject.set(x, "mapItemsTemplate", js.undefined)
      
      @scala.inline
      def setMarkerTemplate(value: String): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
      
      @scala.inline
      def setMarkers(value: js.Array[_]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMarkersVarargs(value: js.Any*): Self = StObject.set(x, "markers", js.Array(value :_*))
      
      @scala.inline
      def setSelectedMapShapes(value: js.Array[_]): Self = StObject.set(x, "selectedMapShapes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMapShapesUndefined: Self = StObject.set(x, "selectedMapShapes", js.undefined)
      
      @scala.inline
      def setSelectedMapShapesVarargs(value: js.Any*): Self = StObject.set(x, "selectedMapShapes", js.Array(value :_*))
      
      @scala.inline
      def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShapeData(value: js.Any): Self = StObject.set(x, "shapeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeDataPath(value: String): Self = StObject.set(x, "shapeDataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeDataPathUndefined: Self = StObject.set(x, "shapeDataPath", js.undefined)
      
      @scala.inline
      def setShapeDataUndefined: Self = StObject.set(x, "shapeData", js.undefined)
      
      @scala.inline
      def setShapePropertyPath(value: String): Self = StObject.set(x, "shapePropertyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapePropertyPathUndefined: Self = StObject.set(x, "shapePropertyPath", js.undefined)
      
      @scala.inline
      def setShapeSettings(value: LayersSubLayersShapeSettings): Self = StObject.set(x, "shapeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeSettingsUndefined: Self = StObject.set(x, "shapeSettings", js.undefined)
      
      @scala.inline
      def setShowMapItems(value: Boolean): Self = StObject.set(x, "showMapItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMapItemsUndefined: Self = StObject.set(x, "showMapItems", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersBubbleSettings extends StObject {
    
    /** Specifies the bubble Opacity value of bubbles for shape layer in map
      * @Default {0.9}
      */
    var bubbleOpacity: js.UndefOr[Double] = js.native
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersSubLayersBubbleSettingsColorMappings] = js.native
    
    /** Specifies the field name in the datasource that contains color values for each bubbles.
      * @Default {null}
      */
    var colorPath: js.UndefOr[String] = js.native
    
    /** Specifies the bubble color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.native
    
    /** Specifies the maximum size value of bubbles for shape layer in map
      * @Default {20}
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum size value of bubbles for shape layer in map
      * @Default {10}
      */
    var minValue: js.UndefOr[Double] = js.native
    
    /** Specifies the showBubble visibility status map
      * @Default {true}
      */
    var showBubble: js.UndefOr[Boolean] = js.native
    
    /** Specifies the tooltip visibility status of the shape layer in map
      * @Default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specifies the bubble tooltip template of the shape layer in map
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.native
    
    /** Specifies the bubble valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.native
  }
  object LayersSubLayersBubbleSettings {
    
    @scala.inline
    def apply(): LayersSubLayersBubbleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettings]
    }
    
    @scala.inline
    implicit class LayersSubLayersBubbleSettingsMutableBuilder[Self <: LayersSubLayersBubbleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappings(value: LayersSubLayersBubbleSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      @scala.inline
      def setColorPath(value: String): Self = StObject.set(x, "colorPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPathUndefined: Self = StObject.set(x, "colorPath", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setShowBubble(value: Boolean): Self = StObject.set(x, "showBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBubbleUndefined: Self = StObject.set(x, "showBubble", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersBubbleSettingsColorMappings extends StObject {
    
    /** Specifies the range colorMappings in the bubble layer.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]] = js.native
  }
  object LayersSubLayersBubbleSettingsColorMappings {
    
    @scala.inline
    def apply(): LayersSubLayersBubbleSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappings]
    }
    
    @scala.inline
    implicit class LayersSubLayersBubbleSettingsColorMappingsMutableBuilder[Self <: LayersSubLayersBubbleSettingsColorMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRangeColorMapping(value: js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMappingVarargs(value: LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Color of the bubble layer.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Start range colorMappings in the bubble layer.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.native
    
    /** GradientColors in the bubble layer of map.
      */
    var gradientColors: js.UndefOr[js.Array[_]] = js.native
    
    /** End range colorMappings in the bubble layer.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.native
  }
  object LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping {
    
    @scala.inline
    def apply(): LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]
    }
    
    @scala.inline
    implicit class LayersSubLayersBubbleSettingsColorMappingsRangeColorMappingMutableBuilder[Self <: LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[_]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      @scala.inline
      def setGradientColorsVarargs(value: js.Any*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersLabelSettings extends StObject {
    
    /** enable or disable the enableSmartLabel property
      * @Default {false}
      */
    var enableSmartLabel: js.UndefOr[Boolean] = js.native
    
    /** set the labelLength property
      * @Default {'2'}
      */
    var labelLength: js.UndefOr[Double] = js.native
    
    /** set the labelPath property
      * @Default {null}
      */
    var labelPath: js.UndefOr[String] = js.native
    
    /** The property specifies whether to show labels or not.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.native
    
    /** set the smartLabelSize property
      * @Default {fixed}
      */
    var smartLabelSize: js.UndefOr[LabelSize | String] = js.native
  }
  object LayersSubLayersLabelSettings {
    
    @scala.inline
    def apply(): LayersSubLayersLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersLabelSettings]
    }
    
    @scala.inline
    implicit class LayersSubLayersLabelSettingsMutableBuilder[Self <: LayersSubLayersLabelSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableSmartLabel(value: Boolean): Self = StObject.set(x, "enableSmartLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSmartLabelUndefined: Self = StObject.set(x, "enableSmartLabel", js.undefined)
      
      @scala.inline
      def setLabelLength(value: Double): Self = StObject.set(x, "labelLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLengthUndefined: Self = StObject.set(x, "labelLength", js.undefined)
      
      @scala.inline
      def setLabelPath(value: String): Self = StObject.set(x, "labelPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPathUndefined: Self = StObject.set(x, "labelPath", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setSmartLabelSize(value: LabelSize | String): Self = StObject.set(x, "smartLabelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartLabelSizeUndefined: Self = StObject.set(x, "smartLabelSize", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersLegendSettings extends StObject {
    
    /** Determines whether the legend should be placed outside or inside the map bounds
      * @Default {false}
      */
    var dockOnMap: js.UndefOr[Boolean] = js.native
    
    /** Determines the legend placement and it is valid only when dockOnMap is true
      * @Default {top}
      */
    var dockPosition: js.UndefOr[DockPosition | String] = js.native
    
    /** height value for legend setting
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** to get icon value for legend setting
      * @Default {rectangle}
      */
    var icon: js.UndefOr[LegendIcons | String] = js.native
    
    /** icon height value for legend setting
      * @Default {20}
      */
    var iconHeight: js.UndefOr[Double] = js.native
    
    /** icon Width value for legend setting
      * @Default {20}
      */
    var iconWidth: js.UndefOr[Double] = js.native
    
    /** set the orientation of legend labels
      * @Default {vertical}
      */
    var labelOrientation: js.UndefOr[LabelOrientation | String] = js.native
    
    /** to get leftLabel value for legend setting
      * @Default {null}
      */
    var leftLabel: js.UndefOr[String] = js.native
    
    /** to get mode of legend setting
      * @Default {default}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** set the position of legend settings
      * @Default {topleft}
      */
    var position: js.UndefOr[Position | String] = js.native
    
    /** x position value for legend setting
      * @Default {0}
      */
    var positionX: js.UndefOr[Double] = js.native
    
    /** y position value for legend setting
      * @Default {0}
      */
    var positionY: js.UndefOr[Double] = js.native
    
    /** to get rightLabel value for legend setting
      * @Default {null}
      */
    var rightLabel: js.UndefOr[String] = js.native
    
    /** Enables or Disables the showLabels
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the showLegend
      * @Default {false}
      */
    var showLegend: js.UndefOr[Boolean] = js.native
    
    /** To get the field name in the datasource for generating legend items.
      * @Default {null}
      */
    var textPath: js.UndefOr[String] = js.native
    
    /** to get title of legend setting
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.native
    
    /** to get type of legend setting
      * @Default {layers}
      */
    var `type`: js.UndefOr[LegendType | String] = js.native
    
    /** width value for legend setting
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LayersSubLayersLegendSettings {
    
    @scala.inline
    def apply(): LayersSubLayersLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersLegendSettings]
    }
    
    @scala.inline
    implicit class LayersSubLayersLegendSettingsMutableBuilder[Self <: LayersSubLayersLegendSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDockOnMap(value: Boolean): Self = StObject.set(x, "dockOnMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockOnMapUndefined: Self = StObject.set(x, "dockOnMap", js.undefined)
      
      @scala.inline
      def setDockPosition(value: DockPosition | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: LegendIcons | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      @scala.inline
      def setLabelOrientation(value: LabelOrientation | String): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      @scala.inline
      def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
      
      @scala.inline
      def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
      
      @scala.inline
      def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      @scala.inline
      def setTextPath(value: String): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: LegendType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersShapeSettings extends StObject {
    
    /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
      * @Default {false}
      */
    var autoFill: js.UndefOr[Boolean] = js.native
    
    /** Specifies the colorMappings of the shape layer in map
      * @Default {null}
      */
    var colorMappings: js.UndefOr[LayersSubLayersShapeSettingsColorMappings] = js.native
    
    /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
      * @Default {palette1}
      */
    var colorPalette: js.UndefOr[ColorPalette | String] = js.native
    
    /** Specifies the shape color valuePath of the shape layer in map
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.native
    
    /** Enables or Disables the gradient colors for map shapes.
      * @Default {false}
      */
    var enableGradient: js.UndefOr[Boolean] = js.native
    
    /** Specifies the shape fill color of the shape layer in map
      * @Default {#E5E5E5}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Specifies the mouse over width of the shape layer in map
      * @Default {1}
      */
    var highlightBorderWidth: js.UndefOr[Double] = js.native
    
    /** Specifies the mouse hover color of the shape layer in map
      * @Default {gray}
      */
    var highlightColor: js.UndefOr[String] = js.native
    
    /** Specifies the mouse over stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var highlightStroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection color of the shape layer in map
      * @Default {gray}
      */
    var selectionColor: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var selectionStroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape selection stroke width of the shape layer in map
      * @Default {1}
      */
    var selectionStrokeWidth: js.UndefOr[Double] = js.native
    
    /** Specifies the shape stroke color of the shape layer in map
      * @Default {#C1C1C1}
      */
    var stroke: js.UndefOr[String] = js.native
    
    /** Specifies the shape stroke thickness value of the shape layer in map
      * @Default {0.2}
      */
    var strokeThickness: js.UndefOr[Double] = js.native
    
    /** Specifies the shape valuePath of the shape layer in map
      * @Default {null}
      */
    var valuePath: js.UndefOr[String] = js.native
  }
  object LayersSubLayersShapeSettings {
    
    @scala.inline
    def apply(): LayersSubLayersShapeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettings]
    }
    
    @scala.inline
    implicit class LayersSubLayersShapeSettingsMutableBuilder[Self <: LayersSubLayersShapeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFill(value: Boolean): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
      
      @scala.inline
      def setColorMappings(value: LayersSubLayersShapeSettingsColorMappings): Self = StObject.set(x, "colorMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingsUndefined: Self = StObject.set(x, "colorMappings", js.undefined)
      
      @scala.inline
      def setColorPalette(value: ColorPalette | String): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPaletteUndefined: Self = StObject.set(x, "colorPalette", js.undefined)
      
      @scala.inline
      def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      @scala.inline
      def setEnableGradient(value: Boolean): Self = StObject.set(x, "enableGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGradientUndefined: Self = StObject.set(x, "enableGradient", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHighlightBorderWidth(value: Double): Self = StObject.set(x, "highlightBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightBorderWidthUndefined: Self = StObject.set(x, "highlightBorderWidth", js.undefined)
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
      
      @scala.inline
      def setHighlightStroke(value: String): Self = StObject.set(x, "highlightStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStrokeUndefined: Self = StObject.set(x, "highlightStroke", js.undefined)
      
      @scala.inline
      def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setSelectionStroke(value: String): Self = StObject.set(x, "selectionStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStrokeUndefined: Self = StObject.set(x, "selectionStroke", js.undefined)
      
      @scala.inline
      def setSelectionStrokeWidth(value: Double): Self = StObject.set(x, "selectionStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStrokeWidthUndefined: Self = StObject.set(x, "selectionStrokeWidth", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setValuePath(value: String): Self = StObject.set(x, "valuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePathUndefined: Self = StObject.set(x, "valuePath", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersShapeSettingsColorMappings extends StObject {
    
    /** Specifies the equalColorMapping in the shape layer of map.
      * @Default {null}
      */
    var equalColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
    
    /** Specifies the range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
  }
  object LayersSubLayersShapeSettingsColorMappings {
    
    @scala.inline
    def apply(): LayersSubLayersShapeSettingsColorMappings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappings]
    }
    
    @scala.inline
    implicit class LayersSubLayersShapeSettingsColorMappingsMutableBuilder[Self <: LayersSubLayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEqualColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]): Self = StObject.set(x, "equalColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualColorMappingUndefined: Self = StObject.set(x, "equalColorMapping", js.undefined)
      
      @scala.inline
      def setEqualColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping*): Self = StObject.set(x, "equalColorMapping", js.Array(value :_*))
      
      @scala.inline
      def setRangeColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayersSubLayersShapeSettingsColorMappingsEqualColorMapping extends StObject {
    
    /** Specifies the equalColorMapping color in the shape layer of map.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the equalColorMapping value in the shape layer of map.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.native
  }
  object LayersSubLayersShapeSettingsColorMappingsEqualColorMapping {
    
    @scala.inline
    def apply(): LayersSubLayersShapeSettingsColorMappingsEqualColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]
    }
    
    @scala.inline
    implicit class LayersSubLayersShapeSettingsColorMappingsEqualColorMappingMutableBuilder[Self <: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait LayersSubLayersShapeSettingsColorMappingsRangeColorMapping extends StObject {
    
    /** Specifies the start range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var from: js.UndefOr[Double] = js.native
    
    /** Specifies the gradientColors in the shape layer of map.
      * @Default {null}
      */
    var gradientColors: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the to range colorMappings in the shape layer of map.
      * @Default {null}
      */
    var to: js.UndefOr[Double] = js.native
  }
  object LayersSubLayersShapeSettingsColorMappingsRangeColorMapping {
    
    @scala.inline
    def apply(): LayersSubLayersShapeSettingsColorMappingsRangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]
    }
    
    @scala.inline
    implicit class LayersSubLayersShapeSettingsColorMappingsRangeColorMappingMutableBuilder[Self <: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[_]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      @scala.inline
      def setGradientColorsVarargs(value: js.Any*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** startX - X-coordinate of legend item in pixel        LegendItem - Instance of the legend item object that is about to be rendered    style - Options to customize the legend item
      * styles such as border, color, size, etcâ€¦,        symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    map - Instance
      * of the map object corresponding to the legend item
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemClickEventArgs {
    
    @scala.inline
    def apply(): LegendItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemClickEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemClickEventArgsMutableBuilder[Self <: LegendItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemRenderingEventArgs extends StObject {
    
    /** Returns the legend item.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object LegendItemRenderingEventArgs {
    
    @scala.inline
    def apply(): LegendItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemRenderingEventArgsMutableBuilder[Self <: LegendItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait MarkerEnterEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MarkerEnterEventArgs {
    
    @scala.inline
    def apply(): MarkerEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerEnterEventArgs]
    }
    
    @scala.inline
    implicit class MarkerEnterEventArgsMutableBuilder[Self <: MarkerEnterEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MarkerLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MarkerLeaveEventArgs {
    
    @scala.inline
    def apply(): MarkerLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerLeaveEventArgs]
    }
    
    @scala.inline
    implicit class MarkerLeaveEventArgsMutableBuilder[Self <: MarkerLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MarkerSelectedEventArgs extends StObject {
    
    /** Returns marker object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object MarkerSelectedEventArgs {
    
    @scala.inline
    def apply(): MarkerSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSelectedEventArgs]
    }
    
    @scala.inline
    implicit class MarkerSelectedEventArgsMutableBuilder[Self <: MarkerSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires, on clicking the map.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
    
    /** Specifies the background color for map
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Specifies the index of the map to determine the shape layer to be displayed
      * @Default {0}
      */
    var baseMapIndex: js.UndefOr[Double] = js.native
    
    /** Triggered while rendering the each bubbles in maps.
      */
    var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, Unit]] = js.native
    
    /** Specify the center position where map should be displayed
      * @Default {[0,0]}
      */
    var centerPosition: js.UndefOr[js.Any] = js.native
    
    /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
      */
    var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, Unit]] = js.native
    
    /** Fires, on double clicking the map.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
    
    /** Controls the selection through dragging
      * @Default {false}
      */
    var draggingOnSelection: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the map animation
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the animation for layer change in map
      * @Default {false}
      */
    var enableLayerChangeAnimation: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the map panning
      * @Default {true}
      */
    var enablePan: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables right to left(RTL) support for maps.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Determines whether map need to resize when container is resized
      * @Default {true}
      */
    var enableResize: js.UndefOr[Boolean] = js.native
    
    /** Determines whether map need to resize when container is resized
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Layer for holding the map shapes
      */
    var layers: js.UndefOr[js.Array[Layer]] = js.native
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
    
    /** Triggered while rendering the each legend in maps.
      */
    var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.native
    
    /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
      * automatically. Provide localized text as value to string type properties.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Triggers while entering the hovered marker shape.
      */
    var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, Unit]] = js.native
    
    /** Triggers while leaving the hovered marker shape.
      */
    var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, Unit]] = js.native
    
    /** Triggered on selecting the map markers.
      */
    var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, Unit]] = js.native
    
    /** Triggers while leaving the hovered map shape
      */
    var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, Unit]] = js.native
    
    /** Triggers while hovering the map shape.
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
    
    /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
      */
    var navigationControl: js.UndefOr[NavigationControl] = js.native
    
    /** Fires before loading the map.
      */
    var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, Unit]] = js.native
    
    /** Triggers once map render completed.
      */
    var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, Unit]] = js.native
    
    /** Triggers when map panning ends.
      */
    var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, Unit]] = js.native
    
    /** Triggers after refreshing the map items.
      */
    var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.native
    
    /** Fires, on right clicking the map.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
    
    /** Triggered while rendering the each shapes in maps.
      */
    var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, Unit]] = js.native
    
    /** Triggered on selecting the map shapes.
      */
    var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, Unit]] = js.native
    
    /** Enables or Disables the Zooming for map.
      */
    var zoomSettings: js.UndefOr[ZoomSettings] = js.native
    
    /** Triggered when map is zoomed-in.
      */
    var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, Unit]] = js.native
    
    /** Triggers when map is zoomed out.
      */
    var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, Unit]] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.Map.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Map.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.Map.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBaseMapIndex(value: Double): Self = StObject.set(x, "baseMapIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseMapIndexUndefined: Self = StObject.set(x, "baseMapIndex", js.undefined)
      
      @scala.inline
      def setBubbleRendering(value: /* e */ BubbleRenderingEventArgs => Unit): Self = StObject.set(x, "bubbleRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBubbleRenderingUndefined: Self = StObject.set(x, "bubbleRendering", js.undefined)
      
      @scala.inline
      def setCenterPosition(value: js.Any): Self = StObject.set(x, "centerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterPositionUndefined: Self = StObject.set(x, "centerPosition", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => Unit): Self = StObject.set(x, "displayTextRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayTextRenderingUndefined: Self = StObject.set(x, "displayTextRendering", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDraggingOnSelection(value: Boolean): Self = StObject.set(x, "draggingOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingOnSelectionUndefined: Self = StObject.set(x, "draggingOnSelection", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableLayerChangeAnimation(value: Boolean): Self = StObject.set(x, "enableLayerChangeAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLayerChangeAnimationUndefined: Self = StObject.set(x, "enableLayerChangeAnimation", js.undefined)
      
      @scala.inline
      def setEnablePan(value: Boolean): Self = StObject.set(x, "enablePan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePanUndefined: Self = StObject.set(x, "enablePan", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      @scala.inline
      def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = StObject.set(x, "legendItemRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemRenderingUndefined: Self = StObject.set(x, "legendItemRendering", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMarkerEnter(value: /* e */ MarkerEnterEventArgs => Unit): Self = StObject.set(x, "markerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkerEnterUndefined: Self = StObject.set(x, "markerEnter", js.undefined)
      
      @scala.inline
      def setMarkerLeave(value: /* e */ MarkerLeaveEventArgs => Unit): Self = StObject.set(x, "markerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkerLeaveUndefined: Self = StObject.set(x, "markerLeave", js.undefined)
      
      @scala.inline
      def setMarkerSelected(value: /* e */ MarkerSelectedEventArgs => Unit): Self = StObject.set(x, "markerSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkerSelectedUndefined: Self = StObject.set(x, "markerSelected", js.undefined)
      
      @scala.inline
      def setMouseleave(value: /* e */ MouseleaveEventArgs => Unit): Self = StObject.set(x, "mouseleave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      @scala.inline
      def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      @scala.inline
      def setNavigationControl(value: NavigationControl): Self = StObject.set(x, "navigationControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationControlUndefined: Self = StObject.set(x, "navigationControl", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* e */ OnLoadEventArgs => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnRenderComplete(value: /* e */ OnRenderCompleteEventArgs => Unit): Self = StObject.set(x, "onRenderComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderCompleteUndefined: Self = StObject.set(x, "onRenderComplete", js.undefined)
      
      @scala.inline
      def setPanned(value: /* e */ PannedEventArgs => Unit): Self = StObject.set(x, "panned", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPannedUndefined: Self = StObject.set(x, "panned", js.undefined)
      
      @scala.inline
      def setRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = StObject.set(x, "refreshed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshedUndefined: Self = StObject.set(x, "refreshed", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: /* e */ ShapeRenderingEventArgs => Unit): Self = StObject.set(x, "shapeRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setShapeSelected(value: /* e */ ShapeSelectedEventArgs => Unit): Self = StObject.set(x, "shapeSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShapeSelectedUndefined: Self = StObject.set(x, "shapeSelected", js.undefined)
      
      @scala.inline
      def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSettingsUndefined: Self = StObject.set(x, "zoomSettings", js.undefined)
      
      @scala.inline
      def setZoomedIn(value: /* e */ ZoomedInEventArgs => Unit): Self = StObject.set(x, "zoomedIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomedInUndefined: Self = StObject.set(x, "zoomedIn", js.undefined)
      
      @scala.inline
      def setZoomedOut(value: /* e */ ZoomedOutEventArgs => Unit): Self = StObject.set(x, "zoomedOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomedOutUndefined: Self = StObject.set(x, "zoomedOut", js.undefined)
    }
  }
  
  @js.native
  trait MouseleaveEventArgs extends StObject {
    
    /** Returns hovered map shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object MouseleaveEventArgs {
    
    @scala.inline
    def apply(): MouseleaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseleaveEventArgs]
    }
    
    @scala.inline
    implicit class MouseleaveEventArgsMutableBuilder[Self <: MouseleaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait MouseoverEventArgs extends StObject {
    
    /** Returns hovered map shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object MouseoverEventArgs {
    
    @scala.inline
    def apply(): MouseoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoverEventArgs]
    }
    
    @scala.inline
    implicit class MouseoverEventArgsMutableBuilder[Self <: MouseoverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait NavigationControl extends StObject {
    
    /** Set the absolutePosition for navigation control
      * @Default {{x:0,y:0}}
      */
    var absolutePosition: js.UndefOr[js.Any] = js.native
    
    /** Specifies the navigation control template for map
      * @Default {null}
      */
    var content: js.UndefOr[String] = js.native
    
    /** Set the dockPosition value for navigation control
      * @Default {centerleft}
      */
    var dockPosition: js.UndefOr[Position | String] = js.native
    
    /** Enables or Disables the Navigation for handling zooming map
      * @Default {false}
      */
    var enableNavigation: js.UndefOr[Boolean] = js.native
    
    /** Set the orientation value for navigation control
      * @Default {vertical}
      */
    var orientation: js.UndefOr[LabelOrientation | String] = js.native
  }
  object NavigationControl {
    
    @scala.inline
    def apply(): NavigationControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationControl]
    }
    
    @scala.inline
    implicit class NavigationControlMutableBuilder[Self <: NavigationControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: js.Any): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDockPosition(value: Position | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      @scala.inline
      def setEnableNavigation(value: Boolean): Self = StObject.set(x, "enableNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableNavigationUndefined: Self = StObject.set(x, "enableNavigation", js.undefined)
      
      @scala.inline
      def setOrientation(value: LabelOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  @js.native
  trait OnLoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the map model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OnLoadEventArgs {
    
    @scala.inline
    def apply(): OnLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnLoadEventArgs]
    }
    
    @scala.inline
    implicit class OnLoadEventArgsMutableBuilder[Self <: OnLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OnRenderCompleteEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object OnRenderCompleteEventArgs {
    
    @scala.inline
    def apply(): OnRenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit class OnRenderCompleteEventArgsMutableBuilder[Self <: OnRenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait PannedEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object PannedEventArgs {
    
    @scala.inline
    def apply(): PannedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PannedEventArgs]
    }
    
    @scala.inline
    implicit class PannedEventArgsMutableBuilder[Self <: PannedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait RefreshedEventArgs extends StObject {
    
    /** Refresh and load the map.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object RefreshedEventArgs {
    
    @scala.inline
    def apply(): RefreshedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshedEventArgs]
    }
    
    @scala.inline
    implicit class RefreshedEventArgsMutableBuilder[Self <: RefreshedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait RightClickEventArgs extends StObject {
    
    /** Returns right clicked shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait ShapeRenderingEventArgs extends StObject {
    
    /** Returns the shape values.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object ShapeRenderingEventArgs {
    
    @scala.inline
    def apply(): ShapeRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeRenderingEventArgs]
    }
    
    @scala.inline
    implicit class ShapeRenderingEventArgsMutableBuilder[Self <: ShapeRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait ShapeSelectedEventArgs extends StObject {
    
    /** Returns selected shape object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object ShapeSelectedEventArgs {
    
    @scala.inline
    def apply(): ShapeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeSelectedEventArgs]
    }
    
    @scala.inline
    implicit class ShapeSelectedEventArgsMutableBuilder[Self <: ShapeSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait ZoomSettings extends StObject {
    
    /** Specifies animation duration for map shapes while zooming.
      * @Default {600}
      */
    var animationDuration: js.UndefOr[String] = js.native
    
    /** Enables or Disables the zoom on mouse wheel the map.
      * @Default {true}
      */
    var enableMouseWheelZoom: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the zooming of map
      * @Default {true}
      */
    var enableZoom: js.UndefOr[Boolean] = js.native
    
    /** Enables or Disables the zoom on selecting the map shape
      * @Default {false}
      */
    var enableZoomOnSelection: js.UndefOr[Boolean] = js.native
    
    /** Specifies the zoom factor for map zoom value.
      * @Default {1}
      */
    var factor: js.UndefOr[Double] = js.native
    
    /** Specifies the zoom level value for which map to be zoomed
      * @Default {1}
      */
    var level: js.UndefOr[Double] = js.native
    
    /** Specifies the maximum zoom level of the map
      * @Default {100}
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum zoomSettings level of the map
      * @Default {1}
      */
    var minValue: js.UndefOr[Double] = js.native
  }
  object ZoomSettings {
    
    @scala.inline
    def apply(): ZoomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSettings]
    }
    
    @scala.inline
    implicit class ZoomSettingsMutableBuilder[Self <: ZoomSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setEnableMouseWheelZoom(value: Boolean): Self = StObject.set(x, "enableMouseWheelZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseWheelZoomUndefined: Self = StObject.set(x, "enableMouseWheelZoom", js.undefined)
      
      @scala.inline
      def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableZoomOnSelection(value: Boolean): Self = StObject.set(x, "enableZoomOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableZoomOnSelectionUndefined: Self = StObject.set(x, "enableZoomOnSelection", js.undefined)
      
      @scala.inline
      def setEnableZoomUndefined: Self = StObject.set(x, "enableZoom", js.undefined)
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    }
  }
  
  @js.native
  trait ZoomedInEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
    
    /** Returns zoom level value for which the map is zoomed.
      */
    var zoomLevel: js.UndefOr[js.Any] = js.native
  }
  object ZoomedInEventArgs {
    
    @scala.inline
    def apply(): ZoomedInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedInEventArgs]
    }
    
    @scala.inline
    implicit class ZoomedInEventArgsMutableBuilder[Self <: ZoomedInEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      @scala.inline
      def setZoomLevel(value: js.Any): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
    }
  }
  
  @js.native
  trait ZoomedOutEventArgs extends StObject {
    
    /** Event parameters from map
      */
    var originalEvent: js.UndefOr[js.Any] = js.native
    
    /** Returns zoom level value for which the map is zoomed.
      */
    var zoomLevel: js.UndefOr[js.Any] = js.native
  }
  object ZoomedOutEventArgs {
    
    @scala.inline
    def apply(): ZoomedOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedOutEventArgs]
    }
    
    @scala.inline
    implicit class ZoomedOutEventArgsMutableBuilder[Self <: ZoomedOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      @scala.inline
      def setZoomLevel(value: js.Any): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
    }
  }
}
