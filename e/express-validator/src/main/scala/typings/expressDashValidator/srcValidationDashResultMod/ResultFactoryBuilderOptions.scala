package typings.expressDashValidator.srcValidationDashResultMod

import typings.expressDashValidator.srcBaseMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultFactoryBuilderOptions[T] extends js.Object {
  @JSName("formatter")
  var formatter_Original: ErrorFormatter[T] = js.native
  def formatter(error: ValidationError): T = js.native
}

