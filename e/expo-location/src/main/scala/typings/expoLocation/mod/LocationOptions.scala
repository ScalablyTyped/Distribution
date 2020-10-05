package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.native
  var distanceInterval: js.UndefOr[Double] = js.native
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.native
  var timeInterval: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
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
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setMayShowUserSettingsDialog(value: Boolean): Self = this.set("mayShowUserSettingsDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMayShowUserSettingsDialog: Self = this.set("mayShowUserSettingsDialog", js.undefined)
    @scala.inline
    def setTimeInterval(value: Double): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

