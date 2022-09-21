package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedArrayBufferIssueDetails extends StObject {
  
  var isWarning: Boolean
  
  var sourceCodeLocation: SourceCodeLocation
  
  var `type`: SharedArrayBufferIssueType
}
object SharedArrayBufferIssueDetails {
  
  inline def apply(isWarning: Boolean, sourceCodeLocation: SourceCodeLocation, `type`: SharedArrayBufferIssueType): SharedArrayBufferIssueDetails = {
    val __obj = js.Dynamic.literal(isWarning = isWarning.asInstanceOf[js.Any], sourceCodeLocation = sourceCodeLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedArrayBufferIssueDetails]
  }
  
  extension [Self <: SharedArrayBufferIssueDetails](x: Self) {
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeLocation(value: SourceCodeLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setType(value: SharedArrayBufferIssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
