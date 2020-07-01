package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseFirestore.userDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "applyFirestoreDataConverter")
@js.native
object applyFirestoreDataConverter extends js.Object {
  def apply[T](converter: Null, value: T, functionName: String): js.Tuple2[DocumentData, String] = js.native
  def apply[T](converter: UntypedFirestoreDataConverter[T], value: T, functionName: String): js.Tuple2[DocumentData, String] = js.native
}

