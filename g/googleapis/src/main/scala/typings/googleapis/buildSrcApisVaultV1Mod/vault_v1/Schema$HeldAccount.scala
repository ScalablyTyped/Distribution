package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An account being held in a particular hold. This structure is immutable.
  * This can be either a single user or a google group, depending on the
  * corpus.
  */
@js.native
trait Schema$HeldAccount extends js.Object {
  /**
    * The account&#39;s ID as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/&quot;&gt;Admin
    * SDK&lt;/a&gt;.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * When the account was put on hold.
    */
  var holdTime: js.UndefOr[String] = js.native
}

object Schema$HeldAccount {
  @scala.inline
  def apply(accountId: String = null, holdTime: String = null): Schema$HeldAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (holdTime != null) __obj.updateDynamic("holdTime")(holdTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HeldAccount]
  }
}

