package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a structure used by Map to hold key-value pairs.
  */
@js.native
trait KeyValuePair[K, V] extends StObject {
  
  // undocumented
  var key: K = js.native
  
  var value: V = js.native
}
object KeyValuePair {
  
  @scala.inline
  def apply[K, V](key: K, value: V): KeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[K, V]]
  }
  
  @scala.inline
  implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair[_, _], K, V] (val x: Self with (KeyValuePair[K, V])) extends AnyVal {
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
