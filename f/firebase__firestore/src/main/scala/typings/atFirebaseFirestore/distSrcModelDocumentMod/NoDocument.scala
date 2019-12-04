package typings.atFirebaseFirestore.distSrcModelDocumentMod

import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document", "NoDocument")
@js.native
class NoDocument protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion) = this()
  def this(key: DocumentKey, version: SnapshotVersion, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
}

