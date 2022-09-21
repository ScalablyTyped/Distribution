package typings.fastMemoryCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-memory-cache", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MemoryCache
  
  @js.native
  trait MemoryCache extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def get(key: String): Any = js.native
    
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, expireTime: Double): Unit = js.native
  }
}
