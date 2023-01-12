package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.SetSharedStorageTrackingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var paramsType: js.Array[SetSharedStorageTrackingRequest]
  
  var returnType: Unit
}
object `220` {
  
  inline def apply(paramsType: js.Array[SetSharedStorageTrackingRequest], returnType: Unit): `220` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`220`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `220`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetSharedStorageTrackingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetSharedStorageTrackingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
