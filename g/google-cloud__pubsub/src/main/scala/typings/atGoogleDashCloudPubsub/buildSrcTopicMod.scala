package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IListTopicSubscriptionsResponse
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ITopic
import typings.atGoogleDashCloudPubsub.buildSrcIamMod.IAM
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMod.Attributes
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMod.PublishCallback
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMod.PublishOptions
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMod.Publisher
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyCallback
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyResponse
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.ExistsCallback
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.ExistsResponse
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.ObjectStream
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PageOptions
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PagedResponse
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestConfig
import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionCallback
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionOptions
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionResponse
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription
import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.CreateTopicCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.CreateTopicResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicMetadataCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicMetadataResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicOptions
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.MetadataCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.MetadataResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.SetTopicMetadataCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.SetTopicMetadataResponse
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.TopicCallback
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.TopicMetadata
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.TopicResponse
import typings.googleDashGax.buildSrcGaxMod.CallOptions
import typings.node.Buffer
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/topic", JSImport.Namespace)
@js.native
object buildSrcTopicMod extends js.Object {
  @js.native
  class Topic protected () extends js.Object {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: PublishOptions) = this()
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    var iam: IAM = js.native
    var metadata: js.UndefOr[TopicMetadata] = js.native
    var name: String = js.native
    var parent: PubSub = js.native
    var publisher: Publisher = js.native
    var pubsub: PubSub = js.native
    @JSName("request")
    var request_Original: Fn_Callback = js.native
    def create(): js.Promise[CreateTopicResponse] = js.native
    def create(callback: CreateTopicCallback): Unit = js.native
    def create(gaxOpts: CallOptions): js.Promise[CreateTopicResponse] = js.native
    def create(gaxOpts: CallOptions, callback: CreateTopicCallback): Unit = js.native
    def createSubscription(name: String): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(name: String, options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): Unit = js.native
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    def delete(gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def delete(gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    def exists(): js.Promise[ExistsResponse] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    def get(): js.Promise[GetTopicResponse] = js.native
    def get(callback: GetTopicCallback): Unit = js.native
    def get(gaxOpts: GetTopicOptions): js.Promise[GetTopicResponse] = js.native
    def get(gaxOpts: GetTopicOptions, callback: GetTopicCallback): Unit = js.native
    def getMetadata(): js.Promise[GetTopicMetadataResponse] = js.native
    def getMetadata(callback: GetTopicMetadataCallback): Unit = js.native
    def getMetadata(gaxOpts: CallOptions): js.Promise[GetTopicMetadataResponse] = js.native
    def getMetadata(gaxOpts: CallOptions, callback: GetTopicMetadataCallback): Unit = js.native
    def getSubscriptions(): js.Promise[GetTopicSubscriptionsResponse] = js.native
    def getSubscriptions(callback: GetTopicSubscriptionsCallback): Unit = js.native
    def getSubscriptions(options: PageOptions): js.Promise[GetTopicSubscriptionsResponse] = js.native
    def getSubscriptions(options: PageOptions, callback: GetTopicSubscriptionsCallback): Unit = js.native
    def getSubscriptionsStream(): ObjectStream[Subscription] = js.native
    def publish(data: Buffer): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publish(data: Buffer, callback: PublishCallback): Unit = js.native
    def publishJSON(json: js.Object): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publishJSON(json: js.Object, callback: PublishCallback): Unit = js.native
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    def setMetadata(options: TopicMetadata): js.Promise[SetTopicMetadataResponse] = js.native
    def setMetadata(options: TopicMetadata, callback: SetTopicMetadataCallback): Unit = js.native
    def setMetadata(options: TopicMetadata, gaxOpts: CallOptions): js.Promise[SetTopicMetadataResponse] = js.native
    def setMetadata(options: TopicMetadata, gaxOpts: CallOptions, callback: SetTopicMetadataCallback): Unit = js.native
    /**
      * Set the publisher options.
      *
      * @param {PublishOptions} options The publisher options.
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.setPublishOptions({
      *   batching: {
      *     maxMilliseconds: 10
      *   }
      * });
      */
    def setPublishOptions(options: PublishOptions): Unit = js.native
    /**
      * Create a Subscription object. This command by itself will not run any API
      * requests. You will receive a {module:pubsub/subscription} object,
      * which will allow you to interact with a subscription.
      *
      * @throws {Error} If subscription name is omitted.
      *
      * @param {string} name Name of the subscription.
      * @param {SubscriberOptions} [options] Configuration object.
      * @return {Subscription}
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * // Register a listener for `message` events.
      * subscription.on('message', (message) => {
      *   // Called every time a message is received.
      *   // message.id = ID of the message.
      *   // message.ackId = ID used to acknowledge the message receival.
      *   // message.data = Contents of the message.
      *   // message.attributes = Attributes of the message.
      *   // message.publishTime = Timestamp when Pub/Sub received the message.
      * });
      */
    def subscription(name: String): Subscription = js.native
    def subscription(name: String, options: SubscriptionOptions): Subscription = js.native
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
  
  type CreateTopicCallback = TopicCallback
  type CreateTopicResponse = TopicResponse
  type GetTopicCallback = TopicCallback
  type GetTopicMetadataCallback = MetadataCallback
  type GetTopicMetadataResponse = MetadataResponse
  type GetTopicOptions = CallOptions with Anon_AutoCreate
  type GetTopicResponse = TopicResponse
  type GetTopicSubscriptionsCallback = RequestCallback[Subscription, IListTopicSubscriptionsResponse]
  type GetTopicSubscriptionsResponse = PagedResponse[Subscription, IListTopicSubscriptionsResponse]
  type MetadataCallback = RequestCallback[TopicMetadata, Unit]
  type MetadataResponse = js.Array[TopicMetadata]
  type SetTopicMetadataCallback = MetadataCallback
  type SetTopicMetadataResponse = MetadataResponse
  type TopicCallback = ResourceCallback[Topic, TopicMetadata]
  type TopicMetadata = ITopic
  type TopicResponse = js.Tuple2[Topic, TopicMetadata]
}

