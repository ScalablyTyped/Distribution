package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

