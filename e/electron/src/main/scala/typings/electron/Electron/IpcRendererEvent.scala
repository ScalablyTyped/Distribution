package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcRendererEvent extends Event {
  // Docs: http://electronjs.org/docs/api/structures/ipc-renderer-event
  /**
    * The IpcRenderer instance that emitted the event originally
    */
  var sender: IpcRenderer_ = js.native
  /**
    * The webContents.id that sent the message, you can call
    * event.sender.sendTo(event.senderId, ...) to reply to the message, see for more
    * information. This only applies to messages sent from a different renderer.
    * Messages sent directly from the main process set event.senderId to 0.
    */
  var senderId: Double = js.native
}

