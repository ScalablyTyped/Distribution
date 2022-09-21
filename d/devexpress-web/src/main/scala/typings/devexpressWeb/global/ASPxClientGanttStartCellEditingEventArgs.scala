package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the StartCellEditing event.
  */
@JSGlobal("ASPxClientGanttStartCellEditingEventArgs")
@js.native
open class ASPxClientGanttStartCellEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttStartCellEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttStartCellEditingEventArgs class with specified settings.
    * @param key The task key.
    * @param focusedFieldName The field name of the focused task.
    * @param values The task values.
    */
  def this(key: Any, focusedFieldName: String, values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the field name of the focused task.
    */
  /* CompleteClass */
  var focusedFieldName: String = js.native
  
  /**
    * Specifies the task key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Specifies the task values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
