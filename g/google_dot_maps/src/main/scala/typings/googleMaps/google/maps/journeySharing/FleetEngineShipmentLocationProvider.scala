package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineShipmentLocationProvider
  extends StObject
     with PollingLocationProvider {
  
  /**
    * Explicitly refreshes the tracked location.
    */
  def refresh(): Unit
  
  /**
    * The tracking ID for the task that this location provider observes. Set
    * this field to begin tracking.
    */
  var trackingId: String
}
object FleetEngineShipmentLocationProvider {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    isPolling: Boolean,
    pollingIntervalMillis: Double,
    refresh: () => Unit,
    trackingId: String
  ): FleetEngineShipmentLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), isPolling = isPolling.asInstanceOf[js.Any], pollingIntervalMillis = pollingIntervalMillis.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEngineShipmentLocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineShipmentLocationProvider] (val x: Self) extends AnyVal {
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
  }
}
