package typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/watch_change", "DocumentWatchChange")
@js.native
class DocumentWatchChange protected () extends WatchChange {
  def this(
    /** The new document applies to all of these targets. */
  updatedTargetIds: js.Array[TargetId],
    /** The new document is removed from all of these targets. */
  removedTargetIds: js.Array[TargetId],
    /** The key of the document for this change. */
  key: DocumentKey
  ) = this()
  def this(
    /** The new document applies to all of these targets. */
  updatedTargetIds: js.Array[TargetId],
    /** The new document is removed from all of these targets. */
  removedTargetIds: js.Array[TargetId],
    /** The key of the document for this change. */
  key: DocumentKey,
    /**
    * The new document or NoDocument if it was deleted. Is null if the
    * document went out of view without the server sending a new document.
    */
  newDoc: MaybeDocument
  ) = this()
  /** The key of the document for this change. */
  var key: DocumentKey = js.native
  /**
    * The new document or NoDocument if it was deleted. Is null if the
    * document went out of view without the server sending a new document.
    */
  var newDoc: MaybeDocument | Null = js.native
  /** The new document is removed from all of these targets. */
  var removedTargetIds: js.Array[TargetId] = js.native
  /** The new document applies to all of these targets. */
  var updatedTargetIds: js.Array[TargetId] = js.native
}

