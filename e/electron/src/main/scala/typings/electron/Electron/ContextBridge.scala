package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextBridge extends StObject {
  
  // Docs: https://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Record[String, js.Any]): Unit
}
object ContextBridge {
  
  inline def apply(exposeInMainWorld: (String, Record[String, js.Any]) => Unit): ContextBridge = {
    val __obj = js.Dynamic.literal(exposeInMainWorld = js.Any.fromFunction2(exposeInMainWorld))
    __obj.asInstanceOf[ContextBridge]
  }
  
  extension [Self <: ContextBridge](x: Self) {
    
    inline def setExposeInMainWorld(value: (String, Record[String, js.Any]) => Unit): Self = StObject.set(x, "exposeInMainWorld", js.Any.fromFunction2(value))
  }
}
