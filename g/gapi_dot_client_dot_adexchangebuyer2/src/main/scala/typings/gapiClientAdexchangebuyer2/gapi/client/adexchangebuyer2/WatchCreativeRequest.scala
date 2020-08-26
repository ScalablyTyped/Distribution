package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to.
    * This topic must already exist and must give permission to
    * ad-exchange-buyside-reports@google.com to write to the topic.
    * This should be the full resource name in
    * "projects/{project_id}/topics/{topic_id}" format.
    */
  var topic: js.UndefOr[String] = js.native
}

object WatchCreativeRequest {
  @scala.inline
  def apply(): WatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchCreativeRequest]
  }
  @scala.inline
  implicit class WatchCreativeRequestOps[Self <: WatchCreativeRequest] (val x: Self) extends AnyVal {
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

