package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextBridge extends StObject {
  
  // Docs: https://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Any): Unit
}
object ContextBridge {
  
  inline def apply(exposeInMainWorld: (String, Any) => Unit): ContextBridge = {
    val __obj = js.Dynamic.literal(exposeInMainWorld = js.Any.fromFunction2(exposeInMainWorld))
    __obj.asInstanceOf[ContextBridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextBridge] (val x: Self) extends AnyVal {
    
    inline def setExposeInMainWorld(value: (String, Any) => Unit): Self = StObject.set(x, "exposeInMainWorld", js.Any.fromFunction2(value))
  }
}
