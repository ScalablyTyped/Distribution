package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextBridge extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Record[String, _]): Unit = js.native
}

@JSGlobal("Electron.contextBridge")
@js.native
object contextBridge extends TopLevel[ContextBridge]

