package typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod

import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription
import typings.googleDashGax.googleDashGaxMod.ClientStub
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/subscriber", "Subscriber")
@js.native
class Subscriber protected () extends EventEmitter {
  def this(subscription: Subscription) = this()
  def this(subscription: Subscription, options: js.Object) = this()
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
  var ackDeadline: Double = js.native
  var isOpen: Boolean = js.native
  /**
    * The 99th percentile of request latencies.
    *
    * @type {number}
    * @private
    */
  val modAckLatency: Double = js.native
  /**
    * The full name of the Subscription.
    *
    * @type {string}
    * @private
    */
  val name: String = js.native
  /**
    * Acknowledges the supplied message.
    *
    * @param {Message} message The message to acknowledge.
    * @returns {Promise}
    * @private
    */
  def ack(message: Message): js.Promise[Unit] = js.native
  /**
    * Closes the subscriber. The returned promise will resolve once any pending
    * acks/modAcks are finished.
    *
    * @returns {Promise}
    * @private
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Gets the subscriber client instance.
    *
    * @returns {Promise<object>}
    * @private
    */
  def getClient(): js.Promise[ClientStub] = js.native
  /**
    * Modifies the acknowledge deadline for the provided message.
    *
    * @param {Message} message The message to modify.
    * @param {number} deadline The deadline.
    * @returns {Promise}
    * @private
    */
  def modAck(message: Message, deadline: Double): js.Promise[Unit] = js.native
  /**
    * Modfies the acknowledge deadline for the provided message and then removes
    * it from our inventory.
    *
    * @param {Message} message The message.
    * @return {Promise}
    * @private
    */
  def nack(message: Message): js.Promise[Unit] = js.native
  /**
    * Starts pulling messages.
    * @private
    */
  def open(): Unit = js.native
  /**
    * Sets subscriber options.
    *
    * @param {SubscriberOptions} options The options.
    * @private
    */
  def setOptions(options: SubscriberOptions): Unit = js.native
}

