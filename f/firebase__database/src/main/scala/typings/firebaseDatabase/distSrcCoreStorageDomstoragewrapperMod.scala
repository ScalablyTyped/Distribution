package typings.firebaseDatabase

import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreStorageDomstoragewrapperMod {
  
  @JSImport("@firebase/database/dist/src/core/storage/DOMStorageWrapper", "DOMStorageWrapper")
  @js.native
  open class DOMStorageWrapper protected () extends StObject {
    /**
      * @param domStorage_ - The underlying storage object (e.g. localStorage or sessionStorage)
      */
    def this(domStorage_ : Storage) = this()
    
    /* private */ var domStorage_ : Any = js.native
    
    /**
      * @returns The value that was stored under this key, or null
      */
    def get(key: String): Any = js.native
    
    var isInMemoryStorage: Boolean = js.native
    
    /* private */ var prefix_ : Any = js.native
    
    def prefixedName_(name: String): String = js.native
    
    def remove(key: String): Unit = js.native
    
    /**
      * @param key - The key to save the value under
      * @param value - The value being stored, or null to remove the key.
      */
    def set(key: String): Unit = js.native
    def set(key: String, value: Any): Unit = js.native
  }
}
