package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Audits.CheckFormsIssuesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCheckFormsIssuesResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: CheckFormsIssuesResponse
}
object ReturnTypeCheckFormsIssuesResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: CheckFormsIssuesResponse): ReturnTypeCheckFormsIssuesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCheckFormsIssuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCheckFormsIssuesResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CheckFormsIssuesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
