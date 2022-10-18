package typings.framesync

import typings.framesync.libTypesMod.StepId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object framesyncStrings {
  
  @js.native
  sealed trait postRender
    extends StObject
       with StepId
  inline def postRender: postRender = "postRender".asInstanceOf[postRender]
  
  @js.native
  sealed trait postUpdate
    extends StObject
       with StepId
  inline def postUpdate: postUpdate = "postUpdate".asInstanceOf[postUpdate]
  
  @js.native
  sealed trait preRender
    extends StObject
       with StepId
  inline def preRender: preRender = "preRender".asInstanceOf[preRender]
  
  @js.native
  sealed trait read
    extends StObject
       with StepId
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait render
    extends StObject
       with StepId
  inline def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait update
    extends StObject
       with StepId
  inline def update: update = "update".asInstanceOf[update]
}
