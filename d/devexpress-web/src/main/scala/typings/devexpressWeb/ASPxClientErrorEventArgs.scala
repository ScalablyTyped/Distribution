package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.OnServerError, ASPxClientReportDesigner.OnServerError and ASPxClientQueryBuilder.OnServerError events.
  */
@js.native
trait ASPxClientErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to information about a server-side error.
    */
  var Error: js.Any = js.native
}

object ASPxClientErrorEventArgs {
  @scala.inline
  def apply(Error: js.Any): ASPxClientErrorEventArgs = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientErrorEventArgs]
  }
  @scala.inline
  implicit class ASPxClientErrorEventArgsOps[Self <: ASPxClientErrorEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: js.Any): Self = this.set("Error", value.asInstanceOf[js.Any])
  }
  
}

