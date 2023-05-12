package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextBridge extends StObject {
  
  // Docs: https://electronjs.org/docs/api/context-bridge
  def exposeInIsolatedWorld(worldId: Double, apiKey: String, api: Any): Unit
  
  def exposeInMainWorld(apiKey: String, api: Any): Unit
}
object ContextBridge {
  
  inline def apply(exposeInIsolatedWorld: (Double, String, Any) => Unit, exposeInMainWorld: (String, Any) => Unit): ContextBridge = {
    val __obj = js.Dynamic.literal(exposeInIsolatedWorld = js.Any.fromFunction3(exposeInIsolatedWorld), exposeInMainWorld = js.Any.fromFunction2(exposeInMainWorld))
    __obj.asInstanceOf[ContextBridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextBridge] (val x: Self) extends AnyVal {
    
    inline def setExposeInIsolatedWorld(value: (Double, String, Any) => Unit): Self = StObject.set(x, "exposeInIsolatedWorld", js.Any.fromFunction3(value))
    
    inline def setExposeInMainWorld(value: (String, Any) => Unit): Self = StObject.set(x, "exposeInMainWorld", js.Any.fromFunction2(value))
  }
}
