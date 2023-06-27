package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var paramsType: js.Array[TrackCacheStorageForStorageKeyRequest]
  
  var returnType: Unit
}
object `216` {
  
  inline def apply(paramsType: js.Array[TrackCacheStorageForStorageKeyRequest], returnType: Unit): `216` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `216`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[TrackCacheStorageForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackCacheStorageForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
