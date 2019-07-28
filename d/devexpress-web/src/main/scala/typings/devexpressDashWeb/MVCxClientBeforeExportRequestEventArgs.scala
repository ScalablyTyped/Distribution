package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeforeExportRequest events.
  */
trait MVCxClientBeforeExportRequestEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    * Value: A hash table object containing named values to be passed from the client to the server side via request parameters.
    */
  var customArgs: js.Object
}

object MVCxClientBeforeExportRequestEventArgs {
  @scala.inline
  def apply(customArgs: js.Object): MVCxClientBeforeExportRequestEventArgs = {
    val __obj = js.Dynamic.literal(customArgs = customArgs)
  
    __obj.asInstanceOf[MVCxClientBeforeExportRequestEventArgs]
  }
}

