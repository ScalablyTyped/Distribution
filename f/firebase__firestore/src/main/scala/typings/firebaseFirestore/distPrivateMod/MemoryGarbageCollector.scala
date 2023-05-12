package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distPrivateMod.MemoryEagerGarbageCollector_
  - typings.firebaseFirestore.distPrivateMod.MemoryLruGarbageCollector_
*/
trait MemoryGarbageCollector extends StObject
object MemoryGarbageCollector {
  
  inline def MemoryEagerGarbageCollector_(): typings.firebaseFirestore.distPrivateMod.MemoryEagerGarbageCollector_ = {
    val __obj = js.Dynamic.literal(kind = "memoryEager")
    __obj.asInstanceOf[typings.firebaseFirestore.distPrivateMod.MemoryEagerGarbageCollector_]
  }
  
  inline def MemoryLruGarbageCollector_(): typings.firebaseFirestore.distPrivateMod.MemoryLruGarbageCollector_ = {
    val __obj = js.Dynamic.literal(kind = "memoryLru")
    __obj.asInstanceOf[typings.firebaseFirestore.distPrivateMod.MemoryLruGarbageCollector_]
  }
}
