package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.OnServerError, ASPxClientReportDesigner.OnServerError and ASPxClientQueryBuilder.OnServerError events.
  */
trait ASPxClientErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to information about a server-side error.
    */
  var Error: js.Any
}

object ASPxClientErrorEventArgs {
  @scala.inline
  def apply(Error: js.Any): ASPxClientErrorEventArgs = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientErrorEventArgs]
  }
}

