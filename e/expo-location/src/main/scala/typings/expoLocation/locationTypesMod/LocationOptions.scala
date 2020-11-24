package typings.expoLocation.locationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends js.Object {
  
  /**
    * Location manager accuracy. Pass one of `LocationAccuracy` enum values.
    * For low-accuracies the implementation can avoid geolocation providers
    * that consume a significant amount of power (such as GPS).
    */
  var accuracy: js.UndefOr[LocationAccuracy] = js.native
  
  /**
    * Receive updates only when the location has changed by at least this distance in meters.
    * Default value may depend on `accuracy` option.
    */
  var distanceInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Android only) Specifies whether to ask the user to turn on improved accuracy location mode
    * which uses Wi-Fi, cell networks and GPS sensor. Defaults to `true`.
    */
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.native
  
  /**
    * (Android only) Minimum time to wait between each update in milliseconds.
    * Default value may depend on `accuracy` option.
    */
  var timeInterval: js.UndefOr[Double] = js.native
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
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
    def setDistanceInterval(value: Double): Self = this.set("distanceInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceInterval: Self = this.set("distanceInterval", js.undefined)
    
    @scala.inline
    def setMayShowUserSettingsDialog(value: Boolean): Self = this.set("mayShowUserSettingsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMayShowUserSettingsDialog: Self = this.set("mayShowUserSettingsDialog", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: Double): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
  }
}
