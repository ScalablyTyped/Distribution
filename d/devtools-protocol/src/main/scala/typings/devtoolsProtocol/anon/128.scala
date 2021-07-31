package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightRectRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var paramsType: js.Array[HighlightRectRequest]
  
  var returnType: Unit
}
object `128` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightRectRequest], returnType: Unit): `128` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightRectRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HighlightRectRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
