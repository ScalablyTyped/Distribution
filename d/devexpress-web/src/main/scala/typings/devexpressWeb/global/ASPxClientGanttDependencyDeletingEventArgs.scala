package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the DependencyDeleting event.
  */
@JSGlobal("ASPxClientGanttDependencyDeletingEventArgs")
@js.native
open class ASPxClientGanttDependencyDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttDependencyDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttDependencyDeletingEventArgs class with specified settings.
    * @param key The dependency key.
    * @param values The dependency values.
    */
  def this(key: Any, values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the dependency key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Specifies the dependency values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
