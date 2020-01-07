package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription to receive Google PubSub notifications.
  */
@js.native
trait Schema$Notification extends js.Object {
  /**
    * An optional list of additional attributes to attach to each Cloud PubSub
    * message published for this notification subscription.
    */
  var custom_attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * HTTP 1.1 Entity tag for this subscription notification.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * If present, only send notifications about listed event types. If empty,
    * sent notifications for all event types.
    */
  var event_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the notification.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For notifications, this is always
    * storage#notification.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If present, only apply this notification configuration to object names
    * that begin with this prefix.
    */
  var object_name_prefix: js.UndefOr[String] = js.native
  /**
    * The desired content of the Payload.
    */
  var payload_format: js.UndefOr[String] = js.native
  /**
    * The canonical URL of this notification.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The Cloud PubSub topic to which this subscription publishes. Formatted
    * as:
    * &#39;//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}&#39;
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$Notification {
  @scala.inline
  def apply(
    custom_attributes: StringDictionary[String] = null,
    etag: String = null,
    event_types: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    object_name_prefix: String = null,
    payload_format: String = null,
    selfLink: String = null,
    topic: String = null
  ): Schema$Notification = {
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
    __obj.asInstanceOf[Schema$Notification]
  }
}

