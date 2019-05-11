package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-queues", "MessageQueue")
@js.native
abstract class MessageQueue protected () extends js.Object {
  def this(sub: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.Subscriber) = this()
  def this(sub: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.Subscriber, options: BatchOptions) = this()
  var _onFlush: js.UndefOr[pDashDeferLib.pDashDeferMod.DeferredPromise[scala.Unit]] = js.native
  var _options: BatchOptions = js.native
  var _requests: QueuedMessages = js.native
  var _subscriber: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.Subscriber = js.native
  var _timer: js.UndefOr[nodeLib.NodeJSNs.Timer] = js.native
  /**
    * Gets the default buffer time in ms.
    *
    * @returns {number}
    * @private
    */
  val maxMilliseconds: scala.Double = js.native
  var numPendingRequests: scala.Double = js.native
  /* protected */ def _sendBatch(batch: QueuedMessages): js.Promise[scala.Unit] = js.native
  /**
    * Adds a message to the queue.
    *
    * @param {Message} message The message to add.
    * @param {number} [deadline] The deadline.
    * @private
    */
  def add(hasAckId: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.Message): scala.Unit = js.native
  def add(hasAckId: atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.Message, deadline: scala.Double): scala.Unit = js.native
  /**
    * Sends a batch of messages.
    * @private
    */
  def flush(): js.Promise[scala.Unit] = js.native
  /**
    * Returns a promise that resolves after the next flush occurs.
    *
    * @returns {Promise}
    * @private
    */
  def onFlush(): js.Promise[scala.Unit] = js.native
  /**
    * Set the batching options.
    *
    * @param {BatchOptions} options Batching options.
    * @private
    */
  def setOptions(options: BatchOptions): scala.Unit = js.native
}

