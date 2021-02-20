package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStorageMod {
  
  @JSImport("@firebase/database/dist/src/core/storage/MemoryStorage", "MemoryStorage")
  @js.native
  class MemoryStorage () extends StObject {
    
    var cache_ : js.Any = js.native
    
    def get(key: String): js.Any = js.native
    
    var isInMemoryStorage: Boolean = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
  }
}
