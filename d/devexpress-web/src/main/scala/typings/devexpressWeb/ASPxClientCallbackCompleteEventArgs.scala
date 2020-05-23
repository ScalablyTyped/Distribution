package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning the final processing of a callback.
  */
trait ASPxClientCallbackCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: String
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing.
    */
  var result: String
}

object ASPxClientCallbackCompleteEventArgs {
  @scala.inline
  def apply(parameter: String, result: String): ASPxClientCallbackCompleteEventArgs = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCallbackCompleteEventArgs]
  }
}

