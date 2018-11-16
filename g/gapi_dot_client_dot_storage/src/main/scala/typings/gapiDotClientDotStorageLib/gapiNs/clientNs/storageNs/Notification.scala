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

