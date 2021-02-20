package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightSourceOrderRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends StObject {
  
  var paramsType: js.Array[HighlightSourceOrderRequest] = js.native
  
  var returnType: Unit = js.native
}
object `129` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightSourceOrderRequest], returnType: Unit): `129` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129MutableBuilder`[Self <: `129`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightSourceOrderRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HighlightSourceOrderRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
