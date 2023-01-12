package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Storage {
  
  trait Storage extends StObject {
    
    // Remove all data from storage.
    def clear(): js.Promise[Unit]
    
    // Fetch a value for a key.
    def get(key: String): js.Promise[String]
    
    // Fetch array of all keys.
    def keys(): js.Promise[js.Array[String]]
    
    // Remove a single key. Fulfills promise with previous value, if exists.
    def remove(key: String): js.Promise[String]
    
    // Sets a value to a key. Fulfills promise with the previous value, if it
    // exists.
    def set(key: String, value: String): js.Promise[String]
  }
  object Storage {
    
    inline def apply(
      clear: () => js.Promise[Unit],
      get: String => js.Promise[String],
      keys: () => js.Promise[js.Array[String]],
      remove: String => js.Promise[String],
      set: (String, String) => js.Promise[String]
    ): typings.freedom.freedom.Storage.Storage = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[typings.freedom.freedom.Storage.Storage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.freedom.freedom.Storage.Storage] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setRemove(value: String => js.Promise[String]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
