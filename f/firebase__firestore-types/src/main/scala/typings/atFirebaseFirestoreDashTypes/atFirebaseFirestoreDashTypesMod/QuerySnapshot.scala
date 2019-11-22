package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "QuerySnapshot")
@js.native
class QuerySnapshot protected () extends js.Object {
  val docs: js.Array[QueryDocumentSnapshot] = js.native
  val empty: Boolean = js.native
  val metadata: SnapshotMetadata = js.native
  val query: Query = js.native
  val size: Double = js.native
  def docChanges(): js.Array[DocumentChange] = js.native
  def docChanges(options: SnapshotListenOptions): js.Array[DocumentChange] = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot, Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot, Unit], thisArg: js.Any): Unit = js.native
  def isEqual(other: QuerySnapshot): Boolean = js.native
}

