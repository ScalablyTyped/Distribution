package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseResponseArgs extends baseArgs {
  /**
    * The singleton client.
    */
  var client: typings.fmWebsync.fm.websync.client = js.native
  /**
    * The ID of the singleton client.
    */
  var clientId: String = js.native
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any = js.native
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: Date = js.native
}

object baseResponseArgs {
  @scala.inline
  def apply(client: client, clientId: String, meta: js.Any, timestamp: Date): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseResponseArgs]
  }
  @scala.inline
  implicit class baseResponseArgsOps[Self <: baseResponseArgs] (val x: Self) extends AnyVal {
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
    def setClient(value: client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

