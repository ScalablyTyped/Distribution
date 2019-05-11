package typings
package atGoogleDashCloudPubsubLib.buildSrcTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/topic", "Topic")
@js.native
class Topic protected () extends js.Object {
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String) = this()
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String, options: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishOptions) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var iam: atGoogleDashCloudPubsubLib.buildSrcIamMod.IAM = js.native
  var metadata: js.UndefOr[TopicMetadata] = js.native
  var name: java.lang.String = js.native
  var parent: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub = js.native
  var publisher: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.Publisher = js.native
  var pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub = js.native
  @JSName("request")
  var request_Original: atGoogleDashCloudPubsubLib.Anon_Callback = js.native
  def create(): js.Promise[CreateTopicResponse] = js.native
  def create(callback: CreateTopicCallback): scala.Unit = js.native
  def create(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[CreateTopicResponse] = js.native
  def create(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions, callback: CreateTopicCallback): scala.Unit = js.native
  def createSubscription(name: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions
  ): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def delete(): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def delete(callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback): scala.Unit = js.native
  def delete(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def delete(
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback
  ): scala.Unit = js.native
  def exists(): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ExistsResponse] = js.native
  def exists(callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ExistsCallback): scala.Unit = js.native
  def get(): js.Promise[GetTopicResponse] = js.native
  def get(callback: GetTopicCallback): scala.Unit = js.native
  def get(gaxOpts: GetTopicOptions): js.Promise[GetTopicResponse] = js.native
  def get(gaxOpts: GetTopicOptions, callback: GetTopicCallback): scala.Unit = js.native
  def getMetadata(): js.Promise[GetTopicMetadataResponse] = js.native
  def getMetadata(callback: GetTopicMetadataCallback): scala.Unit = js.native
  def getMetadata(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[GetTopicMetadataResponse] = js.native
  def getMetadata(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions, callback: GetTopicMetadataCallback): scala.Unit = js.native
  def getSubscriptions(): js.Promise[GetTopicSubscriptionsResponse] = js.native
  def getSubscriptions(callback: GetTopicSubscriptionsCallback): scala.Unit = js.native
  def getSubscriptions(options: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PageOptions): js.Promise[GetTopicSubscriptionsResponse] = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PageOptions,
    callback: GetTopicSubscriptionsCallback
  ): scala.Unit = js.native
  def getSubscriptionsStream(): atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ObjectStream[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription] = js.native
  def publish(data: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def publish(data: nodeLib.Buffer, attributes: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.Attributes): js.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.Attributes,
    callback: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishCallback
  ): scala.Unit = js.native
  def publish(data: nodeLib.Buffer, callback: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishCallback): scala.Unit = js.native
  def publishJSON(json: js.Object): js.Promise[java.lang.String] = js.native
  def publishJSON(json: js.Object, attributes: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.Attributes): js.Promise[java.lang.String] = js.native
  def publishJSON(
    json: js.Object,
    attributes: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.Attributes,
    callback: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishCallback
  ): scala.Unit = js.native
  def publishJSON(json: js.Object, callback: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishCallback): scala.Unit = js.native
  def request[T, R](
    config: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestConfig,
    callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[T, R]
  ): scala.Unit = js.native
  def setMetadata(options: TopicMetadata): js.Promise[SetTopicMetadataResponse] = js.native
  def setMetadata(options: TopicMetadata, callback: SetTopicMetadataCallback): scala.Unit = js.native
  def setMetadata(options: TopicMetadata, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[SetTopicMetadataResponse] = js.native
  def setMetadata(
    options: TopicMetadata,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: SetTopicMetadataCallback
  ): scala.Unit = js.native
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
  def setPublishOptions(options: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishOptions): scala.Unit = js.native
  /**
    * Create a Subscription object. This command by itself will not run any API
    * requests. You will receive a {module:pubsub/subscription} object,
    * which will allow you to interact with a subscription.
    *
    * @throws {Error} If subscription name is omitted.
    *
    * @param {string} name Name of the subscription.
    * @param {object} [options] Configuration object.
    * @param {object} [options.flowControl] Flow control configurations for
    *     receiving messages. Note that these options do not persist across
    *     subscription instances.
    * @param {number} [options.flowControl.maxBytes] The maximum number of bytes
    *     in un-acked messages to allow before the subscription pauses incoming
    *     messages. Defaults to 20% of free memory.
    * @param {number} [options.flowControl.maxMessages=Infinity] The maximum number
    *     of un-acked messages to allow before the subscription pauses incoming
    *     messages.
    * @param {number} [options.maxConnections=5] Use this to limit the number of
    *     connections to be used when sending and receiving messages.
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
  def subscription(name: java.lang.String): atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription = js.native
  def subscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.SubscriptionOptions
  ): atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src/topic", "Topic")
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
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

