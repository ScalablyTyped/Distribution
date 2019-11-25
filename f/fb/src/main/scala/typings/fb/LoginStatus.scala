package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fb.fbStrings.connected
  - typings.fb.fbStrings.not_authorized
  - typings.fb.fbStrings.unknown
*/
trait LoginStatus extends js.Object

object LoginStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.fb.fbStrings.connected = this.cast("connected")
  @scala.inline
  def not_authorized: typings.fb.fbStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typings.fb.fbStrings.unknown = this.cast("unknown")
}

