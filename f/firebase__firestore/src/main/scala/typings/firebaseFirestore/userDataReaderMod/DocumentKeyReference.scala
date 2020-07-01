package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/user_data_reader", "DocumentKeyReference")
@js.native
class DocumentKeyReference[T] protected () extends js.Object {
  def this(_databaseId: DatabaseId, _key: DocumentKey) = this()
  def this(_databaseId: DatabaseId, _key: DocumentKey, _converter: UntypedFirestoreDataConverter[T]) = this()
  val _converter: UntypedFirestoreDataConverter[T] | Null = js.native
  val _databaseId: DatabaseId = js.native
  val _key: DocumentKey = js.native
}

