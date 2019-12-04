package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "QuerySnapshot")
@js.native
class QuerySnapshot protected ()
  extends typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot {
  def this(
    _firestore: Firestore,
    _originalQuery: typings.atFirebaseFirestore.distSrcCoreQueryMod.Query,
    _snapshot: ViewSnapshot
  ) = this()
  var _cachedChanges: js.Any = js.native
  var _cachedChangesIncludeMetadataChanges: js.Any = js.native
  var _firestore: js.Any = js.native
  var _originalQuery: js.Any = js.native
  var _snapshot: js.Any = js.native
  var convertToDocumentImpl: js.Any = js.native
}

