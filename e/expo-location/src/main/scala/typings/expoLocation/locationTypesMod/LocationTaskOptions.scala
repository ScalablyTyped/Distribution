package typings.expoLocation.locationTypesMod

import typings.expoLocation.anon.NotificationBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-location.expo-location/build/Location.types.LocationOptions & {  showsBackgroundLocationIndicator :boolean | undefined,   deferredUpdatesDistance :number | undefined,   deferredUpdatesTimeout :number | undefined,   deferredUpdatesInterval :number | undefined,   activityType :expo-location.expo-location/build/Location.types.LocationActivityType | undefined,   pausesUpdatesAutomatically :boolean | undefined,   foregroundService :{  notificationTitle :string,   notificationBody :string,   notificationColor :string | undefined} | undefined} */
@js.native
trait LocationTaskOptions extends js.Object {
  
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
  implicit class LocationTaskOptionsOps[Self <: LocationTaskOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccuracy(value: LocationAccuracy): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setActivityType(value: LocationActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesDistance(value: Double): Self = this.set("deferredUpdatesDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredUpdatesDistance: Self = this.set("deferredUpdatesDistance", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesInterval(value: Double): Self = this.set("deferredUpdatesInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredUpdatesInterval: Self = this.set("deferredUpdatesInterval", js.undefined)
    
    @scala.inline
    def setDeferredUpdatesTimeout(value: Double): Self = this.set("deferredUpdatesTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredUpdatesTimeout: Self = this.set("deferredUpdatesTimeout", js.undefined)
    
    @scala.inline
    def setDistanceInterval(value: Double): Self = this.set("distanceInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceInterval: Self = this.set("distanceInterval", js.undefined)
    
    @scala.inline
    def setForegroundService(value: NotificationBody): Self = this.set("foregroundService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundService: Self = this.set("foregroundService", js.undefined)
    
    @scala.inline
    def setMayShowUserSettingsDialog(value: Boolean): Self = this.set("mayShowUserSettingsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMayShowUserSettingsDialog: Self = this.set("mayShowUserSettingsDialog", js.undefined)
    
    @scala.inline
    def setPausesUpdatesAutomatically(value: Boolean): Self = this.set("pausesUpdatesAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePausesUpdatesAutomatically: Self = this.set("pausesUpdatesAutomatically", js.undefined)
    
    @scala.inline
    def setShowsBackgroundLocationIndicator(value: Boolean): Self = this.set("showsBackgroundLocationIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsBackgroundLocationIndicator: Self = this.set("showsBackgroundLocationIndicator", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: Double): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
  }
}
