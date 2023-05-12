package typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiReferenceMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api", "Query")
@js.native
open class Query_[T] protected () extends Query[T] {
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _query: typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query
  ) = this()
  /** @hideconstructor protected */
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _query: typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query
  ) = this()
}
