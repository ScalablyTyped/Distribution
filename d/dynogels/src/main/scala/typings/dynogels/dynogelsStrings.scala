package typings.dynogels

import typings.dynogels.mod.LifeCycleAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dynogelsStrings {
  @js.native
  sealed trait create extends LifeCycleAction
  
  @js.native
  sealed trait destroy extends LifeCycleAction
  
  @js.native
  sealed trait update extends LifeCycleAction
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

