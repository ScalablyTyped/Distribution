package typings.expoLocation.locationTypesMod

import typings.expoLocation.anon.NotificationBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-location.expo-location/build/Location.types.LocationOptions & {  showsBackgroundLocationIndicator :boolean | undefined,   deferredUpdatesDistance :number | undefined,   deferredUpdatesTimeout :number | undefined,   deferredUpdatesInterval :number | undefined,   activityType :expo-location.expo-location/build/Location.types.LocationActivityType | undefined,   pausesUpdatesAutomatically :boolean | undefined,   foregroundService :{  notificationTitle :string,   notificationBody :string,   notificationColor :string | undefined} | undefined} */
@js.native
trait LocationTaskOptions extends StObject {
  
  /**
    * Location manager accuracy. Pass one of `LocationAccuracy` enum values.
    * For low-accuracies the implementation can avoid geolocation providers
    * that consume a significant amount of power (such as GPS).
    */
  var accuracy: js.UndefOr[LocationAccuracy] = js.native
  
  var activityType: js.UndefOr[LocationActivityType] = js.native
  
  var deferredUpdatesDistance: js.UndefOr[Double] = js.native
  
  var deferredUpdatesInterval: js.UndefOr[Double] = js.native
  
  var deferredUpdatesTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Receive updates only when the location has changed by at least this distance in meters.
    * Default value may depend on `accuracy` option.
    */
  var distanceInterval: js.UndefOr[Double] = js.native
  
  var foregroundService: js.UndefOr[NotificationBody] = js.native
  
  /**
    * (Android only) Specifies whether to ask the user to turn on improved accuracy location mode
    * which uses Wi-Fi, cell networks and GPS sensor. Defaults to `true`.
    */
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.native
  
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.native
  
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * (Android only) Minimum time to wait between each update in milliseconds.
    * Default value may depend on `accuracy` option.
    */
  var timeInterval: js.UndefOr[Double] = js.native
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
    def setAccuracy(value: LocationAccuracy): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
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
    def setDistanceInterval(value: Double): Self = StObject.set(x, "distanceInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceIntervalUndefined: Self = StObject.set(x, "distanceInterval", js.undefined)
    
    @scala.inline
    def setForegroundService(value: NotificationBody): Self = StObject.set(x, "foregroundService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundServiceUndefined: Self = StObject.set(x, "foregroundService", js.undefined)
    
    @scala.inline
    def setMayShowUserSettingsDialog(value: Boolean): Self = StObject.set(x, "mayShowUserSettingsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMayShowUserSettingsDialogUndefined: Self = StObject.set(x, "mayShowUserSettingsDialog", js.undefined)
    
    @scala.inline
    def setPausesUpdatesAutomatically(value: Boolean): Self = StObject.set(x, "pausesUpdatesAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausesUpdatesAutomaticallyUndefined: Self = StObject.set(x, "pausesUpdatesAutomatically", js.undefined)
    
    @scala.inline
    def setShowsBackgroundLocationIndicator(value: Boolean): Self = StObject.set(x, "showsBackgroundLocationIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsBackgroundLocationIndicatorUndefined: Self = StObject.set(x, "showsBackgroundLocationIndicator", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
  }
}
