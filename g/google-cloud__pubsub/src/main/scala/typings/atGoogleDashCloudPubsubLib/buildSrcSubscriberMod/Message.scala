package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/subscriber", "Message")
@js.native
class Message protected () extends js.Object {
  /**
    * @hideconstructor
    *
    * @param {Subscriber} sub The parent subscriber.
    * @param {object} message The raw message response.
    */
  def this(sub: Subscriber, hasAckIdMessage: ReceivedMessage) = this()
  var _handled: js.Any = js.native
  var _length: js.Any = js.native
  var _subscriber: js.Any = js.native
  var ackId: java.lang.String = js.native
  var data: nodeLib.Buffer = js.native
  var id: java.lang.String = js.native
  /**
    * The length of the message data.
    *
    * @type {number}
    */
  val length: scala.Double = js.native
  var publishTime: atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod.PreciseDate = js.native
  var received: scala.Double = js.native
  /**
    * Acknowledges the message.
    *
    * @example
    * subscription.on('message', message => {
    *   message.ack();
    * });
    */
  def ack(): scala.Unit = js.native
  /**
    * Modifies the ack deadline.
    *
    * @param {number} deadline The number of seconds to extend the deadline.
    * @private
    */
  def modAck(deadline: scala.Double): scala.Unit = js.native
  /**
    * Removes the message from our inventory and schedules it to be redelivered.
    * If the delay parameter is unset, it will be redelivered immediately.
    *
    * @param {number} [delay=0] The desired time to wait before the
    *     redelivery occurs.
    *
    * @example
    * subscription.on('message', message => {
    *   message.nack();
    * });
    *
    * @example <caption>Specify a delay to redeliver the message</caption>
    * subscription.on('message', message => {
    *   message.nack(60); // redeliver in 1 minute
    * });
    */
  def nack(): scala.Unit = js.native
  def nack(delay: scala.Double): scala.Unit = js.native
}

