package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/pubsub", "PubSub")
@js.native
class PubSub () extends js.Object {
  def this(options: ClientConfig) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var api: org.scalablytyped.runtime.StringDictionary[googleDashGaxLib.googleDashGaxMod.ClientStub] = js.native
  var auth: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = js.native
  var isEmulator: scala.Boolean = js.native
  var options: ClientConfig = js.native
  var projectId: java.lang.String = js.native
  def createSubscription(topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic, name: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions
  ): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(topic: java.lang.String, name: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions
  ): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionResponse] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createTopic(name: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcTopicMod.CreateTopicResponse] = js.native
  def createTopic(name: java.lang.String, callback: atGoogleDashCloudPubsubLib.buildSrcTopicMod.CreateTopicCallback): scala.Unit = js.native
  def createTopic(name: java.lang.String, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcTopicMod.CreateTopicResponse] = js.native
  def createTopic(
    name: java.lang.String,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcTopicMod.CreateTopicCallback
  ): scala.Unit = js.native
  /**
    * Determine the appropriate endpoint to use for API requests, first trying
    * the local `apiEndpoint` parameter. If the `apiEndpoint` parameter is null
    * we try Pub/Sub emulator environment variable (PUBSUB_EMULATOR_HOST),
    * otherwise the default JSON API.
    *
    * @private
    */
  def determineBaseUrl_(): scala.Unit = js.native
  /**
    * Callback function to PubSub.getClient_().
    * @private
    * @callback GetClientCallback
    * @param err - Error, if any.
    * @param gaxClient - The gax client specified in RequestConfig.client.
    *                    Typed any since it's importing Javascript source.
    */
  /**
    * Get the PubSub client object.
    *
    * @private
    *
    * @param {object} config Configuration object.
    * @param {object} config.gaxOpts GAX options.
    * @param {function} config.method The gax method to call.
    * @param {object} config.reqOpts Request options.
    * @param {function} [callback] The callback function.
    */
  def getClient_(config: GetClientConfig, callback: GetClientCallback): scala.Unit = js.native
  def getSnapshots(): js.Promise[GetSnapshotsResponse] = js.native
  def getSnapshots(callback: GetSnapshotsCallback): scala.Unit = js.native
  def getSnapshots(options: PageOptions): js.Promise[GetSnapshotsResponse] = js.native
  def getSnapshots(options: PageOptions, callback: GetSnapshotsCallback): scala.Unit = js.native
  def getSnapshotsStream(): ObjectStream[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot] = js.native
  def getSubscriptions(): js.Promise[GetSubscriptionsResponse] = js.native
  def getSubscriptions(callback: GetSubscriptionsCallback): scala.Unit = js.native
  def getSubscriptions(options: GetSubscriptionsOptions): js.Promise[GetSubscriptionsResponse] = js.native
  def getSubscriptions(options: GetSubscriptionsOptions, callback: GetSubscriptionsCallback): scala.Unit = js.native
  def getSubscriptionsStream(): ObjectStream[atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription] = js.native
  def getTopics(): js.Promise[GetTopicsResponse] = js.native
  def getTopics(callback: GetTopicsCallback): scala.Unit = js.native
  def getTopics(options: PageOptions): js.Promise[GetTopicsResponse] = js.native
  def getTopics(options: PageOptions, callback: GetTopicsCallback): scala.Unit = js.native
  def getTopicsStream(): ObjectStream[atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic] = js.native
  /**
    * Funnel all API requests through this method, to be sure we have a project
    * ID.
    *
    * @private
    *
    * @param {object} config Configuration object.
    * @param {object} config.gaxOpts GAX options.
    * @param {function} config.method The gax method to call.
    * @param {object} config.reqOpts Request options.
    * @param {function} [callback] The callback function.
    */
  def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): scala.Unit = js.native
  /**
    * Create a Snapshot object. See {@link Subscription#createSnapshot} to
    * create a snapshot.
    *
    * @throws {Error} If a name is not provided.
    *
    * @param {string} name The name of the snapshot.
    * @returns {Snapshot} A {@link Snapshot} instance.
    *
    * @example
    * const {PubSub} = require('@google-cloud/pubsub');
    * const pubsub = new PubSub();
    *
    * const snapshot = pubsub.snapshot('my-snapshot');
    */
  def snapshot(name: java.lang.String): atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot = js.native
  /**
    * Create a Subscription object. This command by itself will not run any API
    * requests. You will receive a {@link Subscription} object,
    * which will allow you to interact with a subscription.
    *
    * @throws {Error} If subscription name is omitted.
    *
    * @param {string} name Name of the subscription.
    * @param {SubscriberOptions} [options] Subscription options.
    * @returns {Subscription} A {@link Subscription} instance.
    *
    * @example
    * const {PubSub} = require('@google-cloud/pubsub');
    * const pubsub = new PubSub();
    *
    * const subscription = pubsub.subscription('my-subscription');
    *
    * // Register a listener for `message` events.
    * subscription.on('message', function(message) {
    *   // Called every time a message is received.
    *   // message.id = ID of the message.
    *   // message.ackId = ID used to acknowledge the message receival.
    *   // message.data = Contents of the message.
    *   // message.attributes = Attributes of the message.
    *   // message.publishTime = Date when Pub/Sub received the message.
    * });
    */
  def subscription(name: java.lang.String): atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription = js.native
  def subscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.SubscriptionOptions
  ): atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription = js.native
  /**
    * Create a Topic object. See {@link PubSub#createTopic} to create a topic.
    *
    * @throws {Error} If a name is not provided.
    *
    * @param {string} name The name of the topic.
    * @returns {Topic} A {@link Topic} instance.
    *
    * @example
    * const {PubSub} = require('@google-cloud/pubsub');
    * const pubsub = new PubSub();
    *
    * const topic = pubsub.topic('my-topic');
    */
  def topic(name: java.lang.String): atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic = js.native
  def topic(name: java.lang.String, options: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishOptions): atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic = js.native
}

