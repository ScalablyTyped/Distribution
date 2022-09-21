package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskInserting event.
  */
@JSGlobal("ASPxClientGanttTaskInsertingEventArgs")
@js.native
open class ASPxClientGanttTaskInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskInsertingEventArgs class with specified settings.
    * @param values The task values.
    */
  def this(values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the task values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
