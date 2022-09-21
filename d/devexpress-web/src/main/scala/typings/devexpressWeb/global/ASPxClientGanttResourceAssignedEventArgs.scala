package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceAssigned event.
  */
@JSGlobal("ASPxClientGanttResourceAssignedEventArgs")
@js.native
open class ASPxClientGanttResourceAssignedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttResourceAssignedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceAssignedEventArgs class with specified settings.
    * @param values The resource values.
    */
  def this(values: Any) = this()
  
  /**
    * Specifies the resource assignment key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Specifies the resource values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
