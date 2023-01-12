package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSharedStorageEntryRequest extends StObject {
  
  /**
    * If `ignoreIfPresent` is included and true, then only sets the entry if
    * `key` doesn't already exist.
    */
  var ignoreIfPresent: js.UndefOr[Boolean] = js.undefined
  
  var key: String
  
  var ownerOrigin: String
  
  var value: String
}
object SetSharedStorageEntryRequest {
  
  inline def apply(key: String, ownerOrigin: String, value: String): SetSharedStorageEntryRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSharedStorageEntryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSharedStorageEntryRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnoreIfPresent(value: Boolean): Self = StObject.set(x, "ignoreIfPresent", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfPresentUndefined: Self = StObject.set(x, "ignoreIfPresent", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
