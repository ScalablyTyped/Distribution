package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.memoryEager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryEagerGarbageCollector_
  extends StObject
     with MemoryGarbageCollector {
  
  var kind: memoryEager
}
object MemoryEagerGarbageCollector_ {
  
  inline def apply(): MemoryEagerGarbageCollector_ = {
    val __obj = js.Dynamic.literal(kind = "memoryEager")
    __obj.asInstanceOf[MemoryEagerGarbageCollector_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryEagerGarbageCollector_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: memoryEager): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
