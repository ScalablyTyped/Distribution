package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationServicesEnabled extends js.Object {
  var locationServicesEnabled: Boolean = js.native
}

object LocationServicesEnabled {
  @scala.inline
  def apply(locationServicesEnabled: Boolean): LocationServicesEnabled = {
    val __obj = js.Dynamic.literal(locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationServicesEnabled]
  }
  @scala.inline
  implicit class LocationServicesEnabledOps[Self <: LocationServicesEnabled] (val x: Self) extends AnyVal {
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
    def setLocationServicesEnabled(value: Boolean): Self = this.set("locationServicesEnabled", value.asInstanceOf[js.Any])
  }
  
}

