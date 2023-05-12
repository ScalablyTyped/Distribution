package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QuerySnapshot")
@js.native
open class QuerySnapshot[T] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.QuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    _userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    query: Query[T],
    _snapshot: ViewSnapshot
  ) = this()
}
