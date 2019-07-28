package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BPMN extends ConnectorShapes
  
  //Used to specify connector type as UMLActivity
  @js.native
  sealed trait UMLActivity extends ConnectorShapes
  
  //Used to specify connector type as UMLClassifier
  @js.native
  sealed trait UMLClassifier extends ConnectorShapes
  
  /* 0 */ val BPMN: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes.BPMN with Double = js.native
  /* 2 */ val UMLActivity: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes.UMLActivity with Double = js.native
  /* 1 */ val UMLClassifier: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes.UMLClassifier with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorShapes with Double] = js.native
}

