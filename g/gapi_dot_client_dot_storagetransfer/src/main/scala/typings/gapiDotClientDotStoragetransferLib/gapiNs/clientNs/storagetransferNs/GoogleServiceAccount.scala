package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleServiceAccount extends js.Object {
  /** Required. */
  var accountEmail: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleServiceAccount {
  @scala.inline
  def apply(accountEmail: java.lang.String = null): GoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail)
    __obj.asInstanceOf[GoogleServiceAccount]
  }
}

