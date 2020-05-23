package typings.googleCloudPubsub.subscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.pubsubMod.google.protobuf.IDuration
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IDeadLetterPolicy
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IExpirationPolicy
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IPushConfig
import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscription.SubscriptionMetadata & {  gaxOpts ? :google-gax.google-gax.CallOptions,   flowControl ? :@google-cloud/pubsub.@google-cloud/pubsub/build/src/lease-manager.FlowControlOptions} */
trait CreateSubscriptionOptions extends js.Object {
  var ackDeadlineSeconds: js.UndefOr[Double] = js.undefined
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy] = js.undefined
  var enableMessageOrdering: js.UndefOr[Boolean] = js.undefined
  var expirationPolicy: js.UndefOr[IExpirationPolicy] = js.undefined
  var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var oidcToken: js.UndefOr[OidcToken] = js.undefined
  var pushConfig: js.UndefOr[IPushConfig] = js.undefined
  var pushEndpoint: js.UndefOr[String] = js.undefined
  var retainAckedMessages: js.UndefOr[Boolean] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
}

object CreateSubscriptionOptions {
  @scala.inline
  def apply(
    ackDeadlineSeconds: js.UndefOr[Double] = js.undefined,
    deadLetterPolicy: IDeadLetterPolicy = null,
    enableMessageOrdering: js.UndefOr[Boolean] = js.undefined,
    expirationPolicy: IExpirationPolicy = null,
    flowControl: FlowControlOptions = null,
    gaxOpts: CallOptions = null,
    labels: StringDictionary[String] = null,
    messageRetentionDuration: IDuration | Double = null,
    name: String = null,
    oidcToken: OidcToken = null,
    pushConfig: IPushConfig = null,
    pushEndpoint: String = null,
    retainAckedMessages: js.UndefOr[Boolean] = js.undefined,
    topic: String = null
  ): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadlineSeconds)) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.get.asInstanceOf[js.Any])
    if (deadLetterPolicy != null) __obj.updateDynamic("deadLetterPolicy")(deadLetterPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMessageOrdering)) __obj.updateDynamic("enableMessageOrdering")(enableMessageOrdering.get.asInstanceOf[js.Any])
    if (expirationPolicy != null) __obj.updateDynamic("expirationPolicy")(expirationPolicy.asInstanceOf[js.Any])
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oidcToken != null) __obj.updateDynamic("oidcToken")(oidcToken.asInstanceOf[js.Any])
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAckedMessages)) __obj.updateDynamic("retainAckedMessages")(retainAckedMessages.get.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
}

