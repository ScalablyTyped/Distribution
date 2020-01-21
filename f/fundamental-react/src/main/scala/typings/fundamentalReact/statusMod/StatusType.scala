package typings.fundamentalReact.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.success
  - typings.fundamentalReact.fundamentalReactStrings.warning
  - typings.fundamentalReact.fundamentalReactStrings.error
  - typings.fundamentalReact.fundamentalReactStrings.available
  - typings.fundamentalReact.fundamentalReactStrings.away
  - typings.fundamentalReact.fundamentalReactStrings.busy
  - typings.fundamentalReact.fundamentalReactStrings.offline
*/
trait StatusType extends js.Object

object StatusType {
  @scala.inline
  def available: typings.fundamentalReact.fundamentalReactStrings.available = this.cast("available")
  @scala.inline
  def away: typings.fundamentalReact.fundamentalReactStrings.away = this.cast("away")
  @scala.inline
  def busy: typings.fundamentalReact.fundamentalReactStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def offline: typings.fundamentalReact.fundamentalReactStrings.offline = this.cast("offline")
  @scala.inline
  def success: typings.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

