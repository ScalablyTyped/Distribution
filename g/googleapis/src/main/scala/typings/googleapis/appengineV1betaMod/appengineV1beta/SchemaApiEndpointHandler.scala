package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uses Google Cloud Endpoints to handle requests.
  */
@js.native
trait SchemaApiEndpointHandler extends js.Object {
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.native
}

object SchemaApiEndpointHandler {
  @scala.inline
  def apply(): SchemaApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiEndpointHandler]
  }
  @scala.inline
  implicit class SchemaApiEndpointHandlerOps[Self <: SchemaApiEndpointHandler] (val x: Self) extends AnyVal {
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

