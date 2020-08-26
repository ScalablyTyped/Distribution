package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subscribeCompleteArgs extends baseResponseArgs {
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean = js.native
}

object subscribeCompleteArgs {
  @scala.inline
  def apply(client: client, clientId: String, isResubscribe: Boolean, meta: js.Any, timestamp: Date): subscribeCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeCompleteArgs]
  }
  @scala.inline
  implicit class subscribeCompleteArgsOps[Self <: subscribeCompleteArgs] (val x: Self) extends AnyVal {
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
    def setIsResubscribe(value: Boolean): Self = this.set("isResubscribe", value.asInstanceOf[js.Any])
  }
  
}

