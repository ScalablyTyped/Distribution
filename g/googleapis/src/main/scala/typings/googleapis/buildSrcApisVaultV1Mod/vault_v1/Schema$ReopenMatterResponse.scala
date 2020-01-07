package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a ReopenMatterRequest.
  */
@js.native
trait Schema$ReopenMatterResponse extends js.Object {
  /**
    * The updated matter, with state OPEN.
    */
  var matter: js.UndefOr[Schema$Matter] = js.native
}

object Schema$ReopenMatterResponse {
  @scala.inline
  def apply(matter: Schema$Matter = null): Schema$ReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReopenMatterResponse]
  }
}

