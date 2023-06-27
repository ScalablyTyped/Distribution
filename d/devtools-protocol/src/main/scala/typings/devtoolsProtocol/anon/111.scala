package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteObjectStoreEntriesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var paramsType: js.Array[DeleteObjectStoreEntriesRequest]
  
  var returnType: Unit
}
object `111` {
  
  inline def apply(paramsType: js.Array[DeleteObjectStoreEntriesRequest], returnType: Unit): `111` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteObjectStoreEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteObjectStoreEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
