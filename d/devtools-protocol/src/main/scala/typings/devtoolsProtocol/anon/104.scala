package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizeScrollGestureRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var paramsType: js.Array[SynthesizeScrollGestureRequest]
  
  var returnType: Unit
}
object `104` {
  
  @scala.inline
  def apply(paramsType: js.Array[SynthesizeScrollGestureRequest], returnType: Unit): `104` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit class `104MutableBuilder`[Self <: `104`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SynthesizeScrollGestureRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SynthesizeScrollGestureRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
