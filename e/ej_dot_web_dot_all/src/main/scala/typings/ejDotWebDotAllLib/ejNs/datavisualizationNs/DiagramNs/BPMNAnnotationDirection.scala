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
  
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNAnnotationDirection with java.lang.String
  ] = js.native
}

