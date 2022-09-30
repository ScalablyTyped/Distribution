package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.flowPublisherMod.FlowControlledPublisher
import typings.googleCloudPubsub.iamMod.IAM
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ITopic
import typings.googleCloudPubsub.publisherMod.PublishCallback
import typings.googleCloudPubsub.publisherMod.PublishOptions
import typings.googleCloudPubsub.publisherMod.Publisher
import typings.googleCloudPubsub.pubsubMessageMod.Attributes
import typings.googleCloudPubsub.pubsubMessageMod.PubsubMessage
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
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicMod {
  
  @JSImport("@google-cloud/pubsub/build/src/topic", "Topic")
  @js.native
  open class Topic protected () extends StObject {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: PublishOptions) = this()
    
    /**
      * Create a topic.
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {CreateTopicCallback} [callback] Callback function.
      * @returns {Promise<CreateTopicResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.create((err, topic, apiResponse) => {
      *   if (!err) {
      *     // The topic was created successfully.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.create().then((data) => {
      *   const topic = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def create(): js.Promise[CreateTopicResponse] = js.native
    def create(callback: CreateTopicCallback): Unit = js.native
    def create(gaxOpts: CallOptions): js.Promise[CreateTopicResponse] = js.native
    def create(gaxOpts: CallOptions, callback: CreateTopicCallback): Unit = js.native
    
    def createSubscription(name: String): js.Promise[CreateSubscriptionResponse] = js.native
    /**
      * Create a subscription to this topic.
      *
      * @see [Subscriptions: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/create}
      *
      * @throws {Error} If subscription name is omitted.
      *
      * @param {string} name The name of the subscription.
      * @param {CreateSubscriptionRequest} [options] See a
      *     [Subscription
      * resource](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions).
      * @param {CreateSubscriptionCallback} [callback] Callback function.
      * @returns {Promise<CreateSubscriptionResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const callback = function(err, subscription, apiResponse) {};
      *
      * // Without specifying any options.
      * topic.createSubscription('newMessages', callback);
      *
      * // With options.
      * topic.createSubscription('newMessages', {
      *   ackDeadlineSeconds: 90
      * }, callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.createSubscription('newMessages').then((data) => {
      *   const subscription = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def createSubscription(name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(name: String, options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): Unit = js.native
    
    def delete(): js.Promise[EmptyResponse] = js.native
    /**
      * Delete the topic. This will not delete subscriptions to this topic.
      *
      * @see [Topics: delete API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/delete}
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {function} [callback] The callback function.
      * @param {?error} callback.err An error returned while making this
      *     request.
      * @param {object} callback.apiResponse Raw API response.
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.delete((err, apiResponse) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.delete().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(callback: EmptyCallback): Unit = js.native
    def delete(gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def delete(gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    
    /**
      * @typedef {array} TopicExistsResponse
      * @property {boolean} 0 Whether the topic exists
      */
    /**
      * @callback TopicExistsCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the topic exists.
      */
    /**
      * Check if a topic exists.
      *
      * @param {TopicExistsCallback} [callback] Callback function.
      * @returns {Promise<TopicExistsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.exists((err, exists) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.exists().then((data) => {
      *   const exists = data[0];
      * });
      * ```
      */
    def exists(): js.Promise[ExistsResponse] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    
    /**
      * Creates a FlowControlledPublisher for this Topic.
      *
      * FlowControlledPublisher is a helper that lets you control how many messages
      * are simultaneously queued to send, to avoid ballooning memory usage on
      * a low bandwidth connection to Pub/Sub.
      *
      * Note that it's perfectly fine to create more than one on the same Topic.
      * The actual flow control settings on the Topic will apply across all
      * FlowControlledPublisher objects on that Topic.
      *
      * @returns {FlowControlledPublisher} The flow control helper.
      */
    def flowControlled(): FlowControlledPublisher = js.native
    
    /**
      * Immediately sends all remaining queued data. This is mostly useful
      * if you are planning to call close() on the PubSub object that holds
      * the server connections.
      *
      * @param {EmptyCallback} [callback] Callback function.
      * @returns {Promise<EmptyResponse>}
      */
    def flush(): js.Promise[Unit] = js.native
    def flush(callback: EmptyCallback): Unit = js.native
    
    def get(): js.Promise[GetTopicResponse] = js.native
    /**
      * @typedef {array} GetTopicResponse
      * @property {Topic} 0 The {@link Topic}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetTopicCallback
      * @param {?Error} err Request error, if any.
      * @param {Topic} topic The {@link Topic}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a topic if it exists.
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {boolean} [gaxOpts.autoCreate=false] Automatically create the topic
      *     does not already exist.
      * @param {GetTopicCallback} [callback] Callback function.
      * @returns {Promise<GetTopicResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.get((err, topic, apiResponse) => {
      *   // The `topic` data has been populated.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.get().then((data) => {
      *   const topic = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def get(callback: GetTopicCallback): Unit = js.native
    def get(gaxOpts: GetTopicOptions): js.Promise[GetTopicResponse] = js.native
    def get(gaxOpts: GetTopicOptions, callback: GetTopicCallback): Unit = js.native
    
    def getMetadata(): js.Promise[GetTopicMetadataResponse] = js.native
    /**
      * @typedef {array} GetTopicMetadataResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback GetTopicMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get the official representation of this topic from the API.
      *
      * @see [Topics: get API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/get}
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {GetTopicMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetTopicMetadataResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.getMetadata((err, apiResponse) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.getMetadata().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def getMetadata(callback: GetTopicMetadataCallback): Unit = js.native
    def getMetadata(gaxOpts: CallOptions): js.Promise[GetTopicMetadataResponse] = js.native
    def getMetadata(gaxOpts: CallOptions, callback: GetTopicMetadataCallback): Unit = js.native
    
    /**
      * Get the default publisher options. These may be modified and passed
      * back into {@link Topic#setPublishOptions}.
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * const defaults = topic.getPublishOptionDefaults();
      * defaults.batching.maxMilliseconds = 10;
      * topic.setPublishOptions(defaults);
      * ```
      */
    def getPublishOptionDefaults(): PublishOptions = js.native
    
    def getSubscriptions(): js.Promise[GetTopicSubscriptionsResponse] = js.native
    /**
      * Get a list of the subscriptions registered to this topic. You may
      * optionally provide a query object as the first argument to customize the
      * response.
      *
      * Your provided callback will be invoked with an error object if an API error
      * occurred or an array of {module:pubsub/subscription} objects.
      *
      * @see [Subscriptions: list API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics.subscriptions/list}
      *
      * @param {GetSubscriptionsRequest} [query] Query object for listing subscriptions.
      * @param {GetSubscriptionsCallback} [callback] Callback function.
      * @returns {Promise<GetSubscriptionsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      *
      * topic.getSubscriptions((err, subscriptions) => {
      *   // subscriptions is an array of `Subscription` objects.
      * });
      *
      * // Customize the query.
      * topic.getSubscriptions({
      *   pageSize: 3
      * }, callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * topic.getSubscriptions().then((data) => {
      *   const subscriptions = data[0];
      * });
      * ```
      */
    def getSubscriptions(callback: GetTopicSubscriptionsCallback): Unit = js.native
    def getSubscriptions(options: PageOptions): js.Promise[GetTopicSubscriptionsResponse] = js.native
    def getSubscriptions(options: PageOptions, callback: GetTopicSubscriptionsCallback): Unit = js.native
    
    def getSubscriptionsStream(): ObjectStream[Subscription] = js.native
    
    var iam: IAM = js.native
    
    var metadata: js.UndefOr[TopicMetadata] = js.native
    
    var name: String = js.native
    
    var parent: PubSub = js.native
    
    /**
      * Publish the provided message.
      *
      * @deprecated Please use {@link Topic#publishMessage}.
      *
      * @throws {TypeError} If data is not a Buffer object.
      * @throws {TypeError} If any value in `attributes` object is not a string.
      *
      * @param {buffer} data The message data. This must come in the form of a
      *     Buffer object.
      * @param {object.<string, string>} [attributes] Attributes for this message.
      * @param {PublishCallback} [callback] Callback function.
      * @returns {Promise<PublishResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const data = Buffer.from('Hello, world!');
      *
      * const callback = (err, messageId) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * };
      *
      * topic.publish(data, callback);
      *
      * ```
      * @example Optionally you can provide an object containing attributes for the message. Note that all values in the object must be strings.
      * ```
      * const attributes = {
      *   key: 'value'
      * };
      *
      * topic.publish(data, attributes, callback);
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * topic.publish(data).then((messageId) => {});
      * ```
      */
    def publish(data: Buffer): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publish(data: Buffer, callback: PublishCallback): Unit = js.native
    
    /**
      * Publish the provided JSON. It should be noted that all messages published
      * are done so in the form of a Buffer. This is simply a convenience method
      * that will transform JSON into a Buffer before publishing.
      * {@link Subscription} objects will always return message data in the form of
      * a Buffer, so any JSON published will require manual deserialization.
      *
      * @deprecated Please use the `json` option via {@link Topic#publishMessage}.
      *
      * @throws {Error} If non-object data is provided.
      *
      * @param {object} json The JSON data to publish.
      * @param {object} [attributes] Attributes for this message.
      * @param {PublishCallback} [callback] Callback function.
      * @returns {Promise<PublishResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      * const topic = pubsub.topic('my-topic');
      *
      * const data = {
      *   foo: 'bar'
      * };
      *
      * const callback = (err, messageId) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * };
      *
      * topic.publishJSON(data, callback);
      *
      * ```
      * @example Optionally you can provide an object containing attributes for the message. Note that all values in the object must be strings.
      * ```
      * const attributes = {
      *   key: 'value'
      * };
      *
      * topic.publishJSON(data, attributes, callback);
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * topic.publishJSON(data).then((messageId) => {});
      * ```
      */
    def publishJSON(json: js.Object): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes): js.Promise[String] = js.native
    def publishJSON(json: js.Object, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publishJSON(json: js.Object, callback: PublishCallback): Unit = js.native
    
    /**
      * @typedef {object} MessageOptions
      * @property {buffer} [data] The message data.
      * @property {object} [json] Convenience property to publish JSON data. This
      *     will transform the provided JSON into a Buffer before publishing.
      *     {@link Subscription} objects will always return message data in the
      *     form of a Buffer, so any JSON published will require manual
      *     deserialization.
      * @property {object.<string, string>} [attributes] Attributes for this
      *     message.
      * @property {string} [orderingKey] A message ordering key.
      */
    /**
      * Publish the provided message.
      *
      * @throws {TypeError} If data is not a Buffer object.
      * @throws {TypeError} If any value in `attributes` object is not a string.
      *
      * @param {MessageOptions} message Message object.
      * @param {PublishCallback} [callback] Callback function.
      * @returns {Promise<PublishResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      * const topic = pubsub.topic('my-topic');
      *
      * const data = Buffer.from('Hello, world!');
      *
      * const callback = (err, messageId) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * };
      *
      * topic.publishMessage({data}, callback);
      *
      * ```
      * @example Publish JSON message data.
      * ```
      * const json = {foo: 'bar'};
      *
      * topic.publishMessage({json}, callback);
      *
      * ```
      * @example To publish messages in order (this is still experimental), make sure message ordering is enabled and provide an ordering key
      * ```
      * const topic = pubsub.topic('ordered-topic', {messageOrdering: true});
      * const orderingKey = 'my-key';
      *
      * topic.publishMessage({data, orderingKey}, callback);
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * const messageId = await topic.publishMessage({data});
      * ```
      */
    def publishMessage(message: MessageOptions): js.Promise[String] = js.native
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
      * ```
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
      * ```
      */
    def resumePublishing(orderingKey: String): Unit = js.native
    
    /**
      * @typedef {array} SetTopicMetadataResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback SetTopicMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Updates the topic.
      *
      * @see [UpdateTopicRequest API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#google.pubsub.v1.UpdateTopicRequest}
      *
      * @param {object} metadata The fields to update. This should be structured
      *     like a {@link
      * https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic|Topic
      * object}.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {SetTopicMetadataCallback} [callback] Callback function.
      * @returns {Promise<SetTopicMetadataResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const metadata = {
      *   labels: {foo: 'bar'}
      * };
      *
      * topic.setMetadata(metadata, err => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * topic.setMetadata(metadata).then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
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
      * ```
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
      * ```
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
      * ```
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
      * ```
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
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
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
    
    inline def apply(): GetTopicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTopicOptions]
    }
    
    extension [Self <: GetTopicOptions](x: Self) {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    }
  }
  
  type GetTopicResponse = TopicResponse
  
  type GetTopicSubscriptionsCallback = RequestCallback[Subscription, IListTopicSubscriptionsResponse]
  
  type GetTopicSubscriptionsResponse = PagedResponse[Subscription, IListTopicSubscriptionsResponse]
  
  trait MessageOptions
    extends StObject
       with PubsubMessage {
    
    var json: js.UndefOr[Any] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
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
