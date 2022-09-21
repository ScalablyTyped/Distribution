package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStorageMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/storage/MemoryStorage", "MemoryStorage")
  @js.native
  open class MemoryStorage () extends StObject {
    
    /* private */ var cache_ : Any = js.native
    
    def get(key: String): Any = js.native
    
    var isInMemoryStorage: Boolean = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: Any): Unit = js.native
  }
}
