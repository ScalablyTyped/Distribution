package typings.googleCloudPubsub

import typings.googleCloudPubsub.publisherMod.PublishOptions
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IReceivedMessage
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.srcPubsubMod.ClientConfig
import typings.googleCloudPubsub.subscriberMod.Subscriber
import typings.googleCloudPubsub.subscriptionMod.SubscriptionMetadata
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IAM protected ()
    extends typings.googleCloudPubsub.srcIamMod.IAM {
    def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, id: String) = this()
  }
  
  @js.native
  class Message protected ()
    extends typings.googleCloudPubsub.subscriberMod.Message {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(sub: Subscriber, hasAckIdMessageDeliveryAttempt: IReceivedMessage) = this()
  }
  
  @js.native
  class PubSub ()
    extends typings.googleCloudPubsub.srcPubsubMod.PubSub {
    def this(options: ClientConfig) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typings.googleCloudPubsub.snapshotMod.Snapshot {
    def this(parent: PubSub, name: String) = this()
    def this(parent: typings.googleCloudPubsub.subscriptionMod.Subscription, name: String) = this()
  }
  
  @js.native
  class Subscription protected ()
    extends typings.googleCloudPubsub.subscriptionMod.Subscription {
    def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String) = this()
    def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String, options: SubscriptionOptions) = this()
  }
  
  @js.native
  class Topic protected ()
    extends typings.googleCloudPubsub.topicMod.Topic {
    def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String) = this()
    def this(pubsub: typings.googleCloudPubsub.srcPubsubMod.PubSub, name: String, options: PublishOptions) = this()
  }
  
  val v1: js.Any = js.native
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object Topic extends js.Object {
    /**
      * Format the name of a topic. A Topic's full name is in the format of
      * 'projects/{projectId}/topics/{topicName}'.
      *
      * @private
      *
      * @return {string}
      */
    def formatName_(projectId: String, name: String): String = js.native
  }
  
}

