package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleMaps.anon.TypeofMarker
import typings.googleMaps.google.maps.marker.AdvancedMarkerClickEvent
import typings.googleMaps.google.maps.marker.AdvancedMarkerElement
import typings.googleMaps.google.maps.marker.AdvancedMarkerElementOptions
import typings.googleMaps.google.maps.marker.PinElement
import typings.googleMaps.google.maps.marker.PinElementOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLibrary extends StObject {
  
  var AdvancedMarkerClickEvent: Instantiable0[typings.googleMaps.google.maps.marker.AdvancedMarkerClickEvent]
  
  var AdvancedMarkerElement: Instantiable1[
    /* options */ js.UndefOr[AdvancedMarkerElementOptions], 
    typings.googleMaps.google.maps.marker.AdvancedMarkerElement
  ]
  
  var Animation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.Animation */ Any
  
  var CollisionBehavior: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.CollisionBehavior */ Any
  
  var Marker: TypeofMarker
  
  var PinElement: Instantiable1[
    /* options */ js.UndefOr[PinElementOptions], 
    typings.googleMaps.google.maps.marker.PinElement
  ]
}
object MarkerLibrary {
  
  inline def apply(
    AdvancedMarkerClickEvent: Instantiable0[AdvancedMarkerClickEvent],
    AdvancedMarkerElement: Instantiable1[/* options */ js.UndefOr[AdvancedMarkerElementOptions], AdvancedMarkerElement],
    Animation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.Animation */ Any,
    CollisionBehavior: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.CollisionBehavior */ Any,
    Marker: TypeofMarker,
    PinElement: Instantiable1[/* options */ js.UndefOr[PinElementOptions], PinElement]
  ): MarkerLibrary = {
    val __obj = js.Dynamic.literal(AdvancedMarkerClickEvent = AdvancedMarkerClickEvent.asInstanceOf[js.Any], AdvancedMarkerElement = AdvancedMarkerElement.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], CollisionBehavior = CollisionBehavior.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], PinElement = PinElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerLibrary] (val x: Self) extends AnyVal {
    
    inline def setAdvancedMarkerClickEvent(value: Instantiable0[AdvancedMarkerClickEvent]): Self = StObject.set(x, "AdvancedMarkerClickEvent", value.asInstanceOf[js.Any])
    
    inline def setAdvancedMarkerElement(
      value: Instantiable1[/* options */ js.UndefOr[AdvancedMarkerElementOptions], AdvancedMarkerElement]
    ): Self = StObject.set(x, "AdvancedMarkerElement", value.asInstanceOf[js.Any])
    
    inline def setAnimation(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.Animation */ Any
    ): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setCollisionBehavior(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.CollisionBehavior */ Any
    ): Self = StObject.set(x, "CollisionBehavior", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: TypeofMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setPinElement(value: Instantiable1[/* options */ js.UndefOr[PinElementOptions], PinElement]): Self = StObject.set(x, "PinElement", value.asInstanceOf[js.Any])
  }
}
