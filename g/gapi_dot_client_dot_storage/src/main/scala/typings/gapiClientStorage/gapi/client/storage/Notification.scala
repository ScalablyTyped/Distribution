package typings.gapiClientStorage.gapi.client.storage

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription. */
  var custom_attributes: js.UndefOr[Record[String, String]] = js.undefined
  /** HTTP 1.1 Entity tag for this subscription notification. */
  var etag: js.UndefOr[String] = js.undefined
  /** If present, only send notifications about listed event types. If empty, sent notifications for all event types. */
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  /** The ID of the notification. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[String] = js.undefined
  /** If present, only apply this notification configuration to object names that begin with this prefix. */
  var object_name_prefix: js.UndefOr[String] = js.undefined
  /** The desired content of the Payload. */
  var payload_format: js.UndefOr[String] = js.undefined
  /** The canonical URL of this notification. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}' */
  var topic: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    custom_attributes: Record[String, String] = null,
    etag: String = null,
    event_types: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    object_name_prefix: String = null,
    payload_format: String = null,
    selfLink: String = null,
    topic: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (event_types != null) __obj.updateDynamic("event_types")(event_types.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (object_name_prefix != null) __obj.updateDynamic("object_name_prefix")(object_name_prefix.asInstanceOf[js.Any])
    if (payload_format != null) __obj.updateDynamic("payload_format")(payload_format.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

