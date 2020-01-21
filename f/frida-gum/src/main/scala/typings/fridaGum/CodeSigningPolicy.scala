package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.optional
  - typings.fridaGum.fridaGumStrings.required
*/
trait CodeSigningPolicy extends js.Object

object CodeSigningPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typings.fridaGum.fridaGumStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.fridaGum.fridaGumStrings.required = this.cast("required")
}

