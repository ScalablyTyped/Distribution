package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterpriseAccount extends js.Object {
  /** The email address of the service account. */
  var accountEmail: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterpriseAccount". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EnterpriseAccount {
  @scala.inline
  def apply(accountEmail: java.lang.String = null, kind: java.lang.String = null): EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EnterpriseAccount]
  }
}

