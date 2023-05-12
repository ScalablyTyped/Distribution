package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutesLibrary extends StObject {
  
  var DirectionsRenderer: Instantiable1[
    /* opts */ js.UndefOr[DirectionsRendererOptions | Null], 
    typings.googleMaps.google.maps.DirectionsRenderer
  ]
  
  var DirectionsService: Instantiable0[typings.googleMaps.google.maps.DirectionsService]
  
  var DirectionsStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DirectionsStatus */ Any
  
  var DistanceMatrixElementStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixElementStatus */ Any
  
  var DistanceMatrixService: Instantiable0[typings.googleMaps.google.maps.DistanceMatrixService]
  
  var DistanceMatrixStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixStatus */ Any
  
  var TrafficModel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TrafficModel */ Any
  
  var TransitMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitMode */ Any
  
  var TransitRoutePreference: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitRoutePreference */ Any
  
  var TravelMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TravelMode */ Any
  
  var VehicleType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.VehicleType */ Any
}
object RoutesLibrary {
  
  inline def apply(
    DirectionsRenderer: Instantiable1[/* opts */ js.UndefOr[DirectionsRendererOptions | Null], DirectionsRenderer],
    DirectionsService: Instantiable0[DirectionsService],
    DirectionsStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DirectionsStatus */ Any,
    DistanceMatrixElementStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixElementStatus */ Any,
    DistanceMatrixService: Instantiable0[DistanceMatrixService],
    DistanceMatrixStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixStatus */ Any,
    TrafficModel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TrafficModel */ Any,
    TransitMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitMode */ Any,
    TransitRoutePreference: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitRoutePreference */ Any,
    TravelMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TravelMode */ Any,
    VehicleType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.VehicleType */ Any
  ): RoutesLibrary = {
    val __obj = js.Dynamic.literal(DirectionsRenderer = DirectionsRenderer.asInstanceOf[js.Any], DirectionsService = DirectionsService.asInstanceOf[js.Any], DirectionsStatus = DirectionsStatus.asInstanceOf[js.Any], DistanceMatrixElementStatus = DistanceMatrixElementStatus.asInstanceOf[js.Any], DistanceMatrixService = DistanceMatrixService.asInstanceOf[js.Any], DistanceMatrixStatus = DistanceMatrixStatus.asInstanceOf[js.Any], TrafficModel = TrafficModel.asInstanceOf[js.Any], TransitMode = TransitMode.asInstanceOf[js.Any], TransitRoutePreference = TransitRoutePreference.asInstanceOf[js.Any], TravelMode = TravelMode.asInstanceOf[js.Any], VehicleType = VehicleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutesLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutesLibrary] (val x: Self) extends AnyVal {
    
    inline def setDirectionsRenderer(value: Instantiable1[/* opts */ js.UndefOr[DirectionsRendererOptions | Null], DirectionsRenderer]): Self = StObject.set(x, "DirectionsRenderer", value.asInstanceOf[js.Any])
    
    inline def setDirectionsService(value: Instantiable0[DirectionsService]): Self = StObject.set(x, "DirectionsService", value.asInstanceOf[js.Any])
    
    inline def setDirectionsStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DirectionsStatus */ Any
    ): Self = StObject.set(x, "DirectionsStatus", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixElementStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixElementStatus */ Any
    ): Self = StObject.set(x, "DistanceMatrixElementStatus", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixService(value: Instantiable0[DistanceMatrixService]): Self = StObject.set(x, "DistanceMatrixService", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.DistanceMatrixStatus */ Any
    ): Self = StObject.set(x, "DistanceMatrixStatus", value.asInstanceOf[js.Any])
    
    inline def setTrafficModel(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TrafficModel */ Any
    ): Self = StObject.set(x, "TrafficModel", value.asInstanceOf[js.Any])
    
    inline def setTransitMode(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitMode */ Any
    ): Self = StObject.set(x, "TransitMode", value.asInstanceOf[js.Any])
    
    inline def setTransitRoutePreference(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TransitRoutePreference */ Any
    ): Self = StObject.set(x, "TransitRoutePreference", value.asInstanceOf[js.Any])
    
    inline def setTravelMode(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.TravelMode */ Any
    ): Self = StObject.set(x, "TravelMode", value.asInstanceOf[js.Any])
    
    inline def setVehicleType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.VehicleType */ Any
    ): Self = StObject.set(x, "VehicleType", value.asInstanceOf[js.Any])
  }
}
