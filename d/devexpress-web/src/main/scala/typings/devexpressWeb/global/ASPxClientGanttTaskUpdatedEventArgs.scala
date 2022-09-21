package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskUpdated event.
  */
@JSGlobal("ASPxClientGanttTaskUpdatedEventArgs")
@js.native
open class ASPxClientGanttTaskUpdatedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskUpdatedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskUpdatedEventArgs class with specified settings.
    * @param values The task values.
    */
  def this(values: Any) = this()
  
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
