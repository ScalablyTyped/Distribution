package typings.fundamentalDashReact.libFormsFormMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalDashReact.fundamentalDashReactStrings.error
  - typings.fundamentalDashReact.fundamentalDashReactStrings.warning
  - typings.fundamentalDashReact.fundamentalDashReactStrings.help
*/
trait FormMessageType extends js.Object

object FormMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalDashReact.fundamentalDashReactStrings.error = this.cast("error")
  @scala.inline
  def help: typings.fundamentalDashReact.fundamentalDashReactStrings.help = this.cast("help")
  @scala.inline
  def warning: typings.fundamentalDashReact.fundamentalDashReactStrings.warning = this.cast("warning")
}

