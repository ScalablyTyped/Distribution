package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription resource.
  */
@js.native
trait Schema$Subscription extends js.Object {
  /**
    * This value is the maximum time after a subscriber receives a message
    * before the subscriber should acknowledge the message. After message
    * delivery but before the ack deadline expires and before the message is
    * acknowledged, it is an outstanding message and will not be delivered
    * again during that time (on a best-effort basis).  For pull subscriptions,
    * this value is used as the initial value for the ack deadline. To override
    * this value for a given message, call `ModifyAckDeadline` with the
    * corresponding `ack_id` if using pull. The maximum custom deadline you can
    * specify is 600 seconds (10 minutes).  For push delivery, this value is
    * also used to set the request timeout for the call to the push endpoint.
    * If the subscriber never acknowledges the message, the Pub/Sub system will
    * eventually redeliver the message.  If this parameter is 0, a default
    * value of 10 seconds is used.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * The name of the subscription. It must have the format
    * `&quot;projects/{project}/subscriptions/{subscription}&quot;`.
    * `{subscription}` must start with a letter, and contain only letters
    * (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods
    * (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be
    * between 3 and 255 characters in length, and it must not start with
    * `&quot;goog&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If push delivery is used with this subscription, this field is used to
    * configure it. An empty `pushConfig` signifies that the subscriber will
    * pull and ack messages using API methods.
    */
  var pushConfig: js.UndefOr[Schema$PushConfig] = js.native
  /**
    * The name of the topic from which this subscription is receiving messages.
    * The value of this field will be `_deleted-topic_` if the topic has been
    * deleted.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$Subscription {
  @scala.inline
  def apply(
    ackDeadlineSeconds: Int | Double = null,
    name: String = null,
    pushConfig: Schema$PushConfig = null,
    topic: String = null
  ): Schema$Subscription = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Subscription]
  }
}

