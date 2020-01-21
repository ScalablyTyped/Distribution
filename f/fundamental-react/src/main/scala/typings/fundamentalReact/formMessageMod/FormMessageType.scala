package typings.fundamentalReact.formMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.error
  - typings.fundamentalReact.fundamentalReactStrings.warning
  - typings.fundamentalReact.fundamentalReactStrings.help
*/
trait FormMessageType extends js.Object

object FormMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def help: typings.fundamentalReact.fundamentalReactStrings.help = this.cast("help")
  @scala.inline
  def warning: typings.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

