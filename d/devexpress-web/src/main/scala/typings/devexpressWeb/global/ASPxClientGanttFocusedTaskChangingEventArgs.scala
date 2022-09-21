package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the FocusedTaskChanging event.
  */
@JSGlobal("ASPxClientGanttFocusedTaskChangingEventArgs")
@js.native
open class ASPxClientGanttFocusedTaskChangingEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttFocusedTaskChangingEventArgs {
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Returns the task key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Returns the task data.
    */
  /* CompleteClass */
  var values: Any = js.native
}
