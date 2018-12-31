package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcRenderer extends EventEmitter {
  /**
    * Send a message to the main process asynchronously via channel, you can also send
    * arbitrary arguments. Arguments will be serialized in JSON internally and hence
    * no functions or prototype chain will be included. The main process handles it by
    * listening for channel with ipcMain module.
    */
  def send(channel: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Send a message to the main process synchronously via channel, you can also send
    * arbitrary arguments. Arguments will be serialized in JSON internally and hence
    * no functions or prototype chain will be included. The main process handles it by
    * listening for channel with ipcMain module, and replies by setting
    * event.returnValue. Note: Sending a synchronous message will block the whole
    * renderer process, unless you know what you are doing you should never use it.
    */
  def sendSync(channel: java.lang.String, args: js.Any*): js.Any = js.native
  /**
    * Sends a message to a window with webContentsId via channel.
    */
  def sendTo(webContentsId: scala.Double, channel: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Like ipcRenderer.send but the event will be sent to the <webview> element in the
    * host page instead of the main process.
    */
  def sendToHost(channel: java.lang.String, args: js.Any*): scala.Unit = js.native
}

