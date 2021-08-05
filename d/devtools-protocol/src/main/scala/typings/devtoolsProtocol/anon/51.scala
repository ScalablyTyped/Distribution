package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.FocusRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[FocusRequest]]
  
  var returnType: Unit
}
object `51` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[FocusRequest]], returnType: Unit): `51` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[FocusRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[FocusRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
