package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.ScrollIntoViewIfNeededRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]]
  
  var returnType: Unit
}
object `53` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]], returnType: Unit): `53` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[ScrollIntoViewIfNeededRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
