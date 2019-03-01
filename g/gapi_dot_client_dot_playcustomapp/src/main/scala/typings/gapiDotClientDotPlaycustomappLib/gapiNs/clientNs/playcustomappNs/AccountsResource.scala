package typings
package gapiDotClientDotPlaycustomappLib.gapiNs.clientNs.playcustomappNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var customApps: CustomAppsResource
}

object AccountsResource {
  @scala.inline
  def apply(customApps: CustomAppsResource): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customApps")(customApps)
    __obj.asInstanceOf[AccountsResource]
  }
}

