package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationTaskOptions
  extends StObject
     with LocationOptions {
  
  /**
    * The type of user activity associated with the location updates.
    * @see See [Apple docs](https://developer.apple.com/documentation/corelocation/cllocationmanager/1620567-activitytype) for more details.
    * @default LocationActivityType.Other
    * @platform ios
    */
  var activityType: js.UndefOr[LocationActivityType] = js.undefined
  
  /**
    * The distance in meters that must occur between last reported location and the current location
    * before deferred locations are reported.
    * @default 0
    */
  var deferredUpdatesDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum time interval in milliseconds that must pass since last reported location before all
    * later locations are reported in a batched update
    * @default 0
    */
  var deferredUpdatesInterval: js.UndefOr[Double] = js.undefined
  
  var deferredUpdatesTimeout: js.UndefOr[Double] = js.undefined
  
  var foregroundService: js.UndefOr[LocationTaskServiceOptions] = js.undefined
  
  /**
    * A boolean value indicating whether the location manager can pause location
    * updates to improve battery life without sacrificing location data. When this option is set to
    * `true`, the location manager pauses updates (and powers down the appropriate hardware) at times
    * when the location data is unlikely to change. You can help the determination of when to pause
    * location updates by assigning a value to the `activityType` property.
    * @default false
    * @platform ios
    */
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean indicating whether the status bar changes its appearance when
    * location services are used in the background.
    * @default false
    * @platform ios 11+
    */
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined
}
object LocationTaskOptions {
  
  inline def apply(): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationTaskOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationTaskOptions] (val x: Self) extends AnyVal {
    
    inline def setActivityType(value: LocationActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setDeferredUpdatesDistance(value: Double): Self = StObject.set(x, "deferredUpdatesDistance", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesDistanceUndefined: Self = StObject.set(x, "deferredUpdatesDistance", js.undefined)
    
    inline def setDeferredUpdatesInterval(value: Double): Self = StObject.set(x, "deferredUpdatesInterval", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesIntervalUndefined: Self = StObject.set(x, "deferredUpdatesInterval", js.undefined)
    
    inline def setDeferredUpdatesTimeout(value: Double): Self = StObject.set(x, "deferredUpdatesTimeout", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesTimeoutUndefined: Self = StObject.set(x, "deferredUpdatesTimeout", js.undefined)
    
    inline def setForegroundService(value: LocationTaskServiceOptions): Self = StObject.set(x, "foregroundService", value.asInstanceOf[js.Any])
    
    inline def setForegroundServiceUndefined: Self = StObject.set(x, "foregroundService", js.undefined)
    
    inline def setPausesUpdatesAutomatically(value: Boolean): Self = StObject.set(x, "pausesUpdatesAutomatically", value.asInstanceOf[js.Any])
    
    inline def setPausesUpdatesAutomaticallyUndefined: Self = StObject.set(x, "pausesUpdatesAutomatically", js.undefined)
    
    inline def setShowsBackgroundLocationIndicator(value: Boolean): Self = StObject.set(x, "showsBackgroundLocationIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsBackgroundLocationIndicatorUndefined: Self = StObject.set(x, "showsBackgroundLocationIndicator", js.undefined)
  }
}
