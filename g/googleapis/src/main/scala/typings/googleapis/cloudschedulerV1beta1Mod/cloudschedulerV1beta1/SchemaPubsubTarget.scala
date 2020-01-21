package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pub/Sub target. The job will be delivered by publishing a message to the
  * given Pub/Sub topic.
  */
@js.native
trait SchemaPubsubTarget extends js.Object {
  /**
    * Attributes for PubsubMessage.  Pubsub message must contain either
    * non-empty data, or at least one attribute.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The message payload for PubsubMessage.  Pubsub message must contain
    * either non-empty data, or at least one attribute.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Required.  The name of the Cloud Pub/Sub topic to which messages will be
    * published when a job is delivered. The topic name must be in the same
    * format as required by PubSub&#39;s
    * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
    * for example `projects/PROJECT_ID/topics/TOPIC_ID`.  The topic must be in
    * the same project as the Cloud Scheduler job.
    */
  var topicName: js.UndefOr[String] = js.native
}

object SchemaPubsubTarget {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, data: String = null, topicName: String = null): SchemaPubsubTarget = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPubsubTarget]
  }
}

