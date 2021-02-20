package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorIssue extends StObject {
  
  var code: InspectorIssueCode = js.native
  
  var details: InspectorIssueDetails = js.native
}
object InspectorIssue {
  
  @scala.inline
  def apply(code: InspectorIssueCode, details: InspectorIssueDetails): InspectorIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorIssue]
  }
  
  @scala.inline
  implicit class InspectorIssueMutableBuilder[Self <: InspectorIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: InspectorIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: InspectorIssueDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
