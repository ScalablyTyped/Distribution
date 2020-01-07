package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remove an account as a matter collaborator.
  */
@js.native
trait Schema$RemoveMatterPermissionsRequest extends js.Object {
  /**
    * The account ID.
    */
  var accountId: js.UndefOr[String] = js.native
}

object Schema$RemoveMatterPermissionsRequest {
  @scala.inline
  def apply(accountId: String = null): Schema$RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemoveMatterPermissionsRequest]
  }
}

