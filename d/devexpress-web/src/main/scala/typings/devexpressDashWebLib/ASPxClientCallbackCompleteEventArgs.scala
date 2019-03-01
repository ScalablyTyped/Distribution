package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning the final processing of a callback.
  */
trait ASPxClientCallbackCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    * Value: A string value representing specific information passed from the client to the server side.
    */
  var parameter: java.lang.String
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing.
    * Value: A string value representing specific information passed from the server back to the client side.
    */
  var result: java.lang.String
}

object ASPxClientCallbackCompleteEventArgs {
  @scala.inline
  def apply(parameter: java.lang.String, result: java.lang.String): ASPxClientCallbackCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameter")(parameter)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ASPxClientCallbackCompleteEventArgs]
  }
}

