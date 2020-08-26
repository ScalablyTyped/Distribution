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
  def apply(): SchemaPubsubTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubTarget]
  }
  @scala.inline
  implicit class SchemaPubsubTargetOps[Self <: SchemaPubsubTarget] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
  
}

