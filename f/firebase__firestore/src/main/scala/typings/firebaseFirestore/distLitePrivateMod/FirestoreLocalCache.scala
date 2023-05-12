package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Union type from all supported SDK cache layer.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distLitePrivateMod.MemoryLocalCache
  - typings.firebaseFirestore.distLitePrivateMod.PersistentLocalCache
*/
trait FirestoreLocalCache extends StObject
object FirestoreLocalCache {
  
  inline def MemoryLocalCache(): typings.firebaseFirestore.distLitePrivateMod.MemoryLocalCache = {
    val __obj = js.Dynamic.literal(kind = "memory")
    __obj.asInstanceOf[typings.firebaseFirestore.distLitePrivateMod.MemoryLocalCache]
  }
  
  inline def PersistentLocalCache(): typings.firebaseFirestore.distLitePrivateMod.PersistentLocalCache = {
    val __obj = js.Dynamic.literal(kind = "persistent")
    __obj.asInstanceOf[typings.firebaseFirestore.distLitePrivateMod.PersistentLocalCache]
  }
}
