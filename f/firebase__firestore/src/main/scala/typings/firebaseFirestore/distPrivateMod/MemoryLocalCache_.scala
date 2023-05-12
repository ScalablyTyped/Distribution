package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryLocalCache_
  extends StObject
     with FirestoreLocalCache {
  
  var kind: memory
}
object MemoryLocalCache_ {
  
  inline def apply(): MemoryLocalCache_ = {
    val __obj = js.Dynamic.literal(kind = "memory")
    __obj.asInstanceOf[MemoryLocalCache_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryLocalCache_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: memory): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
