package typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api", "QuerySnapshot")
@js.native
open class QuerySnapshot[T] protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
    _userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    query: Query[T],
    _snapshot: ViewSnapshot
  ) = this()
}
