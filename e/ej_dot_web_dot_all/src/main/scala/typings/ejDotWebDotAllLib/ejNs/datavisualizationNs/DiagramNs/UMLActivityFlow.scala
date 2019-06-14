package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Control
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityFlow
  
  //Defines a activity flow as Exception in UML Activity Diagram
  @js.native
  sealed trait Exception
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityFlow
  
  //Defines a activity flow as Object in UML Activity Diagram
  @js.native
  sealed trait Object
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityFlow
  
  /* 1 */ val Control: Control with scala.Double = js.native
  /* 2 */ val Exception: Exception with scala.Double = js.native
  /* 0 */ val Object: Object with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityFlow with scala.Double
  ] = js.native
}

