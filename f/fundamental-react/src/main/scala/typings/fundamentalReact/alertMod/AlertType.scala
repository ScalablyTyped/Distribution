package typings.fundamentalReact.alertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.warning
  - typings.fundamentalReact.fundamentalReactStrings.error
  - typings.fundamentalReact.fundamentalReactStrings.success
  - typings.fundamentalReact.fundamentalReactStrings.information
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def information: typings.fundamentalReact.fundamentalReactStrings.information = this.cast("information")
  @scala.inline
  def success: typings.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

