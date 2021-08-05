package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callbacks to be notified synchronously on memory access.
  */
trait MemoryAccessCallbacks extends StObject {
  
  def onAccess(details: MemoryAccessDetails): Unit
}
object MemoryAccessCallbacks {
  
  inline def apply(onAccess: MemoryAccessDetails => Unit): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1(onAccess))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
  
  extension [Self <: MemoryAccessCallbacks](x: Self) {
    
    inline def setOnAccess(value: MemoryAccessDetails => Unit): Self = StObject.set(x, "onAccess", js.Any.fromFunction1(value))
  }
}
