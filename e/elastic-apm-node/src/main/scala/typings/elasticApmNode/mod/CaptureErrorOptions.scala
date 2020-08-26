package typings.elasticApmNode.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureErrorOptions extends js.Object {
  var custom: js.UndefOr[js.Object] = js.native
  var handled: js.UndefOr[Boolean] = js.native
  var labels: js.UndefOr[Labels] = js.native
  var message: js.UndefOr[String] = js.native
  var request: js.UndefOr[IncomingMessage] = js.native
  var response: js.UndefOr[ServerResponse] = js.native
  var tags: js.UndefOr[Labels] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var user: js.UndefOr[UserObject] = js.native
}

object CaptureErrorOptions {
  @scala.inline
  def apply(): CaptureErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureErrorOptions]
  }
  @scala.inline
  implicit class CaptureErrorOptionsOps[Self <: CaptureErrorOptions] (val x: Self) extends AnyVal {
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
    def setCustom(value: js.Object): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandled: Self = this.set("handled", js.undefined)
    @scala.inline
    def setLabels(value: Labels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setRequest(value: IncomingMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: ServerResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setTags(value: Labels): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setUser(value: UserObject): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

