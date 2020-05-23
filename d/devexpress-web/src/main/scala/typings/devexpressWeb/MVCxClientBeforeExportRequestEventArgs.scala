package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeforeExportRequest events.
  */
trait MVCxClientBeforeExportRequestEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any
}

object MVCxClientBeforeExportRequestEventArgs {
  @scala.inline
  def apply(customArgs: js.Any): MVCxClientBeforeExportRequestEventArgs = {
    val __obj = js.Dynamic.literal(customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientBeforeExportRequestEventArgs]
  }
}

