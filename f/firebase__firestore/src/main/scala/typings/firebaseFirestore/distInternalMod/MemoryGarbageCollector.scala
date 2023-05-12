package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distInternalMod.MemoryEagerGarbageCollector_
  - typings.firebaseFirestore.distInternalMod.MemoryLruGarbageCollector_
*/
trait MemoryGarbageCollector extends StObject
object MemoryGarbageCollector {
  
  inline def MemoryEagerGarbageCollector_(_offlineComponentProvider: MemoryOfflineComponentProvider): typings.firebaseFirestore.distInternalMod.MemoryEagerGarbageCollector_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryEager")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.MemoryEagerGarbageCollector_]
  }
  
  inline def MemoryLruGarbageCollector_(_offlineComponentProvider: MemoryOfflineComponentProvider): typings.firebaseFirestore.distInternalMod.MemoryLruGarbageCollector_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryLru")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.MemoryLruGarbageCollector_]
  }
}
