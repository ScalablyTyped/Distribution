package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomCallback event.
  */
@JSGlobal("ASPxClientCustomDataCallbackEventArgs")
@js.native
class ASPxClientCustomDataCallbackEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientCustomDataCallbackEventArgs type with the specified settings.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(result: String) = this()
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing, related to the CustomCallback event.
    */
  var result: String = js.native
}

