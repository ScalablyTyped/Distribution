package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.subscriptionMod.SubscriptionMetadata
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
class Subscription protected ()
  extends typings.googleCloudPubsub.subscriptionMod.Subscription {
  def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String) = this()
  def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String, options: SubscriptionOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
object Subscription extends js.Object {
  /*!
    * Formats Subscription metadata.
    *
    * @private
    */
  def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  def formatName_(projectId: String, name: String): String = js.native
}

