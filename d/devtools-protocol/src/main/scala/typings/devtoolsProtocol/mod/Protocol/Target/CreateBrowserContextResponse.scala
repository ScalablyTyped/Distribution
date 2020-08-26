package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBrowserContextResponse extends js.Object {
  /**
    * The id of the context created.
    */
  var browserContextId: BrowserContextID = js.native
}

object CreateBrowserContextResponse {
  @scala.inline
  def apply(browserContextId: BrowserContextID): CreateBrowserContextResponse = {
    val __obj = js.Dynamic.literal(browserContextId = browserContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrowserContextResponse]
  }
  @scala.inline
  implicit class CreateBrowserContextResponseOps[Self <: CreateBrowserContextResponse] (val x: Self) extends AnyVal {
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
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
  }
  
}

