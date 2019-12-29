package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorShapes with Double] = js.native
  /* 0 */ @js.native
  object BPMN extends TopLevel[BPMN with Double]
  
  /* 2 */ @js.native
  object UMLActivity extends TopLevel[UMLActivity with Double]
  
  /* 1 */ @js.native
  object UMLClassifier extends TopLevel[UMLClassifier with Double]
  
}

