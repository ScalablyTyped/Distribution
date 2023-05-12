package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryCacheSettings extends StObject {
  
  /**
    * The garbage collector to use, for the memory cache layer.
    * A `MemoryEagerGarbageCollector` is used when this is undefined.
    */
  var garbageCollector: js.UndefOr[MemoryGarbageCollector] = js.undefined
}
object MemoryCacheSettings {
  
  inline def apply(): MemoryCacheSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryCacheSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryCacheSettings] (val x: Self) extends AnyVal {
    
    inline def setGarbageCollector(value: MemoryGarbageCollector): Self = StObject.set(x, "garbageCollector", value.asInstanceOf[js.Any])
    
    inline def setGarbageCollectorUndefined: Self = StObject.set(x, "garbageCollector", js.undefined)
  }
}
