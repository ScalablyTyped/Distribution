package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceUnassigned event.
  */
@JSGlobal("ASPxClientGanttResourceUnassignedEventArgs")
@js.native
open class ASPxClientGanttResourceUnassignedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttResourceUnassignedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceUnassignedEventArgs class with specified settings.
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
