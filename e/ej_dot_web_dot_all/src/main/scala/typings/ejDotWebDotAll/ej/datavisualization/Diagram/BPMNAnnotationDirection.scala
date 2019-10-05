package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNAnnotationDirection with Double] = js.native
}

