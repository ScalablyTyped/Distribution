package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleServiceAccount extends js.Object {
  /** Required. */
  var accountEmail: js.UndefOr[String] = js.undefined
}

object GoogleServiceAccount {
  @scala.inline
  def apply(accountEmail: String = null): GoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleServiceAccount]
  }
}

