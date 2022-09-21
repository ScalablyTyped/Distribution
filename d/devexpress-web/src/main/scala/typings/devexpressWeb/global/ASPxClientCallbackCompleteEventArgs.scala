package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events concerning the final processing of a callback.
  */
@JSGlobal("ASPxClientCallbackCompleteEventArgs")
@js.native
open class ASPxClientCallbackCompleteEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCallbackCompleteEventArgs {
  /**
    * Initializes a new object of the ASPxClientCallbackCompleteEventArgs type with the specified settings.
    * @param parameter A string value that represents a parameter passed to the server for processing.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(parameter: String, result: String) = this()
  
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  /* CompleteClass */
  var parameter: String = js.native
  
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing.
    */
  /* CompleteClass */
  var result: String = js.native
}
