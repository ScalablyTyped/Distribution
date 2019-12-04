package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicDocumentReference")
@js.native
class PublicDocumentReference protected () extends DocumentReference {
  def this(_key: DocumentKey, firestore: Firestore) = this()
}

@JSImport("@firebase/firestore/dist/src/api/database", "PublicDocumentReference")
@js.native
object PublicDocumentReference extends Instantiable2[/* _key */ DocumentKey, /* firestore */ Firestore, DocumentReference] {
  def forPath(path: ResourcePath, firestore: Firestore): DocumentReference = js.native
}

