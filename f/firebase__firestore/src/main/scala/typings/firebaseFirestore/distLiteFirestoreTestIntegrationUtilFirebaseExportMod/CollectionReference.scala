package typings.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/firebase_export", "CollectionReference")
@js.native
open class CollectionReference[T] protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcMod.CollectionReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: Null,
    _path: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: FirestoreDataConverter[T],
    _path: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
  ) = this()
}
