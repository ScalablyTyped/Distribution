package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentChange
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "changesFromSnapshot")
@js.native
object changesFromSnapshot extends js.Object {
  def apply[T](firestore: Firestore, includeMetadataChanges: Boolean, snapshot: ViewSnapshot): js.Array[DocumentChange[T]] = js.native
  def apply[T](
    firestore: Firestore,
    includeMetadataChanges: Boolean,
    snapshot: ViewSnapshot,
    converter: FirestoreDataConverter[T]
  ): js.Array[DocumentChange[T]] = js.native
}

