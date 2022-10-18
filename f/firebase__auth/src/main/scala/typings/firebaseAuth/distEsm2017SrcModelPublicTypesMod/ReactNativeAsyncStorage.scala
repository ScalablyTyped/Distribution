package typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactNativeAsyncStorage extends StObject {
  
  /**
    * Retrieve an item from storage.
    *
    * @param key - storage key.
    */
  def getItem(key: String): js.Promise[String | Null]
  
  /**
    * Remove an item from storage.
    *
    * @param key - storage key.
    */
  def removeItem(key: String): js.Promise[Unit]
  
  /**
    * Persist an item in storage.
    *
    * @param key - storage key.
    * @param value - storage value.
    */
  def setItem(key: String, value: String): js.Promise[Unit]
}
object ReactNativeAsyncStorage {
  
  inline def apply(
    getItem: String => js.Promise[String | Null],
    removeItem: String => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit]
  ): ReactNativeAsyncStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[ReactNativeAsyncStorage]
  }
  
  extension [Self <: ReactNativeAsyncStorage](x: Self) {
    
    inline def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
