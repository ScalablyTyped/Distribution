package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WatchRequest extends js.Object {
  /** Filtering behavior of labelIds list specified. */
  var labelFilterAction: js.UndefOr[java.lang.String] = js.undefined
  /**
               * List of label_ids to restrict notifications about. By default, if unspecified, all changes are pushed out. If specified then dictates which labels are
               * required for a push notification to be generated.
               */
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * A fully qualified Google Cloud Pub/Sub API topic name to publish the events to. This topic name &#42;&#42;must&#42;&#42; already exist in Cloud Pub/Sub and you
               * &#42;&#42;must&#42;&#42; have already granted gmail "publish" permission on it. For example, "projects/my-project-identifier/topics/my-topic-name" (using the Cloud
               * Pub/Sub "v1" topic naming format).
               *
               * Note that the "my-project-identifier" portion must exactly match your Google developer project id (the one executing this watch request).
               */
  var topicName: js.UndefOr[java.lang.String] = js.undefined
}

