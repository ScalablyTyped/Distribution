package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.memoryLru
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryLruGarbageCollector_
  extends StObject
     with MemoryGarbageCollector {
  
  var kind: memoryLru
}
object MemoryLruGarbageCollector_ {
  
  inline def apply(): MemoryLruGarbageCollector_ = {
    val __obj = js.Dynamic.literal(kind = "memoryLru")
    __obj.asInstanceOf[MemoryLruGarbageCollector_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryLruGarbageCollector_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: memoryLru): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
