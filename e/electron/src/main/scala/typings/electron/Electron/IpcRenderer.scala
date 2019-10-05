package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcRenderer extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/ipc-renderer
  /**
    * Listens to channel, when a new message arrives listener would be called with
    * listener(event, args...).
    */
  def on(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Adds a one time listener function for the event. This listener is invoked only
    * the next time a message is sent to channel, after which it is removed.
    */
  def once(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Send a message to the main process asynchronously via channel, you can also send
    * arbitrary arguments. Arguments will be serialized in JSON internally and hence
    * no functions or prototype chain will be included. The main process handles it by
    * listening for channel with ipcMain module.
    */
  def send(channel: String, args: js.Any*): Unit = js.native
  /**
    * Send a message to the main process synchronously via channel, you can also send
    * arbitrary arguments. Arguments will be serialized in JSON internally and hence
    * no functions or prototype chain will be included. The main process handles it by
    * listening for channel with ipcMain module, and replies by setting
    * event.returnValue. Note: Sending a synchronous message will block the whole
    * renderer process, unless you know what you are doing you should never use it.
    */
  def sendSync(channel: String, args: js.Any*): js.Any = js.native
  /**
    * Sends a message to a window with webContentsId via channel.
    */
  def sendTo(webContentsId: Double, channel: String, args: js.Any*): Unit = js.native
  /**
    * Like ipcRenderer.send but the event will be sent to the <webview> element in the
    * host page instead of the main process.
    */
  def sendToHost(channel: String, args: js.Any*): Unit = js.native
}

@JSGlobal("Electron.ipcRenderer")
@js.native
object ipcRenderer extends TopLevel[IpcRenderer]

