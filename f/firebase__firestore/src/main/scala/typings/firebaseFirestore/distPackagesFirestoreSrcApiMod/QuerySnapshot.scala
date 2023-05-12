package typings.firebaseFirestore.distPackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src/api", "QuerySnapshot")
@js.native
open class QuerySnapshot[T] protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    _userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    query: Query[T],
    _snapshot: ViewSnapshot
  ) = this()
}
