package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingLocationProvider
  extends StObject
     with LocationProvider {
  
  /**
    * True if this location provider is polling. Read only.
    */
  var isPolling: Boolean
  
  /**
    * Minimum time between fetching location updates in milliseconds. If it
    * takes longer than <code>pollingIntervalMillis</code> to fetch a location
    * update, the next location update is not started until the current one
    * finishes. <br><br>Setting this value to 0, Infinity, or a negative value
    * disables automatic location updates. A new location update is fetched
    * once if the tracking ID parameter (for example, the shipment tracking ID
    * of the shipment location provider), or a filtering option (for example,
    * viewport bounds or attribute filters for fleet location providers)
    * changes. <br><br>The default, and minimum, polling interval is 5000
    * milliseconds. If you set the polling interval to a lower positive value,
    * 5000 is stored and used.
    */
  var pollingIntervalMillis: Double
}
object PollingLocationProvider {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    isPolling: Boolean,
    pollingIntervalMillis: Double
  ): PollingLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), isPolling = isPolling.asInstanceOf[js.Any], pollingIntervalMillis = pollingIntervalMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollingLocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PollingLocationProvider] (val x: Self) extends AnyVal {
    
    inline def setIsPolling(value: Boolean): Self = StObject.set(x, "isPolling", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
  }
}
