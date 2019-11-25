package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IReceivedMessage
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ISubscription
import typings.atGoogleDashCloudPubsub.buildSrcMod.PubSub
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMod.PublishOptions
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.ClientConfig
import typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Subscriber
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.SubscriptionMetadata
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src", JSImport.Namespace)
@js.native
object buildSrcMod extends js.Object {
  @js.native
  class IAM protected ()
    extends typings.atGoogleDashCloudPubsub.buildSrcIamMod.IAM {
    def this(pubsub: typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, id: String) = this()
  }
  
  @js.native
  class Message protected ()
    extends typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Message {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(sub: Subscriber, hasAckIdMessage: IReceivedMessage) = this()
  }
  
  @js.native
  class PubSub ()
    extends typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub {
    def this(options: ClientConfig) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typings.atGoogleDashCloudPubsub.buildSrcSnapshotMod.Snapshot {
    def this(parent: PubSub, name: String) = this()
    def this(parent: typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription, name: String) = this()
  }
  
  @js.native
  class Subscription protected ()
    extends typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription {
    def this(pubsub: typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: SubscriptionOptions
    ) = this()
  }
  
  @js.native
  class Topic protected ()
    extends typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic {
    def this(pubsub: typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: PublishOptions
    ) = this()
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

