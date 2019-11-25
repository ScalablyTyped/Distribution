package typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod

import typings.atGoogleDashCloudPreciseDashDate.atGoogleDashCloudPreciseDashDateMod.PreciseDate
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IReceivedMessage
import typings.node.Buffer
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
  def this(sub: Subscriber, hasAckIdMessage: IReceivedMessage) = this()
  var _handled: js.Any = js.native
  var _length: js.Any = js.native
  var _subscriber: js.Any = js.native
  var ackId: String = js.native
  var data: Buffer = js.native
  var id: String = js.native
  /**
    * The length of the message data.
    *
    * @type {number}
    */
  val length: Double = js.native
  var orderingKey: js.UndefOr[String] = js.native
  var publishTime: PreciseDate = js.native
  var received: Double = js.native
  /**
    * Acknowledges the message.
    *
    * @example
    * subscription.on('message', message => {
    *   message.ack();
    * });
    */
  def ack(): Unit = js.native
  /**
    * Modifies the ack deadline.
    *
    * @param {number} deadline The number of seconds to extend the deadline.
    * @private
    */
  def modAck(deadline: Double): Unit = js.native
  /**
    * Removes the message from our inventory and schedules it to be redelivered.
    *
    * @example
    * subscription.on('message', message => {
    *   message.nack();
    * });
    */
  def nack(): Unit = js.native
}

