package typings.firebaseFirestore.distLitePrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an in-memory cache to the SDK. This is the default cache unless explicitly
  * configured otherwise.
  *
  * To use, create an instance using the factory function {@link memoryLocalCache()}, then
  * set the instance to `FirestoreSettings.cache` and call `initializeFirestore` using
  * the settings object.
  */
trait MemoryLocalCache
  extends StObject
     with FirestoreLocalCache {
  
  var kind: memory
}
object MemoryLocalCache {
  
  inline def apply(): MemoryLocalCache = {
    val __obj = js.Dynamic.literal(kind = "memory")
    __obj.asInstanceOf[MemoryLocalCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryLocalCache] (val x: Self) extends AnyVal {
    
    inline def setKind(value: memory): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
