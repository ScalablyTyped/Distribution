package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.ScrollIntoViewIfNeededRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]]
  
  var returnType: Unit
}
object `49` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]], returnType: Unit): `49` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[ScrollIntoViewIfNeededRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
