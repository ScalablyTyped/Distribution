package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorUserAgentIssueDetails extends StObject {
  
  var location: js.UndefOr[SourceCodeLocation] = js.undefined
  
  var url: String
}
object NavigatorUserAgentIssueDetails {
  
  inline def apply(url: String): NavigatorUserAgentIssueDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorUserAgentIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorUserAgentIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: SourceCodeLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
