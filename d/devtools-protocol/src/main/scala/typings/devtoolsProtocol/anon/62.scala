package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.RequestChildNodesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var paramsType: js.Array[RequestChildNodesRequest]
  
  var returnType: Unit
}
object `62` {
  
  inline def apply(paramsType: js.Array[RequestChildNodesRequest], returnType: Unit): `62` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`62`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `62`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RequestChildNodesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestChildNodesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
