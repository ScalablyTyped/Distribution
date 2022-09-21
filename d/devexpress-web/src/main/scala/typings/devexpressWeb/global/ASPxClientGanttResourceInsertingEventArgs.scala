package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceInserting event.
  */
@JSGlobal("ASPxClientGanttResourceInsertingEventArgs")
@js.native
open class ASPxClientGanttResourceInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttResourceInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceInsertingEventArgs class with specified settings.
    * @param values The resource values.
    */
  def this(values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the resource values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
