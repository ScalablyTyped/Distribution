package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch delete held accounts.
  */
@js.native
trait Schema$RemoveHeldAccountsResponse extends js.Object {
  /**
    * A list of statuses for deleted accounts. Results have the same order as
    * the request.
    */
  var statuses: js.UndefOr[js.Array[Schema$Status]] = js.native
}

object Schema$RemoveHeldAccountsResponse {
  @scala.inline
  def apply(statuses: js.Array[Schema$Status] = null): Schema$RemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemoveHeldAccountsResponse]
  }
}

