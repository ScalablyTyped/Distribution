package typings.fundamentalDashReact.libFormsFormInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalDashReact.fundamentalDashReactStrings.normal
  - typings.fundamentalDashReact.fundamentalDashReactStrings.valid
  - typings.fundamentalDashReact.fundamentalDashReactStrings.invalid
  - typings.fundamentalDashReact.fundamentalDashReactStrings.warning
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid: typings.fundamentalDashReact.fundamentalDashReactStrings.invalid = this.cast("invalid")
  @scala.inline
  def normal: typings.fundamentalDashReact.fundamentalDashReactStrings.normal = this.cast("normal")
  @scala.inline
  def valid: typings.fundamentalDashReact.fundamentalDashReactStrings.valid = this.cast("valid")
  @scala.inline
  def warning: typings.fundamentalDashReact.fundamentalDashReactStrings.warning = this.cast("warning")
}

