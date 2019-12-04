package typings.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod

import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
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

