package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("ASPxClientGlobalBeginCallbackEventArgs")
@js.native
class ASPxClientGlobalBeginCallbackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGlobalBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: typings.devexpressWeb.ASPxClientControl, command: String) = this()
  
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
