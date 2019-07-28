package typings.expressDashValidator

import typings.expressDashValidator.srcValidationDashResultMod.ResultFactory
import typings.expressDashValidator.srcValidationDashResultMod.ResultFactoryBuilderOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_WithDefaults extends js.Object {
  @JSName("withDefaults")
  var withDefaults_Original: Fn_Options = js.native
  def withDefaults[T](): ResultFactory[T] = js.native
  def withDefaults[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}

