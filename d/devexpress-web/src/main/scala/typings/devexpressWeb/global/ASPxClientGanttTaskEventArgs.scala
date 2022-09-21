package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the TaskClick and TaskDblClick events.
  */
@JSGlobal("ASPxClientGanttTaskEventArgs")
@js.native
open class ASPxClientGanttTaskEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task data.
    * @param htmlEvent Event parameters.
    */
  def this(key: Any, values: Any, htmlEvent: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the TaskClick and TaskDblClick events.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
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
