package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "Query")
@js.native
open class Query_[T] protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.Query_[T] {
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _query: Query
  ) = this()
  /** @hideconstructor protected */
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _query: Query
  ) = this()
}
