package typings.firebaseFirestore.srcModelFieldValueMod

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "RefValue")
@js.native
class RefValue protected () extends FieldValue {
  def this(databaseId: DatabaseId, key: DocumentKey) = this()
  val databaseId: DatabaseId = js.native
  val key: DocumentKey = js.native
}

