package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

