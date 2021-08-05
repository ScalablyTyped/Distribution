package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.subscriptionMod.SubscriptionMetadata
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
class Subscription protected ()
  extends typings.googleCloudPubsub.subscriptionMod.Subscription {
  def this(pubsub: typings.googleCloudPubsub.pubsubMod.PubSub, name: String) = this()
  def this(pubsub: typings.googleCloudPubsub.pubsubMod.PubSub, name: String, options: SubscriptionOptions) = this()
}
/* static members */
object Subscription {
  
  @JSImport("@google-cloud/pubsub", "Subscription")
  @js.native
  val ^ : js.Any = js.native
  
  /*!
    * Formats Subscription metadata.
    *
    * @private
    */
  inline def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMetadata_")(metadata.asInstanceOf[js.Any]).asInstanceOf[ISubscription]
  
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
