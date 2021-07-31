package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcRenderer
  extends StObject
     with EventEmitter {
  
  // Docs: https://electronjs.org/docs/api/ipc-renderer
  /**
    * Resolves with the response from the main process.
    *
    * Send a message to the main process via `channel` and expect a result
    * asynchronously. Arguments will be serialized with the Structured Clone
    * Algorithm, just like `window.postMessage`, so prototype chains will not be
    * included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw
    * an exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The main process should listen for `channel` with `ipcMain.handle()`.
    *
    * For example:
    *
    * If you need to transfer a `MessagePort` to the main process, use
    * `ipcRenderer.postMessage`.
    *
    * If you do not need a response to the message, consider using `ipcRenderer.send`.
    */
  def invoke(channel: String, args: js.Any*): js.Promise[js.Any] = js.native
  
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
    * Send a message to the main process, optionally transferring ownership of zero or
    * more `MessagePort` objects.
    *
    * The transferred `MessagePort` objects will be available in the main process as
    * `MessagePortMain` objects by accessing the `ports` property of the emitted
    * event.
    *
    * For example:
    *
    * For more information on using `MessagePort` and `MessageChannel`, see the MDN
    * documentation.
    */
  def postMessage(channel: String, message: js.Any): Unit = js.native
  def postMessage(channel: String, message: js.Any, transfer: js.Array[MessagePort]): Unit = js.native
  
  /**
    * Send an asynchronous message to the main process via `channel`, along with
    * arguments. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `window.postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The main process handles it by listening for `channel` with the `ipcMain`
    * module.
    *
    * If you need to transfer a `MessagePort` to the main process, use
    * `ipcRenderer.postMessage`.
    *
    * If you want to receive a single response from the main process, like the result
    * of a method call, consider using `ipcRenderer.invoke`.
    */
  def send(channel: String, args: js.Any*): Unit = js.native
  
  /**
    * The value sent back by the `ipcMain` handler.
    *
    * Send a message to the main process via `channel` and expect a result
    * synchronously. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `window.postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
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
