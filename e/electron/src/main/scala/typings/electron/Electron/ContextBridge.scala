package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextBridge extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Record[String, _]): Unit = js.native
}
object ContextBridge {
  
  @scala.inline
  def apply(exposeInMainWorld: (String, Record[String, _]) => Unit): ContextBridge = {
    val __obj = js.Dynamic.literal(exposeInMainWorld = js.Any.fromFunction2(exposeInMainWorld))
    __obj.asInstanceOf[ContextBridge]
  }
  
  @scala.inline
  implicit class ContextBridgeOps[Self <: ContextBridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExposeInMainWorld(value: (String, Record[String, _]) => Unit): Self = this.set("exposeInMainWorld", js.Any.fromFunction2(value))
  }
}
