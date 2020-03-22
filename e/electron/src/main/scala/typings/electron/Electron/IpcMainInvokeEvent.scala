package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcMainInvokeEvent extends Event {
  // Docs: http://electronjs.org/docs/api/structures/ipc-main-invoke-event
  /**
    * The ID of the renderer frame that sent this message
    */
  var frameId: Double = js.native
  /**
    * Returns the `webContents` that sent the message
    */
  var sender: WebContents_ = js.native
}

