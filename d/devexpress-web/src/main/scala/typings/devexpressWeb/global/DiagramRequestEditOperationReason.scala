package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares client constants that identify the reason the diagram requests an edit operation's availability.
  */
@JSGlobal("DiagramRequestEditOperationReason")
@js.native
open class DiagramRequestEditOperationReason ()
  extends StObject
     with typings.devexpressWeb.DiagramRequestEditOperationReason
object DiagramRequestEditOperationReason {
  
  /**
    * Indicates that the control is updating the UI. Set the allowed property to `false` to hide the UI element associated with the specified operation.
    */
  /* static member */
  @JSGlobal("DiagramRequestEditOperationReason.CheckUIElementAvailability")
  @js.native
  val CheckUIElementAvailability: String = js.native
  
  /**
    * Indicates if a user attempts an edit operation. You can specify whether to allow the operation and display an error message if necessary.
    */
  /* static member */
  @JSGlobal("DiagramRequestEditOperationReason.ModelModification")
  @js.native
  val ModelModification: String = js.native
}
