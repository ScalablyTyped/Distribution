package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a CloseMatterRequest.
  */
@js.native
trait Schema$CloseMatterResponse extends js.Object {
  /**
    * The updated matter, with state CLOSED.
    */
  var matter: js.UndefOr[Schema$Matter] = js.native
}

object Schema$CloseMatterResponse {
  @scala.inline
  def apply(matter: Schema$Matter = null): Schema$CloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloseMatterResponse]
  }
}

