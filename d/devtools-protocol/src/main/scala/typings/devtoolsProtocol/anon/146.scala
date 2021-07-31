package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnLoadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var paramsType: js.Array[RemoveScriptToEvaluateOnLoadRequest]
  
  var returnType: Unit
}
object `146` {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveScriptToEvaluateOnLoadRequest], returnType: Unit): `146` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveScriptToEvaluateOnLoadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveScriptToEvaluateOnLoadRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
