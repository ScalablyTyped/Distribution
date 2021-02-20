package typings.dynogels

import typings.dynogels.mod.LifeCycleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynogelsStrings {
  
  @js.native
  sealed trait create extends LifeCycleAction
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait destroy extends LifeCycleAction
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait update extends LifeCycleAction
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
