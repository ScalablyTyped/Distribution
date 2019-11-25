package typings.fundamentalDashReact.libBadgeLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalDashReact.fundamentalDashReactStrings.success
  - typings.fundamentalDashReact.fundamentalDashReactStrings.warning
  - typings.fundamentalDashReact.fundamentalDashReactStrings.error
*/
trait LabelTypes extends js.Object

object LabelTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalDashReact.fundamentalDashReactStrings.error = this.cast("error")
  @scala.inline
  def success: typings.fundamentalDashReact.fundamentalDashReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.fundamentalDashReact.fundamentalDashReactStrings.warning = this.cast("warning")
}

