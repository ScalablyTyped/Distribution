package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/subscriber", "Subscriber")
@js.native
class Subscriber protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(subscription: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription) = this()
  def this(subscription: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, options: js.Object) = this()
  var _acks: js.Any = js.native
  var _histogram: js.Any = js.native
  var _inventory: js.Any = js.native
  var _isUserSetDeadline: js.Any = js.native
  var _latencies: js.Any = js.native
  var _modAcks: js.Any = js.native
  var _name: js.Any = js.native
  /**
    * Callback to be invoked when a new message is available.
    *
    * New messages will be added to the subscribers inventory, which in turn will
    * automatically extend the messages ack deadline until either:
    *   a. the user acks/nacks it
    *   b. the maxExtension option is hit
    *
    * If the message puts us at/over capacity, then we'll pause our message
    * stream until we've freed up some inventory space.
    *
    * New messages must immediately issue a ModifyAckDeadline request
    * (aka receipt) to confirm with the backend that we did infact receive the
    * message and its ok to start ticking down on the deadline.
    *
    * @private
    */
  var _onData: js.Any = js.native
  var _options: js.Any = js.native
  var _stream: js.Any = js.native
  var _subscription: js.Any = js.native
  /**
    * Returns a promise that will resolve once all pending requests have settled.
    *
    * @private
    *
    * @returns {Promise}
    */
  var _waitForFlush: js.Any = js.native
  var ackDeadline: scala.Double = js.native
  var isOpen: scala.Boolean = js.native
  /**
    * The 99th percentile of request latencies.
    *
    * @type {number}
    * @private
    */
  val modAckLatency: scala.Double = js.native
  /**
    * The full name of the Subscription.
    *
    * @type {string}
    * @private
    */
  val name: java.lang.String = js.native
  /**
    * Acknowledges the supplied message.
    *
    * @param {Message} message The message to acknowledge.
    * @returns {Promise}
    * @private
    */
  def ack(message: Message): js.Promise[scala.Unit] = js.native
  /**
    * Closes the subscriber. The returned promise will resolve once any pending
    * acks/modAcks are finished.
    *
    * @returns {Promise}
    * @private
    */
  def close(): js.Promise[scala.Unit] = js.native
  /**
    * Gets the subscriber client instance.
    *
    * @returns {Promise<object>}
    * @private
    */
  def getClient(): js.Promise[googleDashGaxLib.googleDashGaxMod.ClientStub] = js.native
  /**
    * Modifies the acknowledge deadline for the provided message.
    *
    * @param {Message} message The message to modify.
    * @param {number} deadline The deadline.
    * @returns {Promise}
    * @private
    */
  def modAck(message: Message, deadline: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Modfies the acknowledge deadline for the provided message and then removes
    * it from our inventory.
    *
    * @param {Message} message The message.
    * @param {number} [delay=0] Delay to wait before redelivery.
    * @return {Promise}
    * @private
    */
  def nack(message: Message): js.Promise[scala.Unit] = js.native
  def nack(message: Message, delay: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Starts pulling messages.
    * @private
    */
  def open(): scala.Unit = js.native
  /**
    * Sets subscriber options.
    *
    * @param {SubscriberOptions} options The options.
    * @private
    */
  def setOptions(options: SubscriberOptions): scala.Unit = js.native
}

