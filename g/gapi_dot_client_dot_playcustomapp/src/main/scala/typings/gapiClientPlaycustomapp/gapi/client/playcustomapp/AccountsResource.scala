package typings.gapiClientPlaycustomapp.gapi.client.playcustomapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var customApps: CustomAppsResource
}

object AccountsResource {
  @scala.inline
  def apply(customApps: CustomAppsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(customApps = customApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
}

