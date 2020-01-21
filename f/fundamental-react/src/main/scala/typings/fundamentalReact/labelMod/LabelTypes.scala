package typings.fundamentalReact.labelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.success
  - typings.fundamentalReact.fundamentalReactStrings.warning
  - typings.fundamentalReact.fundamentalReactStrings.error
*/
trait LabelTypes extends js.Object

object LabelTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def success: typings.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

