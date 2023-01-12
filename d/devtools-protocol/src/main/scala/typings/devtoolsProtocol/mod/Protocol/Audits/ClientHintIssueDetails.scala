package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientHintIssueDetails extends StObject {
  
  var clientHintIssueReason: ClientHintIssueReason
  
  var sourceCodeLocation: SourceCodeLocation
}
object ClientHintIssueDetails {
  
  inline def apply(clientHintIssueReason: ClientHintIssueReason, sourceCodeLocation: SourceCodeLocation): ClientHintIssueDetails = {
    val __obj = js.Dynamic.literal(clientHintIssueReason = clientHintIssueReason.asInstanceOf[js.Any], sourceCodeLocation = sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHintIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientHintIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setClientHintIssueReason(value: ClientHintIssueReason): Self = StObject.set(x, "clientHintIssueReason", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocation(value: SourceCodeLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
  }
}
