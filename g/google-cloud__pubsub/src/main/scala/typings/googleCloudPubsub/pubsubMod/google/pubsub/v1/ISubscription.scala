package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Subscription. */
trait ISubscription extends js.Object {
  /** Subscription ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  /** Subscription deadLetterPolicy */
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.undefined
  /** Subscription enableMessageOrdering */
  var enableMessageOrdering: js.UndefOr[Boolean | Null] = js.undefined
  /** Subscription expirationPolicy */
  var expirationPolicy: js.UndefOr[IExpirationPolicy | Null] = js.undefined
  /** Subscription labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** Subscription messageRetentionDuration */
  var messageRetentionDuration: js.UndefOr[IDuration | Null] = js.undefined
  /** Subscription name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Subscription pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.undefined
  /** Subscription retainAckedMessages */
  var retainAckedMessages: js.UndefOr[Boolean | Null] = js.undefined
  /** Subscription topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object ISubscription {
  @scala.inline
  def apply(
    ackDeadlineSeconds: Int | Double = null,
    deadLetterPolicy: IDeadLetterPolicy = null,
    enableMessageOrdering: js.UndefOr[Boolean] = js.undefined,
    expirationPolicy: IExpirationPolicy = null,
    labels: StringDictionary[String] = null,
    messageRetentionDuration: IDuration = null,
    name: String = null,
    pushConfig: IPushConfig = null,
    retainAckedMessages: js.UndefOr[Boolean] = js.undefined,
    topic: String = null
  ): ISubscription = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (deadLetterPolicy != null) __obj.updateDynamic("deadLetterPolicy")(deadLetterPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMessageOrdering)) __obj.updateDynamic("enableMessageOrdering")(enableMessageOrdering.asInstanceOf[js.Any])
    if (expirationPolicy != null) __obj.updateDynamic("expirationPolicy")(expirationPolicy.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAckedMessages)) __obj.updateDynamic("retainAckedMessages")(retainAckedMessages.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
}

