package typings.dynogels

import typings.dynogels.mod.LifeCycleAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynogelsStrings {
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait create extends LifeCycleAction
  
  @js.native
  sealed trait destroy extends LifeCycleAction
  
  @js.native
  sealed trait update extends LifeCycleAction
}
