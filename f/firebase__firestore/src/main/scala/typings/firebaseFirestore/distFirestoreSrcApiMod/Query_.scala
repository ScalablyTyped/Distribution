package typings.firebaseFirestore.distFirestoreSrcApiMod

import typings.firebaseFirestore.distFirestoreSrcApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/api", "Query")
@js.native
open class Query_[T] protected () extends Query[T] {
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
  ) = this()
  /** @hideconstructor protected */
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
  ) = this()
}
