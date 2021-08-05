package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteObjectStoreEntriesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var paramsType: js.Array[DeleteObjectStoreEntriesRequest]
  
  var returnType: Unit
}
object `96` {
  
  inline def apply(paramsType: js.Array[DeleteObjectStoreEntriesRequest], returnType: Unit): `96` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setParamsType(value: js.Array[DeleteObjectStoreEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteObjectStoreEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
