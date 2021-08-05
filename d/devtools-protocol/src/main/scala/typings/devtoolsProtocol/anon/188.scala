package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var paramsType: js.Array[UntrackCacheStorageForOriginRequest]
  
  var returnType: Unit
}
object `188` {
  
  inline def apply(paramsType: js.Array[UntrackCacheStorageForOriginRequest], returnType: Unit): `188` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setParamsType(value: js.Array[UntrackCacheStorageForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UntrackCacheStorageForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
