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
    ackDeadlineSeconds: js.UndefOr[Null | Double] = js.undefined,
    deadLetterPolicy: js.UndefOr[Null | IDeadLetterPolicy] = js.undefined,
    enableMessageOrdering: js.UndefOr[Null | Boolean] = js.undefined,
    expirationPolicy: js.UndefOr[Null | IExpirationPolicy] = js.undefined,
    labels: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    messageRetentionDuration: js.UndefOr[Null | IDuration] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    pushConfig: js.UndefOr[Null | IPushConfig] = js.undefined,
    retainAckedMessages: js.UndefOr[Null | Boolean] = js.undefined,
    topic: js.UndefOr[Null | String] = js.undefined
  ): ISubscription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadlineSeconds)) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(deadLetterPolicy)) __obj.updateDynamic("deadLetterPolicy")(deadLetterPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMessageOrdering)) __obj.updateDynamic("enableMessageOrdering")(enableMessageOrdering.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationPolicy)) __obj.updateDynamic("expirationPolicy")(expirationPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(messageRetentionDuration)) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pushConfig)) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAckedMessages)) __obj.updateDynamic("retainAckedMessages")(retainAckedMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(topic)) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
}

