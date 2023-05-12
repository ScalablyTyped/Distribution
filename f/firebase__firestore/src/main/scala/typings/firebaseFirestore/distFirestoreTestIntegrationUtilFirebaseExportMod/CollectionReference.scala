package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "CollectionReference")
@js.native
open class CollectionReference[T] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.CollectionReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: Null,
    _path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: FirestoreDataConverter[T],
    _path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
  ) = this()
}
