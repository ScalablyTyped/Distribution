package typings.firebaseFirestore.localSharedClientStateMod

import typings.firebaseFirestore.coreTypesMod.OnlineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "SharedOnlineState")
@js.native
class SharedOnlineState protected () extends js.Object {
  def this(clientId: String, onlineState: OnlineState) = this()
  val clientId: String = js.native
  val onlineState: OnlineState = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "SharedOnlineState")
@js.native
object SharedOnlineState extends js.Object {
  /**
    * Parses a SharedOnlineState from its JSON representation in WebStorage.
    * Logs a warning and returns null if the format of the data is not valid.
    */
  def fromWebStorageEntry(value: String): SharedOnlineState | Null = js.native
}

