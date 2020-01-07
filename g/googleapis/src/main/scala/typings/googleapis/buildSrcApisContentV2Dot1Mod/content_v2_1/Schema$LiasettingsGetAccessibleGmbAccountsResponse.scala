package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[Schema$GmbAccountsGmbAccount]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsGetAccessibleGmbAccountsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$LiasettingsGetAccessibleGmbAccountsResponse {
  @scala.inline
  def apply(
    accountId: String = null,
    gmbAccounts: js.Array[Schema$GmbAccountsGmbAccount] = null,
    kind: String = null
  ): Schema$LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsGetAccessibleGmbAccountsResponse]
  }
}

