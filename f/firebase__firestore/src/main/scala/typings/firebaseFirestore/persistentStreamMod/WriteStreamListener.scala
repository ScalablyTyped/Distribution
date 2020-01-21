package typings.firebaseFirestore.persistentStreamMod

import typings.firebaseFirestore.mutationMod.MutationResult
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStreamListener extends PersistentStreamListener {
  /**
    * Called by the PersistentWriteStream upon a successful handshake response
    * from the server, which is the receiver's cue to send any pending writes.
    */
  def onHandshakeComplete(): js.Promise[Unit] = js.native
  /**
    * Called by the PersistentWriteStream upon receiving a StreamingWriteResponse
    * from the server that contains a mutation result.
    */
  def onMutationResult(commitVersion: SnapshotVersion, results: js.Array[MutationResult]): js.Promise[Unit] = js.native
}

