package typings.firebaseFirestore.coreQueryMod

import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.srcModelFieldValueMod.ArrayValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "KeyFieldInFilter")
@js.native
class KeyFieldInFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: ArrayValue) = this()
  @JSName("value")
  var value_KeyFieldInFilter: ArrayValue = js.native
}

