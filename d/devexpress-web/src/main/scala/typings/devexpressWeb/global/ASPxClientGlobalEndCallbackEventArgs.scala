package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
@JSGlobal("ASPxClientGlobalEndCallbackEventArgs")
@js.native
open class ASPxClientGlobalEndCallbackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGlobalEndCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalEndCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    */
  def this(control: typings.devexpressWeb.ASPxClientControl) = this()
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  var command: String = js.native
  
  /**
    * Gets an object that initiated a callback.
    */
  /* CompleteClass */
  var control: typings.devexpressWeb.ASPxClientControl = js.native
}
