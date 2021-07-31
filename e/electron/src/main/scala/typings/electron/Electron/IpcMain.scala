package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcMain
  extends StObject
     with EventEmitter {
  
  // Docs: https://electronjs.org/docs/api/ipc-main
  /**
    * Adds a handler for an `invoke`able IPC. This handler will be called whenever a
    * renderer calls `ipcRenderer.invoke(channel, ...args)`.
    *
    * If `listener` returns a Promise, the eventual result of the promise will be
    * returned as a reply to the remote caller. Otherwise, the return value of the
    * listener will be used as the value of the reply.
    *
    * The `event` that is passed as the first argument to the handler is the same as
    * that passed to a regular event listener. It includes information about which
    * WebContents is the source of the invoke request.
    */
  def handle(
    channel: String,
    listener: js.Function2[/* event */ IpcMainInvokeEvent, /* repeated */ js.Any, js.Promise[Unit] | js.Any]
  ): Unit = js.native
  
  /**
    * Handles a single `invoke`able IPC message, then removes the listener. See
    * `ipcMain.handle(channel, listener)`.
    */
  def handleOnce(
    channel: String,
    listener: js.Function2[/* event */ IpcMainInvokeEvent, /* repeated */ js.Any, js.Promise[Unit] | js.Any]
  ): Unit = js.native
  
  /**
    * Listens to `channel`, when a new message arrives `listener` would be called with
    * `listener(event, args...)`.
    */
  def on(channel: String, listener: js.Function2[/* event */ IpcMainEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    * Adds a one time `listener` function for the event. This `listener` is invoked
    * only the next time a message is sent to `channel`, after which it is removed.
    */
  def once(channel: String, listener: js.Function2[/* event */ IpcMainEvent, /* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    * Removes any handler for `channel`, if present.
    */
  def removeHandler(channel: String): Unit = js.native
}
