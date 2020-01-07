package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait Schema$HangoutsChatInfo extends js.Object {
  /**
    * A set of rooms to search.
    */
  var roomId: js.UndefOr[js.Array[String]] = js.native
}

object Schema$HangoutsChatInfo {
  @scala.inline
  def apply(roomId: js.Array[String] = null): Schema$HangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    if (roomId != null) __obj.updateDynamic("roomId")(roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HangoutsChatInfo]
  }
}

