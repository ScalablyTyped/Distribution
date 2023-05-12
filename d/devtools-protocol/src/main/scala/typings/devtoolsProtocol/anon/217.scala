package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var paramsType: js.Array[UntrackCacheStorageForStorageKeyRequest]
  
  var returnType: Unit
}
object `217` {
  
  inline def apply(paramsType: js.Array[UntrackCacheStorageForStorageKeyRequest], returnType: Unit): `217` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `217`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[UntrackCacheStorageForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UntrackCacheStorageForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
