package typings.firebaseFirestore.documentMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/document", "MaybeDocument")
@js.native
abstract class MaybeDocument protected () extends js.Object {
  def this(key: DocumentKey, version: SnapshotVersion) = this()
  val key: DocumentKey = js.native
  val version: SnapshotVersion = js.native
  /**
    * Whether this document had a local mutation applied that has not yet been
    * acknowledged by Watch.
    */
  def hasPendingWrites: Boolean = js.native
  def isEqual(): Boolean = js.native
  def isEqual(other: MaybeDocument): Boolean = js.native
}

