package typings.atEmberRunloop.dashPrivateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atEmberRunloop.atEmberRunloopStrings.sync
  - typings.atEmberRunloop.atEmberRunloopStrings.actions
  - typings.atEmberRunloop.atEmberRunloopStrings.routerTransitions
  - typings.atEmberRunloop.atEmberRunloopStrings.render
  - typings.atEmberRunloop.atEmberRunloopStrings.afterRender
  - typings.atEmberRunloop.atEmberRunloopStrings.destroy
*/
trait EmberRunQueues extends js.Object

object EmberRunQueues {
  @scala.inline
  def actions: typings.atEmberRunloop.atEmberRunloopStrings.actions = this.cast("actions")
  @scala.inline
  def afterRender: typings.atEmberRunloop.atEmberRunloopStrings.afterRender = this.cast("afterRender")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typings.atEmberRunloop.atEmberRunloopStrings.destroy = this.cast("destroy")
  @scala.inline
  def render: typings.atEmberRunloop.atEmberRunloopStrings.render = this.cast("render")
  @scala.inline
  def routerTransitions: typings.atEmberRunloop.atEmberRunloopStrings.routerTransitions = this.cast("routerTransitions")
  @scala.inline
  def sync: typings.atEmberRunloop.atEmberRunloopStrings.sync = this.cast("sync")
}

