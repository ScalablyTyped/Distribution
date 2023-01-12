package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryScanCallbacks extends StObject {
  
  /**
    * Called when the memory range has been fully scanned.
    */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when there was a memory access error while scanning.
    *
    * @param reason Why the memory access failed.
    */
  var onError: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  
  /**
    * Called with each occurence that was found.
    *
    * @param address Memory address where a match was found.
    * @param size Size of this match.
    */
  def onMatch(address: NativePointer, size: Double): Unit | EnumerateAction
}
object MemoryScanCallbacks {
  
  inline def apply(onMatch: (NativePointer, Double) => Unit | EnumerateAction): MemoryScanCallbacks = {
    val __obj = js.Dynamic.literal(onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[MemoryScanCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryScanCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnError(value: /* reason */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnMatch(value: (NativePointer, Double) => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction2(value))
  }
}
