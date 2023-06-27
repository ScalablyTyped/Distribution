package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.DeleteSharedStorageEntryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var paramsType: js.Array[DeleteSharedStorageEntryRequest]
  
  var returnType: Unit
}
object `225` {
  
  inline def apply(paramsType: js.Array[DeleteSharedStorageEntryRequest], returnType: Unit): `225` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `225`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteSharedStorageEntryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteSharedStorageEntryRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
