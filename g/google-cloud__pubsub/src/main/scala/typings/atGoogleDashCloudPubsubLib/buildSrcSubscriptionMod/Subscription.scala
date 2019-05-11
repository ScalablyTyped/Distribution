package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
@js.native
class Subscription protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String) = this()
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String, options: SubscriptionOptions) = this()
  /**
    * Watches for incoming message event handlers and open/closes the
    * subscriber as needed.
    *
    * @private
    */
  var _listen: js.Any = js.native
  var _subscriber: js.Any = js.native
  var iam: atGoogleDashCloudPubsubLib.buildSrcIamMod.IAM = js.native
  /**
    * Indicates if the Subscription is open and receiving messages.
    *
    * @type {boolean}
    */
  val isOpen: scala.Boolean = js.native
  var metadata: js.UndefOr[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription
  ] = js.native
  var name: java.lang.String = js.native
  /**
    * @type {string}
    */
  val projectId: java.lang.String = js.native
  var pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub = js.native
  @JSName("request")
  var request_Original: atGoogleDashCloudPubsubLib.Anon_Callback = js.native
  var topic: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic | java.lang.String] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(callback: SubscriptionCloseCallback): scala.Unit = js.native
  def create(): js.Promise[CreateSubscriptionResponse] = js.native
  def create(callback: CreateSubscriptionCallback): scala.Unit = js.native
  def create(options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
  def create(options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): scala.Unit = js.native
  def createSnapshot(name: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.CreateSnapshotResponse] = js.native
  def createSnapshot(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.CreateSnapshotCallback
  ): scala.Unit = js.native
  def createSnapshot(name: java.lang.String, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.CreateSnapshotResponse] = js.native
  def createSnapshot(
    name: java.lang.String,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.CreateSnapshotCallback
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
  def get(): js.Promise[GetSubscriptionResponse] = js.native
  def get(callback: GetSubscriptionCallback): scala.Unit = js.native
  def get(gaxOpts: GetSubscriptionOptions): js.Promise[GetSubscriptionResponse] = js.native
  def get(gaxOpts: GetSubscriptionOptions, callback: GetSubscriptionCallback): scala.Unit = js.native
  def getMetadata(): js.Promise[GetSubscriptionMetadataResponse] = js.native
  def getMetadata(callback: GetSubscriptionMetadataCallback): scala.Unit = js.native
  def getMetadata(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[GetSubscriptionMetadataResponse] = js.native
  def getMetadata(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions, callback: GetSubscriptionMetadataCallback): scala.Unit = js.native
  def modifyPushConfig(config: PushConfig): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def modifyPushConfig(config: PushConfig, callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback): scala.Unit = js.native
  def modifyPushConfig(config: PushConfig, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def modifyPushConfig(
    config: PushConfig,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback
  ): scala.Unit = js.native
  /**
    * Opens the Subscription to receive messages. In general this method
    * shouldn't need to be called, unless you wish to receive messages after
    * calling {@link Subscription#close}. Alternatively one could just assign a
    * new `message` event listener which will also re-open the Subscription.
    *
    * @example
    * subscription.on('message', message => message.ack());
    *
    * // Close the subscription.
    * subscription.close(err => {
    *   if (err) {
    *     // Error handling omitted.
    *   }
    *
    *   The subscription has been closed and messages will no longer be received.
    * });
    *
    * // Resume receiving messages.
    * subscription.open();
    */
  def open(): scala.Unit = js.native
  def request[T, R](
    config: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestConfig,
    callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[T, R]
  ): scala.Unit = js.native
  def seek(snapshot: java.lang.String): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekResponse] = js.native
  def seek(snapshot: java.lang.String, callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekCallback): scala.Unit = js.native
  def seek(snapshot: java.lang.String, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekResponse] = js.native
  def seek(
    snapshot: java.lang.String,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekCallback
  ): scala.Unit = js.native
  def seek(snapshot: stdLib.Date): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekResponse] = js.native
  def seek(snapshot: stdLib.Date, callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekCallback): scala.Unit = js.native
  def seek(snapshot: stdLib.Date, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekResponse] = js.native
  def seek(
    snapshot: stdLib.Date,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.SeekCallback
  ): scala.Unit = js.native
  def setMetadata(metadata: SubscriptionMetadata): js.Promise[SetSubscriptionMetadataResponse] = js.native
  def setMetadata(metadata: SubscriptionMetadata, callback: SetSubscriptionMetadataCallback): scala.Unit = js.native
  def setMetadata(metadata: SubscriptionMetadata, gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[SetSubscriptionMetadataResponse] = js.native
  def setMetadata(
    metadata: SubscriptionMetadata,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    callback: SetSubscriptionMetadataCallback
  ): scala.Unit = js.native
  /**
    * Sets the Subscription options.
    *
    * @param {SubscriberOptions} options The options.
    */
  def setOptions(options: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.SubscriberOptions): scala.Unit = js.native
  /**
    * Create a Snapshot object. See {@link Subscription#createSnapshot} to
    * create a snapshot.
    *
    * @throws {Error} If a name is not provided.
    *
    * @param {string} name The name of the snapshot.
    * @returns {Snapshot}
    *
    * @example
    * const snapshot = subscription.snapshot('my-snapshot');
    */
  def snapshot(name: java.lang.String): atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
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

