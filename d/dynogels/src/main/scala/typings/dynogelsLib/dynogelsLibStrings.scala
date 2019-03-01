package typings
package dynogelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dynogelsLibStrings {
  @js.native
  sealed trait create
    extends dynogelsLib.dynogelsMod.LifeCycleAction
  
  @js.native
  sealed trait destroy
    extends dynogelsLib.dynogelsMod.LifeCycleAction
  
  @js.native
  sealed trait update
    extends dynogelsLib.dynogelsMod.LifeCycleAction
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

