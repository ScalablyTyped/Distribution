package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceDeleting event.
  */
@JSGlobal("ASPxClientGanttResourceDeletingEventArgs")
@js.native
open class ASPxClientGanttResourceDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttResourceDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceDeletingEventArgs class with specified settings.
    * @param key The resource key.
    * @param values The resource values.
    */
  def this(key: Any, values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the resource key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Specifies the resource values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
