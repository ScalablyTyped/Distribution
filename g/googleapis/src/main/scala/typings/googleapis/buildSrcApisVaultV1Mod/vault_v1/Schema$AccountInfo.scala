package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait Schema$AccountInfo extends js.Object {
  /**
    * A set of accounts to search.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AccountInfo {
  @scala.inline
  def apply(emails: js.Array[String] = null): Schema$AccountInfo = {
    val __obj = js.Dynamic.literal()
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountInfo]
  }
}

