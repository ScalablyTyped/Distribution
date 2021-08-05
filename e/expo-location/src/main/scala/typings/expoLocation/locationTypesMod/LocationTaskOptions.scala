package typings.expoLocation.locationTypesMod

import typings.expoLocation.anon.NotificationBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationTaskOptions
  extends StObject
     with LocationOptions {
  
  var activityType: js.UndefOr[LocationActivityType] = js.undefined
  
  var deferredUpdatesDistance: js.UndefOr[Double] = js.undefined
  
  var deferredUpdatesInterval: js.UndefOr[Double] = js.undefined
  
  var deferredUpdatesTimeout: js.UndefOr[Double] = js.undefined
  
  var foregroundService: js.UndefOr[NotificationBody] = js.undefined
  
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined
  
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined
}
object LocationTaskOptions {
  
  inline def apply(): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationTaskOptions]
  }
  
  extension [Self <: LocationTaskOptions](x: Self) {
    
    inline def setActivityType(value: LocationActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setDeferredUpdatesDistance(value: Double): Self = StObject.set(x, "deferredUpdatesDistance", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesDistanceUndefined: Self = StObject.set(x, "deferredUpdatesDistance", js.undefined)
    
    inline def setDeferredUpdatesInterval(value: Double): Self = StObject.set(x, "deferredUpdatesInterval", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesIntervalUndefined: Self = StObject.set(x, "deferredUpdatesInterval", js.undefined)
    
    inline def setDeferredUpdatesTimeout(value: Double): Self = StObject.set(x, "deferredUpdatesTimeout", value.asInstanceOf[js.Any])
    
    inline def setDeferredUpdatesTimeoutUndefined: Self = StObject.set(x, "deferredUpdatesTimeout", js.undefined)
    
    inline def setForegroundService(value: NotificationBody): Self = StObject.set(x, "foregroundService", value.asInstanceOf[js.Any])
    
    inline def setForegroundServiceUndefined: Self = StObject.set(x, "foregroundService", js.undefined)
    
    inline def setPausesUpdatesAutomatically(value: Boolean): Self = StObject.set(x, "pausesUpdatesAutomatically", value.asInstanceOf[js.Any])
    
    inline def setPausesUpdatesAutomaticallyUndefined: Self = StObject.set(x, "pausesUpdatesAutomatically", js.undefined)
    
    inline def setShowsBackgroundLocationIndicator(value: Boolean): Self = StObject.set(x, "showsBackgroundLocationIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsBackgroundLocationIndicatorUndefined: Self = StObject.set(x, "showsBackgroundLocationIndicator", js.undefined)
  }
}
