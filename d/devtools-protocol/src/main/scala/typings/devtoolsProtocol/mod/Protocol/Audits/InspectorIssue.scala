package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorIssue extends StObject {
  
  var code: InspectorIssueCode
  
  var details: InspectorIssueDetails
  
  /**
    * A unique id for this issue. May be omitted if no other entity (e.g.
    * exception, CDP message, etc.) is referencing this issue.
    */
  var issueId: js.UndefOr[IssueId] = js.undefined
}
object InspectorIssue {
  
  inline def apply(code: InspectorIssueCode, details: InspectorIssueDetails): InspectorIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectorIssue] (val x: Self) extends AnyVal {
    
    inline def setCode(value: InspectorIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: InspectorIssueDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setIssueId(value: IssueId): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
    
    inline def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
  }
}
