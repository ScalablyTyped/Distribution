package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.EnableReportingApiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var paramsType: js.Array[EnableReportingApiRequest]
  
  var returnType: Unit
}
object `143` {
  
  inline def apply(paramsType: js.Array[EnableReportingApiRequest], returnType: Unit): `143` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[EnableReportingApiRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EnableReportingApiRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
