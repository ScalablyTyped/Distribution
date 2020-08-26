package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectSuccessArgs extends baseResponseArgs {
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean = js.native
}

object connectSuccessArgs {
  @scala.inline
  def apply(client: client, clientId: String, isReconnect: Boolean, meta: js.Any, timestamp: Date): connectSuccessArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectSuccessArgs]
  }
  @scala.inline
  implicit class connectSuccessArgsOps[Self <: connectSuccessArgs] (val x: Self) extends AnyVal {
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
    def setIsReconnect(value: Boolean): Self = this.set("isReconnect", value.asInstanceOf[js.Any])
  }
  
}

