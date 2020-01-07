package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription resource.
  */
@js.native
trait Schema$Subscription extends js.Object {
  /**
    * For either push or pull delivery, the value is the maximum time after a
    * subscriber receives a message before the subscriber should acknowledge or
    * Nack the message. If the Ack deadline for a message passes without an Ack
    * or a Nack, the Pub/Sub system will eventually redeliver the message. If a
    * subscriber acknowledges after the deadline, the Pub/Sub system may accept
    * the Ack, but it is possible that the message has been already delivered
    * again. Multiple Acks to the message are allowed and will succeed.  For
    * push delivery, this value is used to set the request timeout for the call
    * to the push endpoint.  For pull delivery, this value is used as the
    * initial value for the Ack deadline. It may be overridden for each message
    * using its corresponding ack_id with
    * &lt;code&gt;ModifyAckDeadline&lt;/code&gt;. While a message is
    * outstanding (i.e. it has been delivered to a pull subscriber and the
    * subscriber has not yet Acked or Nacked), the Pub/Sub system will not
    * deliver that message to another pull subscriber (on a best-effort basis).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * Name of the subscription.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If push delivery is used with this subscription, this field is used to
    * configure it.
    */
  var pushConfig: js.UndefOr[Schema$PushConfig] = js.native
  /**
    * The name of the topic from which this subscription is receiving messages.
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

