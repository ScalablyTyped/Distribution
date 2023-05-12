package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var paramsType: js.Array[TrackCacheStorageForStorageKeyRequest]
  
  var returnType: Unit
}
object `213` {
  
  inline def apply(paramsType: js.Array[TrackCacheStorageForStorageKeyRequest], returnType: Unit): `213` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`213`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `213`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[TrackCacheStorageForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackCacheStorageForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
