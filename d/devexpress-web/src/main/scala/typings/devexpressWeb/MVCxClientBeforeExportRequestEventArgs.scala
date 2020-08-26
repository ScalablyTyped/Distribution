package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeforeExportRequest events.
  */
@js.native
trait MVCxClientBeforeExportRequestEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any = js.native
}

object MVCxClientBeforeExportRequestEventArgs {
  @scala.inline
  def apply(customArgs: js.Any): MVCxClientBeforeExportRequestEventArgs = {
    val __obj = js.Dynamic.literal(customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientBeforeExportRequestEventArgs]
  }
  @scala.inline
  implicit class MVCxClientBeforeExportRequestEventArgsOps[Self <: MVCxClientBeforeExportRequestEventArgs] (val x: Self) extends AnyVal {
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
    def setCustomArgs(value: js.Any): Self = this.set("customArgs", value.asInstanceOf[js.Any])
  }
  
}

