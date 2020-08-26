package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning the final processing of a callback.
  */
@JSGlobal("ASPxClientCallbackCompleteEventArgs")
@js.native
class ASPxClientCallbackCompleteEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCallbackCompleteEventArgs {
  /**
    * Initializes a new object of the ASPxClientCallbackCompleteEventArgs type with the specified settings.
    * @param parameter A string value that represents a parameter passed to the server for processing.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(parameter: String, result: String) = this()
}

