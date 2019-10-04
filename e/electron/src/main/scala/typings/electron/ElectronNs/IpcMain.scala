package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcMain extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/ipc-main
  /**
    * Listens to channel, when a new message arrives listener would be called with
    * listener(event, args...).
    */
  def on(channel: String, listener: js.Function2[/* event */ IpcMainEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Adds a one time listener function for the event. This listener is invoked only
    * the next time a message is sent to channel, after which it is removed.
    */
  def once(channel: String, listener: js.Function2[/* event */ IpcMainEvent, /* repeated */ js.Any, Unit]): this.type = js.native
}

