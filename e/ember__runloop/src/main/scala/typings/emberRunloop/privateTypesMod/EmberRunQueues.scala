package typings.emberRunloop.privateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emberRunloop.emberRunloopStrings.sync
  - typings.emberRunloop.emberRunloopStrings.actions
  - typings.emberRunloop.emberRunloopStrings.routerTransitions
  - typings.emberRunloop.emberRunloopStrings.render
  - typings.emberRunloop.emberRunloopStrings.afterRender
  - typings.emberRunloop.emberRunloopStrings.destroy
*/
trait EmberRunQueues extends js.Object

object EmberRunQueues {
  @scala.inline
  def actions: typings.emberRunloop.emberRunloopStrings.actions = this.cast("actions")
  @scala.inline
  def afterRender: typings.emberRunloop.emberRunloopStrings.afterRender = this.cast("afterRender")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typings.emberRunloop.emberRunloopStrings.destroy = this.cast("destroy")
  @scala.inline
  def render: typings.emberRunloop.emberRunloopStrings.render = this.cast("render")
  @scala.inline
  def routerTransitions: typings.emberRunloop.emberRunloopStrings.routerTransitions = this.cast("routerTransitions")
  @scala.inline
  def sync: typings.emberRunloop.emberRunloopStrings.sync = this.cast("sync")
}

