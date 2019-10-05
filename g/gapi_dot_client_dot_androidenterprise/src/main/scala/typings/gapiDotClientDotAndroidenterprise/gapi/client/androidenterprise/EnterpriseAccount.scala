package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterpriseAccount extends js.Object {
  /** The email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterpriseAccount". */
  var kind: js.UndefOr[String] = js.undefined
}

object EnterpriseAccount {
  @scala.inline
  def apply(accountEmail: String = null, kind: String = null): EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EnterpriseAccount]
  }
}

