package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.DiscardSearchResultsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var paramsType: js.Array[DiscardSearchResultsRequest]
  
  var returnType: Unit
}
object `57` {
  
  inline def apply(paramsType: js.Array[DiscardSearchResultsRequest], returnType: Unit): `57` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `57`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DiscardSearchResultsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DiscardSearchResultsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
