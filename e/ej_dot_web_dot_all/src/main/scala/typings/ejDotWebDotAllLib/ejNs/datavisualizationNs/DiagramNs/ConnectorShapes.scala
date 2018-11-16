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
  
  val BPMN: BPMN with java.lang.String = js.native
  val UMLActivity: UMLActivity with java.lang.String = js.native
  val UMLClassifier: UMLClassifier with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorShapes with java.lang.String
  ] = js.native
}

