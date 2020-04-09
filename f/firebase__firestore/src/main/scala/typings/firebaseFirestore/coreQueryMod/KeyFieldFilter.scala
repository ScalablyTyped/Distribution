package typings.firebaseFirestore.coreQueryMod

import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "KeyFieldFilter")
@js.native
class KeyFieldFilter protected () extends FieldFilter {
  def this(field: FieldPath, op: Operator, value: Value) = this()
  val key: js.Any = js.native
}

