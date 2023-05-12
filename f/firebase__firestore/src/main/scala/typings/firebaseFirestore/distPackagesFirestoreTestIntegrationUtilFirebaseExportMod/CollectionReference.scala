package typings.firebaseFirestore.distPackagesFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/test/integration/util/firebase_export", "CollectionReference")
@js.native
open class CollectionReference[T] protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcMod.CollectionReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: Null,
    _path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: FirestoreDataConverter[T],
    _path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
  ) = this()
}
