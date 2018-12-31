package typings
package engineDotIoLib.engineDotIoMod.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A representation of a client. Inherits from EventEmitter.
	 */
@js.native
trait Socket
  extends nodeLib.eventsMod.EventEmitter {
  /**
  		 * unique identifier
  		 */
  var id: java.lang.String = js.native
  /**
  		 * readyState
  		 */
  var readyState: engineDotIoLib.engineDotIoLibStrings.opening | engineDotIoLib.engineDotIoLibStrings.open | engineDotIoLib.engineDotIoLibStrings.closing | engineDotIoLib.engineDotIoLibStrings.closed = js.native
  /**
  		 * request that originated the Socket
  		 */
  var request: nodeLib.httpMod.IncomingMessage = js.native
  /**
  		 * engine parent reference
  		 */
  var server: Server = js.native
  /**
  		 * whether the transport has been upgraded
  		 */
  var upgraded: scala.Boolean = js.native
  /**
  		 * Disconnects the client
  		 */
  def close(): this.type = js.native
  /**
  		 * Fired when the client is disconnected.
  		 */
  @JSName("on")
  def on_close(
    ev: engineDotIoLib.engineDotIoLibStrings.close,
    fn: js.Function2[
      /* reason */ java.lang.String, 
      /* description */ js.UndefOr[nodeLib.Error], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
  		 * Called when the write buffer is drained
  		 */
  @JSName("on")
  def on_drain(ev: engineDotIoLib.engineDotIoLibStrings.drain, fn: js.Function0[scala.Unit]): this.type = js.native
  /**
  		 * Fired when an error occurs.
  		 */
  @JSName("on")
  def on_error(
    ev: engineDotIoLib.engineDotIoLibStrings.error,
    fn: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /**
  		 * Called when the write buffer is being flushed.
  		 */
  @JSName("on")
  def on_flush(
    ev: engineDotIoLib.engineDotIoLibStrings.flush,
    fn: js.Function1[/* buffer */ js.Array[Packet], scala.Unit]
  ): this.type = js.native
  /**
  		 * Fired when the client sends a message.
  		 */
  @JSName("on")
  def on_message(
    ev: engineDotIoLib.engineDotIoLibStrings.message,
    fn: js.Function1[/* data */ java.lang.String | nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
  		 * packet: Called when a socket received a packet (message, ping)
  		 * packetCreate: Called before a socket sends a packet (message, pong)
  		 */
  @JSName("on")
  def on_packet(ev: engineDotIoLib.engineDotIoLibStrings.packet, fn: js.Function1[/* packet */ Packet, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_packetCreate(
    ev: engineDotIoLib.engineDotIoLibStrings.packetCreate,
    fn: js.Function1[/* packet */ Packet, scala.Unit]
  ): this.type = js.native
  /**
  		 * Sends a message, performing message = toString(arguments[0]) unless sending binary data, which is sent as is.
  		 */
  def send(message: Message): scala.Unit = js.native
  def send(message: Message, opts: MessageOptions): scala.Unit = js.native
  def send(message: Message, opts: MessageOptions, fn: js.Function1[/* transport */ js.Any, scala.Unit]): scala.Unit = js.native
}

