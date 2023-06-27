package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetPrerenderingAllowedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var paramsType: js.Array[SetPrerenderingAllowedRequest]
  
  var returnType: Unit
}
object `192` {
  
  inline def apply(paramsType: js.Array[SetPrerenderingAllowedRequest], returnType: Unit): `192` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `192`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetPrerenderingAllowedRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPrerenderingAllowedRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
