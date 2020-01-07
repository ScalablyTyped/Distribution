package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hangouts chat search advanced options
  */
@js.native
trait Schema$HangoutsChatOptions extends js.Object {
  /**
    * Set to true to include rooms.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}

object Schema$HangoutsChatOptions {
  @scala.inline
  def apply(includeRooms: js.UndefOr[Boolean] = js.undefined): Schema$HangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeRooms)) __obj.updateDynamic("includeRooms")(includeRooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HangoutsChatOptions]
  }
}

