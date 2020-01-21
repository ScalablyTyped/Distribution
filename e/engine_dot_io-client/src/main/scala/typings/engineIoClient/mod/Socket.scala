package typings.engineIoClient.mod

import typings.engineIoClient.engineIoClientStrings.arraybuffer
import typings.engineIoClient.engineIoClientStrings.blob
import typings.engineIoClient.engineIoClientStrings.close
import typings.engineIoClient.engineIoClientStrings.drain
import typings.engineIoClient.engineIoClientStrings.error
import typings.engineIoClient.engineIoClientStrings.flush
import typings.engineIoClient.engineIoClientStrings.message
import typings.engineIoClient.engineIoClientStrings.open
import typings.engineIoClient.engineIoClientStrings.ping
import typings.engineIoClient.engineIoClientStrings.pong
import typings.engineIoClient.engineIoClientStrings.upgrade
import typings.engineIoClient.engineIoClientStrings.upgradeError
import typings.std.ArrayBuffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io-client", "Socket")
@js.native
class Socket () extends js.Object {
  var binaryType: js.UndefOr[arraybuffer | blob] = js.native
  var protocol: js.UndefOr[Double] = js.native
  /**
  		 * Disconnects the client.
  		 */
  def close(): this.type = js.native
  /*
  		 * Fired upon disconnection. In compliance with the WebSocket API spec, this event may be fired even if the open event does not occur (i.e. due to connection error or close()).
  		 */
  @JSName("on")
  def on_close(ev: close, cb: js.Function2[/* mes */ String, /* detail */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_drain(ev: drain, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired when an error occurs.
  		 */
  @JSName("on")
  def on_error(ev: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_flush(ev: flush, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired when data is received from the server.
  		 */
  @JSName("on")
  def on_message(ev: message, cb: js.Function1[/* data */ String | ArrayBuffer, Unit]): this.type = js.native
  /*
  		 * open: Fired upon successful connection.
  		 * flush: Fired upon completing a buffer flush
  		 * drain: Fired after drain event of transport if writeBuffer is empty
  		 * ping: Fired upon flushing a ping packet (ie: actual packet write out)
  		 * pong: Fired upon receiving a pong packet.
  		 */
  @JSName("on")
  def on_open(ev: open, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ping(ev: ping, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pong(ev: pong, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired upon upgrade success, after the new transport is set
  		 */
  @JSName("on")
  def on_upgrade(ev: upgrade, cb: js.Function1[/* transport */ js.Any, Unit]): this.type = js.native
  /*
  		 * Fired if an error occurs with a transport we're trying to upgrade to.
  		 */
  @JSName("on")
  def on_upgradeError(ev: upgradeError, cb: js.Function1[/* err */ UpgradeError, Unit]): this.type = js.native
  /**
  		 * Sends a message to the server
  		 */
  def send(message: Message): this.type = js.native
  def send(message: Message, opts: MessageOptions): this.type = js.native
  def send(message: Message, opts: MessageOptions, cb: js.Function0[Unit]): this.type = js.native
}

