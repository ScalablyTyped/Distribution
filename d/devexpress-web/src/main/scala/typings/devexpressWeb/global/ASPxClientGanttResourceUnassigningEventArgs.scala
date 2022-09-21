package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceUnassigning event.
  */
@JSGlobal("ASPxClientGanttResourceUnassigningEventArgs")
@js.native
open class ASPxClientGanttResourceUnassigningEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttResourceUnassigningEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceUnassigningEventArgs class with specified settings.
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
