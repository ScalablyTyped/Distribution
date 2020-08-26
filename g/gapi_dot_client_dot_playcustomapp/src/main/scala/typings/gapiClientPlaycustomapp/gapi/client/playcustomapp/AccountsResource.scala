package typings.gapiClientPlaycustomapp.gapi.client.playcustomapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var customApps: CustomAppsResource = js.native
}

object AccountsResource {
  @scala.inline
  def apply(customApps: CustomAppsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(customApps = customApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
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
    def setCustomApps(value: CustomAppsResource): Self = this.set("customApps", value.asInstanceOf[js.Any])
  }
  
}

