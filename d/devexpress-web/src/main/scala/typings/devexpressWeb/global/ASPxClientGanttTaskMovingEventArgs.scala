package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskMoving event.
  */
@JSGlobal("ASPxClientGanttTaskMovingEventArgs")
@js.native
open class ASPxClientGanttTaskMovingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskMovingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskMovingEventArgs class with specified settings.
    * @param key The task key.
    * @param values The task values.
    * @param newValues The task values after moving.
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
    * Specifies the task values after moving.
    */
  /* CompleteClass */
  var newValues: Any = js.native
  
  /**
    * Specifies the task values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
