package typings.detox.mod._Global_.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.detox.detoxStrings.always
  - typings.detox.detoxStrings.inuse
  - typings.detox.detoxStrings.never
  - typings.detox.detoxStrings.unset
*/
trait LocationPermission extends js.Object

object LocationPermission {
  @scala.inline
  def always: typings.detox.detoxStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inuse: typings.detox.detoxStrings.inuse = this.cast("inuse")
  @scala.inline
  def never: typings.detox.detoxStrings.never = this.cast("never")
  @scala.inline
  def unset: typings.detox.detoxStrings.unset = this.cast("unset")
}

