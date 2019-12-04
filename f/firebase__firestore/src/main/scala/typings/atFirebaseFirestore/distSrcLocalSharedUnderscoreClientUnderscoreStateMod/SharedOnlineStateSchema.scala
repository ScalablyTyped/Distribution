package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedOnlineStateSchema extends js.Object {
  /**
    * The clientId of the client that wrote this onlineState value. Tracked so
    * that on startup, clients can check if this client is still active when
    * determining whether to apply this value or not.
    */
  val clientId: String
  val onlineState: String
}

object SharedOnlineStateSchema {
  @scala.inline
  def apply(clientId: String, onlineState: String): SharedOnlineStateSchema = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], onlineState = onlineState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedOnlineStateSchema]
  }
}

