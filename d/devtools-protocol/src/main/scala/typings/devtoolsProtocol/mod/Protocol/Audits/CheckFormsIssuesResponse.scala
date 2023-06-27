package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckFormsIssuesResponse extends StObject {
  
  var formIssues: js.Array[GenericIssueDetails]
}
object CheckFormsIssuesResponse {
  
  inline def apply(formIssues: js.Array[GenericIssueDetails]): CheckFormsIssuesResponse = {
    val __obj = js.Dynamic.literal(formIssues = formIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckFormsIssuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckFormsIssuesResponse] (val x: Self) extends AnyVal {
    
    inline def setFormIssues(value: js.Array[GenericIssueDetails]): Self = StObject.set(x, "formIssues", value.asInstanceOf[js.Any])
    
    inline def setFormIssuesVarargs(value: GenericIssueDetails*): Self = StObject.set(x, "formIssues", js.Array(value*))
  }
}
