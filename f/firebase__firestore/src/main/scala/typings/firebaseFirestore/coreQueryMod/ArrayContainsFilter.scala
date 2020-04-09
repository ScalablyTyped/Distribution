package typings.firebaseFirestore.coreQueryMod

import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "ArrayContainsFilter")
@js.native
class ArrayContainsFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: Value) = this()
}

