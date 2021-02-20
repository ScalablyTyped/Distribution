package typings.framesync

import typings.framesync.typesMod.StepId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object framesyncStrings {
  
  @js.native
  sealed trait postRender extends StepId
  @scala.inline
  def postRender: postRender = "postRender".asInstanceOf[postRender]
  
  @js.native
  sealed trait preRender extends StepId
  @scala.inline
  def preRender: preRender = "preRender".asInstanceOf[preRender]
  
  @js.native
  sealed trait read extends StepId
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait render extends StepId
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait update extends StepId
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
