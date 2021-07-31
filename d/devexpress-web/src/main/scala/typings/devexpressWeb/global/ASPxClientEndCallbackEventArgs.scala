package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to the completion of a callback processing round trip.
  */
@JSGlobal("ASPxClientEndCallbackEventArgs")
@js.native
class ASPxClientEndCallbackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientEndCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientEndCallbackEventArgs object.
    * @param command Specifies the command.
    */
  def this(command: String) = this()
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  var command: String = js.native
}
