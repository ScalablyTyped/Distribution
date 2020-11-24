package typings.electron.Electron

import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcRendererEvent extends Event {
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-renderer-event
  /**
    * A list of MessagePorts that were transferred with this message
    */
  var ports: js.Array[MessagePort] = js.native
  
  /**
    * The `IpcRenderer` instance that emitted the event originally
    */
  var sender: IpcRenderer = js.native
  
  /**
    * The `webContents.id` that sent the message, you can call
    * `event.sender.sendTo(event.senderId, ...)` to reply to the message, see
    * ipcRenderer.sendTo for more information. This only applies to messages sent from
    * a different renderer. Messages sent directly from the main process set
    * `event.senderId` to `0`.
    */
  var senderId: Double = js.native
}
