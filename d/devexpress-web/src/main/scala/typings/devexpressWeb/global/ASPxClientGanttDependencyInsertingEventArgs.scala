package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the DependencyInserting event.
  */
@JSGlobal("ASPxClientGanttDependencyInsertingEventArgs")
@js.native
open class ASPxClientGanttDependencyInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttDependencyInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttDependencyInsertingEventArgs class with specified settings.
    * @param values The dependency values.
    */
  def this(values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies the dependency values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
