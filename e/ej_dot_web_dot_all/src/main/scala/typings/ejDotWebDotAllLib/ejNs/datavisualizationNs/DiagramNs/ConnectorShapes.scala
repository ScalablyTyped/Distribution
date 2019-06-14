package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ConnectorShapes")
@js.native
object ConnectorShapes extends js.Object {
  //Used to specify connector type as BPMN
  @js.native
  sealed trait BPMN
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes
  
  //Used to specify connector type as UMLActivity
  @js.native
  sealed trait UMLActivity
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes
  
  //Used to specify connector type as UMLClassifier
  @js.native
  sealed trait UMLClassifier
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes
  
  /* 0 */ val BPMN: BPMN with scala.Double = js.native
  /* 2 */ val UMLActivity: UMLActivity with scala.Double = js.native
  /* 1 */ val UMLClassifier: UMLClassifier with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes with scala.Double
  ] = js.native
}

