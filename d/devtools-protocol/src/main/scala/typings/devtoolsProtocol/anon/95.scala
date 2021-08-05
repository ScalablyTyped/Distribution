package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteDatabaseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var paramsType: js.Array[DeleteDatabaseRequest]
  
  var returnType: Unit
}
object `95` {
  
  inline def apply(paramsType: js.Array[DeleteDatabaseRequest], returnType: Unit): `95` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setParamsType(value: js.Array[DeleteDatabaseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteDatabaseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
