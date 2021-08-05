package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnNewDocumentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var paramsType: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest]
  
  var returnType: Unit
}
object `147` {
  
  inline def apply(paramsType: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest], returnType: Unit): `147` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setParamsType(value: js.Array[RemoveScriptToEvaluateOnNewDocumentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveScriptToEvaluateOnNewDocumentRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
