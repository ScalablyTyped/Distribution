package typings.gapiDotClientDotCloudtrace.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkEvent extends js.Object {
  /** The number of compressed bytes sent or received. */
  var compressedMessageSize: js.UndefOr[String] = js.undefined
  /** An identifier for the message, which must be unique in this span. */
  var messageId: js.UndefOr[String] = js.undefined
  /**
    * For sent messages, this is the time at which the first bit was sent.
    * For received messages, this is the time at which the last bit was
    * received.
    */
  var time: js.UndefOr[String] = js.undefined
  /**
    * Type of NetworkEvent. Indicates whether the RPC message was sent or
    * received.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The number of uncompressed bytes sent or received. */
  var uncompressedMessageSize: js.UndefOr[String] = js.undefined
}

object NetworkEvent {
  @scala.inline
  def apply(
    compressedMessageSize: String = null,
    messageId: String = null,
    time: String = null,
    `type`: String = null,
    uncompressedMessageSize: String = null
  ): NetworkEvent = {
    val __obj = js.Dynamic.literal()
    if (compressedMessageSize != null) __obj.updateDynamic("compressedMessageSize")(compressedMessageSize)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uncompressedMessageSize != null) __obj.updateDynamic("uncompressedMessageSize")(uncompressedMessageSize)
    __obj.asInstanceOf[NetworkEvent]
  }
}

