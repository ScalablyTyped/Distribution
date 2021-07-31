package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.iamMod.IAM
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPubsubMessage
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ITopic
import typings.googleCloudPubsub.publisherMod.Attributes
import typings.googleCloudPubsub.publisherMod.PublishCallback
import typings.googleCloudPubsub.publisherMod.PublishOptions
import typings.googleCloudPubsub.publisherMod.Publisher
import typings.googleCloudPubsub.pubsubMod.EmptyCallback
import typings.googleCloudPubsub.pubsubMod.EmptyResponse
import typings.googleCloudPubsub.pubsubMod.ExistsCallback
import typings.googleCloudPubsub.pubsubMod.ExistsResponse
import typings.googleCloudPubsub.pubsubMod.ObjectStream
import typings.googleCloudPubsub.pubsubMod.PageOptions
import typings.googleCloudPubsub.pubsubMod.PagedResponse
import typings.googleCloudPubsub.pubsubMod.PubSub
import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.RequestConfig
import typings.googleCloudPubsub.pubsubMod.ResourceCallback
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionCallback
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionOptions
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionResponse
import typings.googleCloudPubsub.subscriptionMod.Subscription
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import typings.googleGax.gaxMod.CallOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicMod {
  
  @JSImport("@google-cloud/pubsub/build/src/topic", "Topic")
  @js.native
  class Topic protected () extends StObject {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: PublishOptions) = this()
    
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
    
    def flush(): js.Promise[Unit] = js.native
    def flush(callback: EmptyCallback): Unit = js.native
    
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
    
    var iam: IAM = js.native
    
    var metadata: js.UndefOr[TopicMetadata] = js.native
    
    var name: String = js.native
    
    var parent: PubSub = js.native
    
    def publish(data: Buffer): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publish(data: Buffer, callback: PublishCallback): Unit = js.native
    
    def publishJSON(json: js.Object): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publishJSON(json: js.Object, callback: PublishCallback): Unit = js.native
    
    def publishMessage(message: MessageOptions): js.Promise[js.Array[String]] = js.native
    def publishMessage(message: MessageOptions, callback: PublishCallback): Unit = js.native
    
    var publisher: Publisher = js.native
    
    var pubsub: PubSub = js.native
    
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    @JSName("request")
    var request_Original: FnCall = js.native
    
    /**
      * In the event that the client fails to publish an ordered message, all
      * subsequent publish calls using the same ordering key will fail. Calling
      * this method will disregard the publish failure, allowing the supplied
      * ordering key to be used again in the future.
      *
      * @param {string} orderingKey The ordering key in question.
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      * const topic = pubsub.topic('my-topic', {messageOrdering: true});
      *
      * const orderingKey = 'foo';
      * const data = Buffer.from('Hello, order!');
      *
      * topic.publishMessage({data, orderingKey}, err => {
      *   if (err) {
      *     topic.resumePublishing(orderingKey);
      *   }
      * });
      */
    def resumePublishing(orderingKey: String): Unit = js.native
    
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
  object Topic {
    
    @JSImport("@google-cloud/pubsub/build/src/topic", "Topic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the name of a topic. A Topic's full name is in the format of
      * 'projects/{projectId}/topics/{topicName}'.
      *
      * @private
      *
      * @return {string}
      */
    @scala.inline
    def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type CreateTopicCallback = TopicCallback
  
  type CreateTopicResponse = TopicResponse
  
  type GetTopicCallback = TopicCallback
  
  type GetTopicMetadataCallback = MetadataCallback
  
  type GetTopicMetadataResponse = MetadataResponse
  
  trait GetTopicOptions
    extends StObject
       with CallOptions {
    
    var autoCreate: js.UndefOr[Boolean] = js.undefined
  }
  object GetTopicOptions {
    
    @scala.inline
    def apply(): GetTopicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTopicOptions]
    }
    
    @scala.inline
    implicit class GetTopicOptionsMutableBuilder[Self <: GetTopicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    }
  }
  
  type GetTopicResponse = TopicResponse
  
  type GetTopicSubscriptionsCallback = RequestCallback[Subscription, IListTopicSubscriptionsResponse]
  
  type GetTopicSubscriptionsResponse = PagedResponse[Subscription, IListTopicSubscriptionsResponse]
  
  trait MessageOptions
    extends StObject
       with IPubsubMessage {
    
    var json: js.UndefOr[js.Any] = js.undefined
  }
  object MessageOptions {
    
    @scala.inline
    def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  type MetadataCallback = RequestCallback[TopicMetadata, Unit]
  
  type MetadataResponse = js.Array[TopicMetadata]
  
  type SetTopicMetadataCallback = MetadataCallback
  
  type SetTopicMetadataResponse = MetadataResponse
  
  type TopicCallback = ResourceCallback[Topic, TopicMetadata]
  
  type TopicMetadata = ITopic
  
  type TopicResponse = js.Tuple2[Topic, TopicMetadata]
}
