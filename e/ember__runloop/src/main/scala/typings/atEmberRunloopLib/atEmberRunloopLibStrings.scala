package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atEmberRunloopLibStrings {
  @js.native
  sealed trait actions
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @js.native
  sealed trait afterRender
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @js.native
  sealed trait destroy
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @js.native
  sealed trait render
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @js.native
  sealed trait routerTransitions
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @js.native
  sealed trait sync
    extends atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues
  
  @scala.inline
  def actions: actions = "actions".asInstanceOf[actions]
  @scala.inline
  def afterRender: afterRender = "afterRender".asInstanceOf[afterRender]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  @scala.inline
  def routerTransitions: routerTransitions = "routerTransitions".asInstanceOf[routerTransitions]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
}

