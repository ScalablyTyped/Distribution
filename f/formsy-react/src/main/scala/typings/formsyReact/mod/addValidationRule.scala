package typings.formsyReact.mod

import typings.formsyReact.interfacesMod.ValidationFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react", "addValidationRule")
@js.native
object addValidationRule extends js.Object {
  def apply[V](name: String, func: ValidationFunction[V]): Unit = js.native
}

