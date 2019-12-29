package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicDocumentReference")
@js.native
class PublicDocumentReference[T] protected () extends DocumentReference[T] {
  def this(_key: DocumentKey, firestore: Firestore) = this()
  def this(
    _key: DocumentKey,
    firestore: Firestore,
    _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ _]
  ) = this()
}

@JSImport("@firebase/firestore/dist/src/api/database", "PublicDocumentReference")
@js.native
object PublicDocumentReference
  extends Instantiable3[
      /* _key */ DocumentKey, 
      /* firestore */ Firestore, 
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
      DocumentReference[js.Object]
    ]
     with Instantiable2[/* _key */ DocumentKey, /* firestore */ Firestore, DocumentReference[js.Object]] {
  def forPath[U](path: ResourcePath, firestore: Firestore): DocumentReference[U] = js.native
  def forPath[U](path: ResourcePath, firestore: Firestore, converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

