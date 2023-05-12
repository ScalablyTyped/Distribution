package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry[K, V] extends StObject {
  
  var key: K
  
  var value: V
}
object Entry {
  
  inline def apply[K, V](key: K, value: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry[?, ?], K, V] (val x: Self & (Entry[K, V])) extends AnyVal {
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
