package typings.firebaseFirestore.distPackagesFirestoreSrcMod

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src", "Query")
@js.native
open class Query_[T] protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Query_[T] {
  def this(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _query: Query
  ) = this()
  /** @hideconstructor protected */
  def this(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _query: Query
  ) = this()
}
