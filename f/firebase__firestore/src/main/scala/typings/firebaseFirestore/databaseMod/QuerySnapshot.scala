package typings.firebaseFirestore.databaseMod

import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "QuerySnapshot")
@js.native
class QuerySnapshot[T] protected ()
  extends typings.firebaseFirestoreTypes.mod.QuerySnapshot[T] {
  def this(
    _firestore: Firestore,
    _originalQuery: typings.firebaseFirestore.queryMod.Query,
    _snapshot: ViewSnapshot
  ) = this()
  def this(
    _firestore: Firestore,
    _originalQuery: typings.firebaseFirestore.queryMod.Query,
    _snapshot: ViewSnapshot,
    _converter: FirestoreDataConverter[T]
  ) = this()
  var _cachedChanges: js.Any = js.native
  var _cachedChangesIncludeMetadataChanges: js.Any = js.native
  val _converter: js.UndefOr[js.Any] = js.native
  val _firestore: js.Any = js.native
  val _originalQuery: js.Any = js.native
  val _snapshot: js.Any = js.native
  var convertToDocumentImpl: js.Any = js.native
}

