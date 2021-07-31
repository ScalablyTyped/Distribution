package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcMainInvokeEvent
  extends StObject
     with Event {
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-invoke-event
  /**
    * The ID of the renderer frame that sent this message
    */
  var frameId: Double = js.native
  
  /**
    * Returns the `webContents` that sent the message
    */
  var sender: WebContents_ = js.native
}
