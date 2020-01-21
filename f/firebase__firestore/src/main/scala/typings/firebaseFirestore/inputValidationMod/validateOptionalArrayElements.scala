package typings.firebaseFirestore.inputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/input_validation", "validateOptionalArrayElements")
@js.native
object validateOptionalArrayElements extends js.Object {
  def apply[T](
    functionName: String,
    optionName: String,
    typeDescription: String,
    argument: js.UndefOr[scala.Nothing],
    validator: js.Function1[/* arg0 */ T, Boolean]
  ): Unit = js.native
  def apply[T](
    functionName: String,
    optionName: String,
    typeDescription: String,
    argument: js.Array[T],
    validator: js.Function1[/* arg0 */ T, Boolean]
  ): Unit = js.native
}

