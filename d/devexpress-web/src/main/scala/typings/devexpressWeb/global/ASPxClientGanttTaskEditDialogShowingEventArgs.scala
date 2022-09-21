package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskEditDialogShowing event.
  */
@JSGlobal("ASPxClientGanttTaskEditDialogShowingEventArgs")
@js.native
open class ASPxClientGanttTaskEditDialogShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskEditDialogShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskEditDialogShowingEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task values.
    * @param readOnlyFields An array of read-only fields.
    * @param hiddenFields An array of hidden fields.
    */
  def this(key: Any, values: Any, readOnlyFields: js.Array[String], hiddenFields: js.Array[String]) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies hidden fields in the edit dialog.
    */
  /* CompleteClass */
  var hiddenFields: js.Array[String] = js.native
  
  /**
    * Specifies the task key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Specifies read-only fields in the edit dialog.
    */
  /* CompleteClass */
  var readOnlyFields: js.Array[String] = js.native
  
  /**
    * Specifies the task values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
