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
  
  @scala.inline
  def apply(): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationTaskOptions]
  }
  
  @scala.inline
  implicit class LocationTaskOptionsMutableBuilder[Self <: LocationTaskOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: LocationActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesDistance(value: Double): Self = StObject.set(x, "deferredUpdatesDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUpdatesDistanceUndefined: Self = StObject.set(x, "deferredUpdatesDistance", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesInterval(value: Double): Self = StObject.set(x, "deferredUpdatesInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUpdatesIntervalUndefined: Self = StObject.set(x, "deferredUpdatesInterval", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesTimeout(value: Double): Self = StObject.set(x, "deferredUpdatesTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUpdatesTimeoutUndefined: Self = StObject.set(x, "deferredUpdatesTimeout", js.undefined)
    
    @scala.inline
    def setForegroundService(value: NotificationBody): Self = StObject.set(x, "foregroundService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundServiceUndefined: Self = StObject.set(x, "foregroundService", js.undefined)
    
    @scala.inline
    def setPausesUpdatesAutomatically(value: Boolean): Self = StObject.set(x, "pausesUpdatesAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausesUpdatesAutomaticallyUndefined: Self = StObject.set(x, "pausesUpdatesAutomatically", js.undefined)
    
    @scala.inline
    def setShowsBackgroundLocationIndicator(value: Boolean): Self = StObject.set(x, "showsBackgroundLocationIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsBackgroundLocationIndicatorUndefined: Self = StObject.set(x, "showsBackgroundLocationIndicator", js.undefined)
  }
}
