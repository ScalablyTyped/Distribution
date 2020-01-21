package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNAnnotationDirection extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNAnnotationDirection")
@js.native
object BPMNAnnotationDirection extends js.Object {
  //Used to set the direction of BPMN Annotation as bottom
  @js.native
  sealed trait Bottom extends BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as left
  @js.native
  sealed trait Left extends BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as right
  @js.native
  sealed trait Right extends BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as top
  @js.native
  sealed trait Top extends BPMNAnnotationDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNAnnotationDirection with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 2 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

