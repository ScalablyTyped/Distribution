package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var paramsType: js.Array[UntrackIndexedDBForStorageKeyRequest]
  
  var returnType: Unit
}
object `219` {
  
  inline def apply(paramsType: js.Array[UntrackIndexedDBForStorageKeyRequest], returnType: Unit): `219` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `219`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[UntrackIndexedDBForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UntrackIndexedDBForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
