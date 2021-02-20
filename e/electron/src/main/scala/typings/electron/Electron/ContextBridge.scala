package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextBridge extends StObject {
  
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
  implicit class ContextBridgeMutableBuilder[Self <: ContextBridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposeInMainWorld(value: (String, Record[String, _]) => Unit): Self = StObject.set(x, "exposeInMainWorld", js.Any.fromFunction2(value))
  }
}
