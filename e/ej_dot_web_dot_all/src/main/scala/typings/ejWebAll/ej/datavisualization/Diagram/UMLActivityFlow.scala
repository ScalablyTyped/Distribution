package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UMLActivityFlow with Double] = js.native
  /* 1 */ @js.native
  object Control extends TopLevel[Control with Double]
  
  /* 2 */ @js.native
  object Exception extends TopLevel[Exception with Double]
  
  /* 0 */ @js.native
  object Object extends TopLevel[Object with Double]
  
}

