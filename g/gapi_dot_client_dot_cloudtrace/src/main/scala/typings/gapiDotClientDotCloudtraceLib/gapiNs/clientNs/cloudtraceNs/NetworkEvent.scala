package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NetworkEvent extends js.Object {
  /** The number of compressed bytes sent or received. */
  var compressedMessageSize: js.UndefOr[java.lang.String] = js.undefined
  /** An identifier for the message, which must be unique in this span. */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * For sent messages, this is the time at which the first bit was sent.
               * For received messages, this is the time at which the last bit was
               * received.
               */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Type of NetworkEvent. Indicates whether the RPC message was sent or
               * received.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The number of uncompressed bytes sent or received. */
  var uncompressedMessageSize: js.UndefOr[java.lang.String] = js.undefined
}

