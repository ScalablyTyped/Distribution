package typings.expirymanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expirymanager", "ExpiryManager")
  @js.native
  open class ExpiryManager () extends StObject {
    
    def clear(): Unit = js.native
    
    def expire(keys: Keys, seconds: Double): Unit = js.native
    
    def extractExpiredKeys(): Keys = js.native
    def extractExpiredKeys(time: Double): Keys = js.native
    
    def getExpiredKeys(): Keys = js.native
    def getExpiredKeys(time: Double): Keys = js.native
    
    def getExpiry(key: Key): Double = js.native
    
    def getKeysByExpiry(expiry: Double): Keys = js.native
    
    def now(): Double = js.native
    
    def unexpire(keys: Keys): Unit = js.native
  }
  
  type Key = Any
  
  type Keys = js.Array[Key]
}
