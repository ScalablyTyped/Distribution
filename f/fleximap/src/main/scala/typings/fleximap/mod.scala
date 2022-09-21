package typings.fleximap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fleximap", "FlexiMap")
  @js.native
  open class FlexiMap () extends StObject {
    def this(`object`: js.Array[Any]) = this()
    def this(`object`: js.Object) = this()
    
    def add(keyChain: KeyChain, value: Any): Double = js.native
    
    def concat(keyChain: KeyChain, value: Any): Any = js.native
    
    def count(keyChain: KeyChain): Double = js.native
    
    def get(keyChain: KeyChain): Any = js.native
    
    def getAll(): js.Array[Any] | js.Object = js.native
    
    def getRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Any = js.native
    
    def getRaw(keyChain: KeyChain): Any = js.native
    
    def hasImmediateKey(key: String): Boolean = js.native
    
    def hasKey(keyChain: KeyChain): Boolean = js.native
    
    def hasObject(keyChain: KeyChain, `object`: js.Object): Boolean = js.native
    
    def hasType(keyChain: KeyChain, `type`: Any): Boolean = js.native
    
    def hasValue(keyChain: KeyChain, value: Any): Boolean = js.native
    
    def pop(keyChain: KeyChain): js.Array[Any] = js.native
    
    def remove(keyChain: KeyChain): Any = js.native
    
    def removeAll(): Unit = js.native
    
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): js.Array[Any] = js.native
    
    def set(keyChain: KeyChain, value: Any): Any = js.native
    
    def splice(keyChain: KeyChain, index: Double, count: Double, items: Any*): js.Array[Any] = js.native
  }
  
  type KeyChain = Any
}
