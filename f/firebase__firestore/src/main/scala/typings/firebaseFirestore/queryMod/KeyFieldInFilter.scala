package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.modelFieldValueMod.ArrayValue
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "KeyFieldInFilter")
@js.native
class KeyFieldInFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: ArrayValue) = this()
  @JSName("value")
  var value_KeyFieldInFilter: ArrayValue = js.native
}

