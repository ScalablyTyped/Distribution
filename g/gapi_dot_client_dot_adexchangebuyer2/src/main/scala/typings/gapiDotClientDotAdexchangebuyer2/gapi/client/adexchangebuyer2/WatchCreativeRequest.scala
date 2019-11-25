package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to.
    * This topic must already exist and must give permission to
    * ad-exchange-buyside-reports@google.com to write to the topic.
    * This should be the full resource name in
    * "projects/{project_id}/topics/{topic_id}" format.
    */
  var topic: js.UndefOr[String] = js.undefined
}

object WatchCreativeRequest {
  @scala.inline
  def apply(topic: String = null): WatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchCreativeRequest]
  }
}

