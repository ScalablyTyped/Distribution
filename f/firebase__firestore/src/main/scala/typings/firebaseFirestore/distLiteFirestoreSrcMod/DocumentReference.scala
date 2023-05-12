package typings.firebaseFirestore.distLiteFirestoreSrcMod

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src", "DocumentReference")
@js.native
open class DocumentReference[T] protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.DocumentReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _key: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
}
