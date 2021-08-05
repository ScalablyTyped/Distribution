package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorIssue extends StObject {
  
  var code: InspectorIssueCode
  
  var details: InspectorIssueDetails
}
object InspectorIssue {
  
  inline def apply(code: InspectorIssueCode, details: InspectorIssueDetails): InspectorIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorIssue]
  }
  
  extension [Self <: InspectorIssue](x: Self) {
    
    inline def setCode(value: InspectorIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: InspectorIssueDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
