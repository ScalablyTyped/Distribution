package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.mod.MemoryLocalCache_
  - typings.firebaseFirestore.mod.PersistentLocalCache_
*/
trait FirestoreLocalCache extends StObject
object FirestoreLocalCache {
  
  inline def MemoryLocalCache_(): typings.firebaseFirestore.mod.MemoryLocalCache_ = {
    val __obj = js.Dynamic.literal(kind = "memory")
    __obj.asInstanceOf[typings.firebaseFirestore.mod.MemoryLocalCache_]
  }
  
  inline def PersistentLocalCache_(): typings.firebaseFirestore.mod.PersistentLocalCache_ = {
    val __obj = js.Dynamic.literal(kind = "persistent")
    __obj.asInstanceOf[typings.firebaseFirestore.mod.PersistentLocalCache_]
  }
}
