package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomCallback event.
  */
trait ASPxClientCustomDataCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing, related to the CustomCallback event.
    */
  var result: String
}

object ASPxClientCustomDataCallbackEventArgs {
  @scala.inline
  def apply(result: String): ASPxClientCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomDataCallbackEventArgs]
  }
}

