package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GmbAccounts extends js.Object {
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[Schema$GmbAccountsGmbAccount]] = js.native
}

object Schema$GmbAccounts {
  @scala.inline
  def apply(accountId: String = null, gmbAccounts: js.Array[Schema$GmbAccountsGmbAccount] = null): Schema$GmbAccounts = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmbAccounts]
  }
}

