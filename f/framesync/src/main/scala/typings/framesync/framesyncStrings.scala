package typings.framesync

import typings.framesync.typesMod.StepId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object framesyncStrings {
  
  @scala.inline
  def postRender: postRender = "postRender".asInstanceOf[postRender]
  
  @scala.inline
  def preRender: preRender = "preRender".asInstanceOf[preRender]
  
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait postRender extends StepId
  
  @js.native
  sealed trait preRender extends StepId
  
  @js.native
  sealed trait read extends StepId
  
  @js.native
  sealed trait render extends StepId
  
  @js.native
  sealed trait update extends StepId
}
