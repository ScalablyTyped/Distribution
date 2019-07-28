package typings.expressDashValidator

import typings.expressDashValidator.srcValidationDashResultMod.ResultFactory
import typings.expressDashValidator.srcValidationDashResultMod.ResultFactoryBuilderOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply[T](): ResultFactory[T] = js.native
  def apply[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}

