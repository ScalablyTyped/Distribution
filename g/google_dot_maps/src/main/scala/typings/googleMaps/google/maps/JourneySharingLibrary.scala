package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable1
import typings.googleMaps.google.maps.journeySharing.FleetEngineShipmentLocationProvider
import typings.googleMaps.google.maps.journeySharing.FleetEngineShipmentLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineTripLocationProvider
import typings.googleMaps.google.maps.journeySharing.FleetEngineTripLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.JourneySharingMapView
import typings.googleMaps.google.maps.journeySharing.JourneySharingMapViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneySharingLibrary extends StObject {
  
  var AutomaticViewportMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.AutomaticViewportMode */ Any
  
  var DeliveryVehicleStopState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.DeliveryVehicleStopState */ Any
  
  var FleetEngineServiceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.FleetEngineServiceType */ Any
  
  var FleetEngineShipmentLocationProvider: Instantiable1[
    /* options */ FleetEngineShipmentLocationProviderOptions, 
    typings.googleMaps.google.maps.journeySharing.FleetEngineShipmentLocationProvider
  ]
  
  var FleetEngineTripLocationProvider: Instantiable1[
    /* options */ FleetEngineTripLocationProviderOptions, 
    typings.googleMaps.google.maps.journeySharing.FleetEngineTripLocationProvider
  ]
  
  var JourneySharingMapView: Instantiable1[
    /* options */ JourneySharingMapViewOptions, 
    typings.googleMaps.google.maps.journeySharing.JourneySharingMapView
  ]
}
object JourneySharingLibrary {
  
  inline def apply(
    AutomaticViewportMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.AutomaticViewportMode */ Any,
    DeliveryVehicleStopState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.DeliveryVehicleStopState */ Any,
    FleetEngineServiceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.FleetEngineServiceType */ Any,
    FleetEngineShipmentLocationProvider: Instantiable1[
      /* options */ FleetEngineShipmentLocationProviderOptions, 
      FleetEngineShipmentLocationProvider
    ],
    FleetEngineTripLocationProvider: Instantiable1[
      /* options */ FleetEngineTripLocationProviderOptions, 
      FleetEngineTripLocationProvider
    ],
    JourneySharingMapView: Instantiable1[/* options */ JourneySharingMapViewOptions, JourneySharingMapView]
  ): JourneySharingLibrary = {
    val __obj = js.Dynamic.literal(AutomaticViewportMode = AutomaticViewportMode.asInstanceOf[js.Any], DeliveryVehicleStopState = DeliveryVehicleStopState.asInstanceOf[js.Any], FleetEngineServiceType = FleetEngineServiceType.asInstanceOf[js.Any], FleetEngineShipmentLocationProvider = FleetEngineShipmentLocationProvider.asInstanceOf[js.Any], FleetEngineTripLocationProvider = FleetEngineTripLocationProvider.asInstanceOf[js.Any], JourneySharingMapView = JourneySharingMapView.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneySharingLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneySharingLibrary] (val x: Self) extends AnyVal {
    
    inline def setAutomaticViewportMode(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.AutomaticViewportMode */ Any
    ): Self = StObject.set(x, "AutomaticViewportMode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleStopState(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.DeliveryVehicleStopState */ Any
    ): Self = StObject.set(x, "DeliveryVehicleStopState", value.asInstanceOf[js.Any])
    
    inline def setFleetEngineServiceType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.journeySharing.FleetEngineServiceType */ Any
    ): Self = StObject.set(x, "FleetEngineServiceType", value.asInstanceOf[js.Any])
    
    inline def setFleetEngineShipmentLocationProvider(
      value: Instantiable1[
          /* options */ FleetEngineShipmentLocationProviderOptions, 
          FleetEngineShipmentLocationProvider
        ]
    ): Self = StObject.set(x, "FleetEngineShipmentLocationProvider", value.asInstanceOf[js.Any])
    
    inline def setFleetEngineTripLocationProvider(
      value: Instantiable1[
          /* options */ FleetEngineTripLocationProviderOptions, 
          FleetEngineTripLocationProvider
        ]
    ): Self = StObject.set(x, "FleetEngineTripLocationProvider", value.asInstanceOf[js.Any])
    
    inline def setJourneySharingMapView(value: Instantiable1[/* options */ JourneySharingMapViewOptions, JourneySharingMapView]): Self = StObject.set(x, "JourneySharingMapView", value.asInstanceOf[js.Any])
  }
}
