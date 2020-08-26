package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
}

object EventNotificationConfig {
  @scala.inline
  def apply(): EventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventNotificationConfig]
  }
  @scala.inline
  implicit class EventNotificationConfigOps[Self <: EventNotificationConfig] (val x: Self) extends AnyVal {
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
    def setPubsubTopicName(value: String): Self = this.set("pubsubTopicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubsubTopicName: Self = this.set("pubsubTopicName", js.undefined)
  }
  
}

