package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyPushConfigRequest extends js.Object {
  /**
    * The push configuration for future deliveries.
    *
    * An empty `pushConfig` indicates that the Pub/Sub system should
    * stop pushing messages from the given subscription and allow
    * messages to be pulled and acknowledged - effectively pausing
    * the subscription if `Pull` or `StreamingPull` is not called.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.native
}

object ModifyPushConfigRequest {
  @scala.inline
  def apply(): ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyPushConfigRequest]
  }
  @scala.inline
  implicit class ModifyPushConfigRequestOps[Self <: ModifyPushConfigRequest] (val x: Self) extends AnyVal {
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
    def setPushConfig(value: PushConfig): Self = this.set("pushConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushConfig: Self = this.set("pushConfig", js.undefined)
  }
  
}

