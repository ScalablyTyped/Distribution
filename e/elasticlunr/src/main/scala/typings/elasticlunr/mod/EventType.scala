package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticlunr.elasticlunrStrings.add
  - typings.elasticlunr.elasticlunrStrings.update
  - typings.elasticlunr.elasticlunrStrings.remove
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typings.elasticlunr.elasticlunrStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typings.elasticlunr.elasticlunrStrings.remove = this.cast("remove")
  @scala.inline
  def update: typings.elasticlunr.elasticlunrStrings.update = this.cast("update")
}

