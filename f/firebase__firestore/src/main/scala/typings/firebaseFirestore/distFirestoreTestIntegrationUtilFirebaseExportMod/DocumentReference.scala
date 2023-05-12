package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "DocumentReference")
@js.native
open class DocumentReference[T] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.DocumentReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
}
