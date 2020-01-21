package typings.fundamentalReact.formInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.normal
  - typings.fundamentalReact.fundamentalReactStrings.valid
  - typings.fundamentalReact.fundamentalReactStrings.invalid
  - typings.fundamentalReact.fundamentalReactStrings.warning
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid: typings.fundamentalReact.fundamentalReactStrings.invalid = this.cast("invalid")
  @scala.inline
  def normal: typings.fundamentalReact.fundamentalReactStrings.normal = this.cast("normal")
  @scala.inline
  def valid: typings.fundamentalReact.fundamentalReactStrings.valid = this.cast("valid")
  @scala.inline
  def warning: typings.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

