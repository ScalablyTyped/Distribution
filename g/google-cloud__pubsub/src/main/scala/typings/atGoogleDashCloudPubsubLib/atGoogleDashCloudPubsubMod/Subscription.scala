package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
class Subscription protected ()
  extends atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription {
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String) = this()
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String, options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.SubscriptionOptions) = this()
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
  def formatMetadata_(metadata: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.SubscriptionMetadata): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription = js.native
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

