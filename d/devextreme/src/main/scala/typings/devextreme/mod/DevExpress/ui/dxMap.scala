package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMap
  extends StObject
     with Widget[dxMapOptions] {
  
  def addMarker(markerOptions: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a marker to the map.
    */
  def addMarker(markerOptions: Any): DxPromise[Any] = js.native
  
  def addRoute(options: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a route to the map.
    */
  def addRoute(options: Any): DxPromise[Any] = js.native
  
  def removeMarker(marker: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a marker from the map.
    */
  def removeMarker(marker: Any): DxPromise[Unit] = js.native
  def removeMarker(marker: Double): DxPromise[Unit] = js.native
  
  def removeRoute(route: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a route from the map.
    */
  def removeRoute(route: Any): DxPromise[Unit] = js.native
  def removeRoute(route: Double): DxPromise[Unit] = js.native
}
object dxMap {
  
  type ClickEvent = NativeEventInfo[dxMap, MouseEvent | PointerEvent]
  
  type DisposingEvent = EventInfo[dxMap]
  
  type InitializedEvent = InitializedEventInfo[dxMap]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.bing
    - typings.devextreme.devextremeStrings.google
    - typings.devextreme.devextremeStrings.googleStatic
  */
  trait MapProvider extends StObject
  object MapProvider {
    
    inline def bing: typings.devextreme.devextremeStrings.bing = "bing".asInstanceOf[typings.devextreme.devextremeStrings.bing]
    
    inline def google: typings.devextreme.devextremeStrings.google = "google".asInstanceOf[typings.devextreme.devextremeStrings.google]
    
    inline def googleStatic: typings.devextreme.devextremeStrings.googleStatic = "googleStatic".asInstanceOf[typings.devextreme.devextremeStrings.googleStatic]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.hybrid
    - typings.devextreme.devextremeStrings.roadmap
    - typings.devextreme.devextremeStrings.satellite
  */
  trait MapType extends StObject
  object MapType {
    
    inline def hybrid: typings.devextreme.devextremeStrings.hybrid = "hybrid".asInstanceOf[typings.devextreme.devextremeStrings.hybrid]
    
    inline def roadmap: typings.devextreme.devextremeStrings.roadmap = "roadmap".asInstanceOf[typings.devextreme.devextremeStrings.roadmap]
    
    inline def satellite: typings.devextreme.devextremeStrings.satellite = "satellite".asInstanceOf[typings.devextreme.devextremeStrings.satellite]
  }
  
  trait MarkerAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalMarker: Any
  }
  object MarkerAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalMarker: Any): MarkerAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalMarker = originalMarker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerAddedEvent]
    }
    
    extension [Self <: MarkerAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalMarker(value: Any): Self = StObject.set(x, "originalMarker", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object MarkerRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): MarkerRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerRemovedEvent]
    }
    
    extension [Self <: MarkerRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxMapOptions
  
  trait ReadyEvent
    extends StObject
       with EventInfo[dxMap] {
    
    var originalMap: Any
  }
  object ReadyEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], originalMap: Any): ReadyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], originalMap = originalMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadyEvent]
    }
    
    extension [Self <: ReadyEvent](x: Self) {
      
      inline def setOriginalMap(value: Any): Self = StObject.set(x, "originalMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalRoute: Any
  }
  object RouteAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalRoute: Any): RouteAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalRoute = originalRoute.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteAddedEvent]
    }
    
    extension [Self <: RouteAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalRoute(value: Any): Self = StObject.set(x, "originalRoute", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.driving
    - typings.devextreme.devextremeStrings.walking
  */
  trait RouteMode extends StObject
  object RouteMode {
    
    inline def driving: typings.devextreme.devextremeStrings.driving = "driving".asInstanceOf[typings.devextreme.devextremeStrings.driving]
    
    inline def walking: typings.devextreme.devextremeStrings.walking = "walking".asInstanceOf[typings.devextreme.devextremeStrings.walking]
  }
  
  trait RouteRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object RouteRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): RouteRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRemovedEvent]
    }
    
    extension [Self <: RouteRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
