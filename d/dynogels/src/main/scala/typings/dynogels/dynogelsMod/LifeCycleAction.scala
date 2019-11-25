package typings.dynogels.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dynogels.dynogelsStrings.create
  - typings.dynogels.dynogelsStrings.update
  - typings.dynogels.dynogelsStrings.destroy
*/
trait LifeCycleAction extends js.Object

object LifeCycleAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.dynogels.dynogelsStrings.create = this.cast("create")
  @scala.inline
  def destroy: typings.dynogels.dynogelsStrings.destroy = this.cast("destroy")
  @scala.inline
  def update: typings.dynogels.dynogelsStrings.update = this.cast("update")
}

