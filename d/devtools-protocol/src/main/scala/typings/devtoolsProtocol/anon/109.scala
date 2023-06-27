package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.ClearObjectStoreRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var paramsType: js.Array[ClearObjectStoreRequest]
  
  var returnType: Unit
}
object `109` {
  
  inline def apply(paramsType: js.Array[ClearObjectStoreRequest], returnType: Unit): `109` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `109`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ClearObjectStoreRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearObjectStoreRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
