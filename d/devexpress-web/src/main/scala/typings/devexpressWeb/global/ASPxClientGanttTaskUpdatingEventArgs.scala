package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskUpdating event.
  */
@JSGlobal("ASPxClientGanttTaskUpdatingEventArgs")
@js.native
open class ASPxClientGanttTaskUpdatingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskUpdatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskUpdatingEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task values.
    * @param newValues The task values after update.
    */
  def this(key: Any, values: Any, newValues: Any) = this()
  
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
    * Specifies the task's new values.
    */
  /* CompleteClass */
  var newValues: Any = js.native
  
  /**
    * Specifies the task values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
