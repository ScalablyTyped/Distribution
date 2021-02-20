package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends StObject {
  
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
  implicit class LocationOptionsMutableBuilder[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: LocationAccuracy): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setDistanceInterval(value: Double): Self = StObject.set(x, "distanceInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceIntervalUndefined: Self = StObject.set(x, "distanceInterval", js.undefined)
    
    @scala.inline
    def setMayShowUserSettingsDialog(value: Boolean): Self = StObject.set(x, "mayShowUserSettingsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMayShowUserSettingsDialogUndefined: Self = StObject.set(x, "mayShowUserSettingsDialog", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
  }
}
