package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.ClearSharedStorageEntriesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var paramsType: js.Array[ClearSharedStorageEntriesRequest]
  
  var returnType: Unit
}
object `226` {
  
  inline def apply(paramsType: js.Array[ClearSharedStorageEntriesRequest], returnType: Unit): `226` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`226`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `226`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ClearSharedStorageEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearSharedStorageEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
