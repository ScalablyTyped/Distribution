package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnNewDocumentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `147` extends StObject {
  
  var paramsType: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest] = js.native
  
  var returnType: Unit = js.native
}
object `147` {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest], returnType: Unit): `147` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit class `147MutableBuilder`[Self <: `147`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveScriptToEvaluateOnNewDocumentRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
