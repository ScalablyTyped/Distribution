package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.DiscardSearchResultsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var paramsType: js.Array[DiscardSearchResultsRequest]
  
  var returnType: Unit
}
object `50` {
  
  @scala.inline
  def apply(paramsType: js.Array[DiscardSearchResultsRequest], returnType: Unit): `50` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit class `50MutableBuilder`[Self <: `50`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DiscardSearchResultsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DiscardSearchResultsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
