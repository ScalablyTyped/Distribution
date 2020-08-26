package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * This value is the maximum time after a subscriber receives a message
    * before the subscriber should acknowledge the message. After message
    * delivery but before the ack deadline expires and before the message is
    * acknowledged, it is an outstanding message and will not be delivered
    * again during that time (on a best-effort basis).
    *
    * For pull subscriptions, this value is used as the initial value for the ack
    * deadline. To override this value for a given message, call
    * `ModifyAckDeadline` with the corresponding `ack_id` if using
    * non-streaming pull or send the `ack_id` in a
    * `StreamingModifyAckDeadlineRequest` if using streaming pull.
    * The minimum custom deadline you can specify is 10 seconds.
    * The maximum custom deadline you can specify is 600 seconds (10 minutes).
    * If this parameter is 0, a default value of 10 seconds is used.
    *
    * For push delivery, this value is also used to set the request timeout for
    * the call to the push endpoint.
    *
    * If the subscriber never acknowledges the message, the Pub/Sub
    * system will eventually redeliver the message.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * The name of the subscription. It must have the format
    * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
    * start with a letter, and contain only letters (`[A-Za-z]`), numbers
    * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
    * plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
    * in length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If push delivery is used with this subscription, this field is
    * used to configure it. An empty `pushConfig` signifies that the subscriber
    * will pull and ack messages using API methods.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.native
  /**
    * The name of the topic from which this subscription is receiving messages.
    * Format is `projects/{project}/topics/{topic}`.
    * The value of this field will be `_deleted-topic_` if the topic has been
    * deleted.
    */
  var topic: js.UndefOr[String] = js.native
}

object Subscription {
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
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
    def setAckDeadlineSeconds(value: Double): Self = this.set("ackDeadlineSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckDeadlineSeconds: Self = this.set("ackDeadlineSeconds", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPushConfig(value: PushConfig): Self = this.set("pushConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushConfig: Self = this.set("pushConfig", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

