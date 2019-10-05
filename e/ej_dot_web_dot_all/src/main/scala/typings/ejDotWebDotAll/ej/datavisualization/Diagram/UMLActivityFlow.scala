package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UMLActivityFlow extends js.Object

@JSGlobal("ej.datavisualization.Diagram.UMLActivityFlow")
@js.native
object UMLActivityFlow extends js.Object {
  //Defines a activity flow as Control in UML Activity Diagram
  @js.native
  sealed trait Control extends UMLActivityFlow
  
  //Defines a activity flow as Exception in UML Activity Diagram
  @js.native
  sealed trait Exception extends UMLActivityFlow
  
  //Defines a activity flow as Object in UML Activity Diagram
  @js.native
  sealed trait Object extends UMLActivityFlow
  
  /* 1 */ val Control: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UMLActivityFlow.Control with Double = js.native
  /* 2 */ val Exception: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UMLActivityFlow.Exception with Double = js.native
  /* 0 */ val Object: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UMLActivityFlow.Object with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UMLActivityFlow with Double] = js.native
}

