package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callbacks to be notified synchronously on memory access.
  */
@js.native
trait MemoryAccessCallbacks extends StObject {
  
  def onAccess(details: MemoryAccessDetails): Unit = js.native
}
object MemoryAccessCallbacks {
  
  @scala.inline
  def apply(onAccess: MemoryAccessDetails => Unit): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1(onAccess))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
  
  @scala.inline
  implicit class MemoryAccessCallbacksMutableBuilder[Self <: MemoryAccessCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAccess(value: MemoryAccessDetails => Unit): Self = StObject.set(x, "onAccess", js.Any.fromFunction1(value))
  }
}
