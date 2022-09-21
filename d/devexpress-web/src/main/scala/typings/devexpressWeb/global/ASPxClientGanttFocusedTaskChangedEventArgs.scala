package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the FocusedTaskChanged event.
  */
@JSGlobal("ASPxClientGanttFocusedTaskChangedEventArgs")
@js.native
open class ASPxClientGanttFocusedTaskChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttFocusedTaskChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttFocusedTaskChangedEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task data.
    */
  def this(key: Any, values: Any) = this()
  
  /**
    * Returns the task key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Returns the task data.
    */
  /* CompleteClass */
  var values: Any = js.native
}
