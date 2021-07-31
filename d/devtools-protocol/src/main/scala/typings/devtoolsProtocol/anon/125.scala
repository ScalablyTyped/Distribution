package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightFrameRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var paramsType: js.Array[HighlightFrameRequest]
  
  var returnType: Unit
}
object `125` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightFrameRequest], returnType: Unit): `125` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit class `125MutableBuilder`[Self <: `125`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HighlightFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
