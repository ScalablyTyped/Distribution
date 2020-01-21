package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning the final processing of a callback.
  */
@JSGlobal("ASPxClientCallbackCompleteEventArgs")
@js.native
class ASPxClientCallbackCompleteEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientCallbackCompleteEventArgs type with the specified settings.
    * @param parameter A string value that represents a parameter passed to the server for processing.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(parameter: String, result: String) = this()
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: String = js.native
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing.
    */
  var result: String = js.native
}

