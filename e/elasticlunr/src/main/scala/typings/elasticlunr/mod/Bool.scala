package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticlunr.elasticlunrStrings.OR
  - typings.elasticlunr.elasticlunrStrings.AND
*/
trait Bool extends js.Object

object Bool {
  @scala.inline
  def AND: typings.elasticlunr.elasticlunrStrings.AND = this.cast("AND")
  @scala.inline
  def OR: typings.elasticlunr.elasticlunrStrings.OR = this.cast("OR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

