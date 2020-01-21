package typings.googleCloudPubsub.leaseManagerMod

import typings.googleCloudPubsub.subscriberMod.Message
import typings.googleCloudPubsub.subscriberMod.Subscriber
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/lease-manager", "LeaseManager")
@js.native
class LeaseManager protected () extends EventEmitter {
  def this(sub: Subscriber) = this()
  def this(sub: Subscriber, options: js.Object) = this()
  /**
    * Stops extending message deadlines.
    *
    * @private
    */
  var _cancelExtension: js.Any = js.native
  /**
    * Emits the message. Emitting messages is very slow, so to avoid it acting
    * as a bottleneck, we're wrapping it in nextTick.
    *
    * @private
    *
    * @fires Subscriber#message
    *
    * @param {Message} message The message to emit.
    */
  var _dispense: js.Any = js.native
  /**
    * Loops through inventory and extends the deadlines for any messages that
    * have not hit the max extension option.
    *
    * @private
    */
  var _extendDeadlines: js.Any = js.native
  /**
    * Creates a timeout(ms) that should allow us to extend any message deadlines
    * before they would be redelivered.
    *
    * @private
    *
    * @returns {number}
    */
  var _getNextExtensionTimeoutMs: js.Any = js.native
  var _isLeasing: js.Any = js.native
  var _messages: js.Any = js.native
  var _options: js.Any = js.native
  var _pending: js.Any = js.native
  /**
    * Schedules an deadline extension for all messages.
    *
    * @private
    */
  var _scheduleExtension: js.Any = js.native
  var _subscriber: js.Any = js.native
  var _timer: js.UndefOr[js.Any] = js.native
  var bytes: Double = js.native
  /**
    * @type {number}
    * @private
    */
  val pending: Double = js.native
  /**
    * @type {number}
    * @private
    */
  val size: Double = js.native
  /**
    * Adds a message to the inventory, kicking off the deadline extender if it
    * isn't already running.
    *
    * @param {Message} message The message.
    * @private
    */
  def add(message: Message): Unit = js.native
  /**
    * Removes ALL messages from inventory.
    * @private
    */
  def clear(): Unit = js.native
  /**
    * Indicates if we're at or over capacity.
    *
    * @returns {boolean}
    * @private
    */
  def isFull(): Boolean = js.native
  /**
    * Removes a message from the inventory. Stopping the deadline extender if no
    * messages are left over.
    *
    * @fires LeaseManager#free
    *
    * @param {Message} message The message to remove.
    * @private
    */
  def remove(message: Message): Unit = js.native
  /**
    * Sets options for the LeaseManager.
    *
    * @param {FlowControlOptions} [options] The options.
    * @private
    */
  def setOptions(options: FlowControlOptions): Unit = js.native
}

