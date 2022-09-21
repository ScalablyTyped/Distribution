package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskInserted event.
  */
@JSGlobal("ASPxClientGanttTaskInsertedEventArgs")
@js.native
open class ASPxClientGanttTaskInsertedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTaskInsertedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTaskInsertedEventArgs class with specified settings.
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
