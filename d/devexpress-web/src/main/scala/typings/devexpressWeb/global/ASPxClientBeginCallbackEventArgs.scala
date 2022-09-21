package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
@JSGlobal("ASPxClientBeginCallbackEventArgs")
@js.native
open class ASPxClientBeginCallbackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientBeginCallbackEventArgs object with the specified setting.
    * @param command A string value that specifies the command.
    */
  def this(command: String) = this()
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  var command: String = js.native
}
