package typings.firebaseFirestore.sharedClientStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/shared_client_state", "MemorySharedClientState")
@js.native
class MemorySharedClientState () extends SharedClientState {
  var localState: js.Any = js.native
  var queryState: js.Any = js.native
}

