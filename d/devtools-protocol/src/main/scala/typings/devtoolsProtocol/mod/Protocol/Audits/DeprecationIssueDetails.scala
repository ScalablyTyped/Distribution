package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecationIssueDetails extends StObject {
  
  var affectedFrame: js.UndefOr[AffectedFrame] = js.undefined
  
  var sourceCodeLocation: SourceCodeLocation
  
  var `type`: DeprecationIssueType
}
object DeprecationIssueDetails {
  
  inline def apply(sourceCodeLocation: SourceCodeLocation, `type`: DeprecationIssueType): DeprecationIssueDetails = {
    val __obj = js.Dynamic.literal(sourceCodeLocation = sourceCodeLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecationIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecationIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setAffectedFrame(value: AffectedFrame): Self = StObject.set(x, "affectedFrame", value.asInstanceOf[js.Any])
    
    inline def setAffectedFrameUndefined: Self = StObject.set(x, "affectedFrame", js.undefined)
    
    inline def setSourceCodeLocation(value: SourceCodeLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeprecationIssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
