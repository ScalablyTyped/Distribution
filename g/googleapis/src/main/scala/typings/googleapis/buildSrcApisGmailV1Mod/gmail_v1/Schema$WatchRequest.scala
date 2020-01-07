package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set up or update a new push notification watch on this user&#39;s mailbox.
  */
@js.native
trait Schema$WatchRequest extends js.Object {
  /**
    * Filtering behavior of labelIds list specified.
    */
  var labelFilterAction: js.UndefOr[String] = js.native
  /**
    * List of label_ids to restrict notifications about. By default, if
    * unspecified, all changes are pushed out. If specified then dictates which
    * labels are required for a push notification to be generated.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A fully qualified Google Cloud Pub/Sub API topic name to publish the
    * events to. This topic name **must** already exist in Cloud Pub/Sub and
    * you **must** have already granted gmail &quot;publish&quot; permission on
    * it. For example,
    * &quot;projects/my-project-identifier/topics/my-topic-name&quot; (using
    * the Cloud Pub/Sub &quot;v1&quot; topic naming format).  Note that the
    * &quot;my-project-identifier&quot; portion must exactly match your Google
    * developer project id (the one executing this watch request).
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$WatchRequest {
  @scala.inline
  def apply(labelFilterAction: String = null, labelIds: js.Array[String] = null, topicName: String = null): Schema$WatchRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFilterAction != null) __obj.updateDynamic("labelFilterAction")(labelFilterAction.asInstanceOf[js.Any])
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WatchRequest]
  }
}

