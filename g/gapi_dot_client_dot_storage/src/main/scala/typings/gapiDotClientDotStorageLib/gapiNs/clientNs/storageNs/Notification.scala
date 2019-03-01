package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription. */
  var custom_attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** HTTP 1.1 Entity tag for this subscription notification. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** If present, only send notifications about listed event types. If empty, sent notifications for all event types. */
  var event_types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The ID of the notification. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** If present, only apply this notification configuration to object names that begin with this prefix. */
  var object_name_prefix: js.UndefOr[java.lang.String] = js.undefined
  /** The desired content of the Payload. */
  var payload_format: js.UndefOr[java.lang.String] = js.undefined
  /** The canonical URL of this notification. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}' */
  var topic: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    custom_attributes: stdLib.Record[java.lang.String, java.lang.String] = null,
    etag: java.lang.String = null,
    event_types: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    object_name_prefix: java.lang.String = null,
    payload_format: java.lang.String = null,
    selfLink: java.lang.String = null,
    topic: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (event_types != null) __obj.updateDynamic("event_types")(event_types)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (object_name_prefix != null) __obj.updateDynamic("object_name_prefix")(object_name_prefix)
    if (payload_format != null) __obj.updateDynamic("payload_format")(payload_format)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Notification]
  }
}

