package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch create held accounts.
  */
@js.native
trait Schema$AddHeldAccountsResponse extends js.Object {
  /**
    * The list of responses, in the same order as the batch request.
    */
  var responses: js.UndefOr[js.Array[Schema$AddHeldAccountResult]] = js.native
}

object Schema$AddHeldAccountsResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$AddHeldAccountResult] = null): Schema$AddHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddHeldAccountsResponse]
  }
}

