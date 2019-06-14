package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.optional
  - fridaDashGumLib.fridaDashGumLibStrings.required
*/
trait CodeSigningPolicy extends js.Object

object CodeSigningPolicy {
  @scala.inline
  def Optional: fridaDashGumLib.fridaDashGumLibStrings.optional = this.cast("optional")
  @scala.inline
  def Required: fridaDashGumLib.fridaDashGumLibStrings.required = this.cast("required")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

