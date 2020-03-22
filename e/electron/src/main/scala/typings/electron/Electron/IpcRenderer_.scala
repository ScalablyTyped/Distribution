package typings.electron.Electron

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcRenderer_ extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/ipc-renderer
  /**
    * Resolves with the response from the main process.
    *
    * Send a message to the main process via `channel` and expect a result
    * asynchronously. Arguments will be serialized with the Structured Clone
    * Algorithm, just like `postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The main process should listen for `channel` with `ipcMain.handle()`.
    * 
  For example:
    */
  def invoke(channel: String, args: js.Any*): js.Promise[_] = js.native
  /**
    * Listens to `channel`, when a new message arrives `listener` would be called with
    * `listener(event, args...)`.
    */
  def on(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Adds a one time `listener` function for the event. This `listener` is invoked
    * only the next time a message is sent to `channel`, after which it is removed.
    */
  def once(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Send an asynchronous message to the main process via `channel`, along with
    * arguments. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `postMessage`, so prototype chains will not be included. Sending
    * Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The main process handles it by listening for `channel` with the `ipcMain`
    * module.
    */
  def send(channel: String, args: js.Any*): Unit = js.native
  /**
    * The value sent back by the `ipcMain` handler.
    *
    * Send a message to the main process via `channel` and expect a result
    * synchronously. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `postMessage`, so prototype chains will not be included. Sending
    * Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The main process handles it by listening for `channel` with `ipcMain` module,
    * and replies by setting `event.returnValue`.
    *
    * > :warning: **WARNING**: Sending a synchronous message will block the whole
    * renderer process until the reply is received, so use this method only as a last
    * resort. It's much better to use the asynchronous version, `invoke()`.
    */
  def sendSync(channel: String, args: js.Any*): js.Any = js.native
  /**
    * Sends a message to a window with `webContentsId` via `channel`.
    */
  def sendTo(webContentsId: Double, channel: String, args: js.Any*): Unit = js.native
  /**
    * Like `ipcRenderer.send` but the event will be sent to the `<webview>` element in
    * the host page instead of the main process.
    */
  def sendToHost(channel: String, args: js.Any*): Unit = js.native
}

