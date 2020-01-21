package typings.firebaseFirestore.inputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/input_validation", "validateArrayElements")
@js.native
object validateArrayElements extends js.Object {
  def apply[T](
    functionName: String,
    optionName: String,
    typeDescription: String,
    argument: js.Array[T],
    validator: js.Function1[/* arg0 */ T, Boolean]
  ): Unit = js.native
}

