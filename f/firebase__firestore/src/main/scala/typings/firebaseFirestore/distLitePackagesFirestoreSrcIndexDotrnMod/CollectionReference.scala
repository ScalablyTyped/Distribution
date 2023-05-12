package typings.firebaseFirestore.distLitePackagesFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index.rn", "CollectionReference")
@js.native
open class CollectionReference[T] protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.CollectionReference[T] {
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: Null,
    _path: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.ResourcePath
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    converter: FirestoreDataConverter[T],
    _path: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.ResourcePath
  ) = this()
}
