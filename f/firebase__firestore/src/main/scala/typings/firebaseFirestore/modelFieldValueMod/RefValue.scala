package typings.firebaseFirestore.modelFieldValueMod

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "RefValue")
@js.native
class RefValue protected () extends FieldValue {
  def this(databaseId: DatabaseId, key: DocumentKey) = this()
  val databaseId: DatabaseId = js.native
  val key: DocumentKey = js.native
}

