package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageBucket extends StObject {
  
  /**
    * If not specified, it is the default bucket of the storageKey.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var storageKey: SerializedStorageKey
}
object StorageBucket {
  
  inline def apply(storageKey: SerializedStorageKey): StorageBucket = {
    val __obj = js.Dynamic.literal(storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageBucket] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStorageKey(value: SerializedStorageKey): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
