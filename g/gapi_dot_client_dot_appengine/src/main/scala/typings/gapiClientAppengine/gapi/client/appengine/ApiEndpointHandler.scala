package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiEndpointHandler extends js.Object {
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.native
}

object ApiEndpointHandler {
  @scala.inline
  def apply(): ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiEndpointHandler]
  }
  @scala.inline
  implicit class ApiEndpointHandlerOps[Self <: ApiEndpointHandler] (val x: Self) extends AnyVal {
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
    def setScriptPath(value: String): Self = this.set("scriptPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptPath: Self = this.set("scriptPath", js.undefined)
  }
  
}

