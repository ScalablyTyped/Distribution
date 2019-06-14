package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as left
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as right
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection
  
  //Used to set the direction of BPMN Annotation as top
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection
  
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  /* 2 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection with scala.Double
  ] = js.native
}

