package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskDeleting event.
  */
@JSGlobal("ASPxClientGanttTaskDeletingEventArgs")
@js.native
open class ASPxClientGanttTaskDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskDeletingEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task values.
    */
  def this(key: Any, values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
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
