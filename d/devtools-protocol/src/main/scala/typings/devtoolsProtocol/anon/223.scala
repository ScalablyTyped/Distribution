package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.SetInterestGroupTrackingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var paramsType: js.Array[SetInterestGroupTrackingRequest]
  
  var returnType: Unit
}
object `223` {
  
  inline def apply(paramsType: js.Array[SetInterestGroupTrackingRequest], returnType: Unit): `223` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`223`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `223`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetInterestGroupTrackingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInterestGroupTrackingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
