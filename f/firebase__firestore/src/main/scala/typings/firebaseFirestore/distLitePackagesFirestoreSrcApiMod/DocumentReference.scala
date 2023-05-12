package typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api", "DocumentReference")
@js.native
open class DocumentReference[T] protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiReferenceMod.DocumentReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _key: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
  ) = this()
}
