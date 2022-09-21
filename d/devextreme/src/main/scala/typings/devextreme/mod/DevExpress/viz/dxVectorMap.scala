package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxVectorMap
  extends StObject
     with BaseWidget[dxVectorMapOptions]
     with _VizWidget {
  
  /**
    * Gets the current map center coordinates.
    */
  def center(): js.Array[Double] = js.native
  /**
    * Sets the map center coordinates.
    */
  def center(centerCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * Deselects all the selected area and markers on a map at once. The areas and markers are displayed in their initial style after.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Converts client area coordinates into map coordinates.
    * @deprecated Use convertToGeo instead.
    */
  def convertCoordinates(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * Converts coordinates from pixels to the dataSource coordinate system.
    */
  def convertToGeo(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * Converts coordinates from the dataSource coordinate system to pixels.
    */
  def convertToXY(longitude: Double, latitude: Double): js.Array[Double] = js.native
  
  /**
    * Gets a layer with a specific index.
    */
  def getLayerByIndex(index: Double): MapLayer = js.native
  
  /**
    * Gets a layer with a specific name.
    */
  def getLayerByName(name: String): MapLayer = js.native
  
  /**
    * Gets all layers.
    */
  def getLayers(): js.Array[MapLayer] = js.native
  
  /**
    * Gets the current map viewport coordinates.
    */
  def viewport(): js.Array[Double] = js.native
  /**
    * Sets the map viewport coordinates.
    */
  def viewport(viewportCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * Gets the current zoom factor value.
    */
  def zoomFactor(): Double = js.native
  /**
    * Sets the zoom factor value.
    */
  def zoomFactor(zoomFactor: Double): Unit = js.native
}
object dxVectorMap {
  
  trait CenterChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val center: js.Array[Double]
  }
  object CenterChangedEvent {
    
    inline def apply(center: js.Array[Double], component: dxVectorMap, element: DxElement_[HTMLElement]): CenterChangedEvent = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenterChangedEvent]
    }
    
    extension [Self <: CenterChangedEvent](x: Self) {
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    }
  }
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxVectorMap, MouseEvent | PointerEvent] {
    
    val target: MapLayerElement
  }
  object ClickEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: MapLayerElement): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setTarget(value: MapLayerElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxVectorMap]
  
  type DrawnEvent = EventInfo[dxVectorMap]
  
  type ExportedEvent = EventInfo[dxVectorMap]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxVectorMap]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxVectorMap]
  
  type LegendItem = VectorMapLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxVectorMapOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val target: MapLayerElement
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: MapLayerElement): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setTarget(value: MapLayerElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipInfo extends StObject {
    
    var target: js.UndefOr[MapLayerElement | dxVectorMapAnnotationConfig] = js.undefined
  }
  object TooltipInfo {
    
    inline def apply(): TooltipInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: MapLayerElement | dxVectorMapAnnotationConfig): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.area
    - typings.devextreme.devextremeStrings.line
    - typings.devextreme.devextremeStrings.marker
  */
  trait VectorMapLayerType extends StObject
  object VectorMapLayerType {
    
    inline def area: typings.devextreme.devextremeStrings.area = "area".asInstanceOf[typings.devextreme.devextremeStrings.area]
    
    inline def line: typings.devextreme.devextremeStrings.line = "line".asInstanceOf[typings.devextreme.devextremeStrings.line]
    
    inline def marker: typings.devextreme.devextremeStrings.marker = "marker".asInstanceOf[typings.devextreme.devextremeStrings.marker]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.circle
    - typings.devextreme.devextremeStrings.square
  */
  trait VectorMapMarkerShape extends StObject
  object VectorMapMarkerShape {
    
    inline def circle: typings.devextreme.devextremeStrings.circle = "circle".asInstanceOf[typings.devextreme.devextremeStrings.circle]
    
    inline def square: typings.devextreme.devextremeStrings.square = "square".asInstanceOf[typings.devextreme.devextremeStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.bubble
    - typings.devextreme.devextremeStrings.dot
    - typings.devextreme.devextremeStrings.image
    - typings.devextreme.devextremeStrings.pie
  */
  trait VectorMapMarkerType extends StObject
  object VectorMapMarkerType {
    
    inline def bubble: typings.devextreme.devextremeStrings.bubble = "bubble".asInstanceOf[typings.devextreme.devextremeStrings.bubble]
    
    inline def dot: typings.devextreme.devextremeStrings.dot = "dot".asInstanceOf[typings.devextreme.devextremeStrings.dot]
    
    inline def image: typings.devextreme.devextremeStrings.image = "image".asInstanceOf[typings.devextreme.devextremeStrings.image]
    
    inline def pie: typings.devextreme.devextremeStrings.pie = "pie".asInstanceOf[typings.devextreme.devextremeStrings.pie]
  }
  
  trait ZoomFactorChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val zoomFactor: Double
  }
  object ZoomFactorChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], zoomFactor: Double): ZoomFactorChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomFactorChangedEvent]
    }
    
    extension [Self <: ZoomFactorChangedEvent](x: Self) {
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
}
