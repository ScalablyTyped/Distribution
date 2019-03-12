package typings
package engineDotIoDashClientLib.engineDotIoDashClientMod.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var binaryType: js.UndefOr[
    engineDotIoDashClientLib.engineDotIoDashClientLibStrings.arraybuffer | engineDotIoDashClientLib.engineDotIoDashClientLibStrings.blob
  ] = js.native
  var protocol: js.UndefOr[scala.Double] = js.native
  /**
  		 * Disconnects the client.
  		 */
  def close(): this.type = js.native
  /*
  		 * Fired upon disconnection. In compliance with the WebSocket API spec, this event may be fired even if the open event does not occur (i.e. due to connection error or close()).
  		 */
  @JSName("on")
  def on_close(
    ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.close,
    cb: js.Function2[/* mes */ java.lang.String, /* detail */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drain(ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.drain, cb: js.Function0[scala.Unit]): this.type = js.native
  /*
  		 * Fired when an error occurs.
  		 */
  @JSName("on")
  def on_error(
    ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_flush(ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.flush, cb: js.Function0[scala.Unit]): this.type = js.native
  /*
  		 * Fired when data is received from the server.
  		 */
  @JSName("on")
  def on_message(
    ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.message,
    cb: js.Function1[/* data */ java.lang.String | stdLib.ArrayBuffer, scala.Unit]
  ): this.type = js.native
  /*
  		 * open: Fired upon successful connection.
  		 * flush: Fired upon completing a buffer flush
  		 * drain: Fired after drain event of transport if writeBuffer is empty
  		 * ping: Fired upon flushing a ping packet (ie: actual packet write out)
  		 * pong: Fired upon receiving a pong packet.
  		 */
  @JSName("on")
  def on_open(ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.open, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ping(ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.ping, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pong(ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.pong, cb: js.Function0[scala.Unit]): this.type = js.native
  /*
  		 * Fired upon upgrade success, after the new transport is set
  		 */
  @JSName("on")
  def on_upgrade(
    ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.upgrade,
    cb: js.Function1[/* transport */ js.Any, scala.Unit]
  ): this.type = js.native
  /*
  		 * Fired if an error occurs with a transport we're trying to upgrade to.
  		 */
  @JSName("on")
  def on_upgradeError(
    ev: engineDotIoDashClientLib.engineDotIoDashClientLibStrings.upgradeError,
    cb: js.Function1[/* err */ UpgradeError, scala.Unit]
  ): this.type = js.native
  /**
  		 * Sends a message to the server
  		 */
  def send(message: Message): this.type = js.native
  def send(message: Message, opts: MessageOptions): this.type = js.native
  def send(message: Message, opts: MessageOptions, cb: js.Function0[scala.Unit]): this.type = js.native
}

