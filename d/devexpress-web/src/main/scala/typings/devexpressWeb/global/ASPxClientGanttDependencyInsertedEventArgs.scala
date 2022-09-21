package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the DependencyInserted event.
  */
@JSGlobal("ASPxClientGanttDependencyInsertedEventArgs")
@js.native
open class ASPxClientGanttDependencyInsertedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttDependencyInsertedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttDependencyInsertedEventArgs class with specified settings.
    * @param values The dependency data.
    */
  def this(values: Any) = this()
  
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
