package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceTrackingIssueDetails extends StObject {
  
  var trackingSites: js.Array[String]
}
object BounceTrackingIssueDetails {
  
  inline def apply(trackingSites: js.Array[String]): BounceTrackingIssueDetails = {
    val __obj = js.Dynamic.literal(trackingSites = trackingSites.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceTrackingIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BounceTrackingIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setTrackingSites(value: js.Array[String]): Self = StObject.set(x, "trackingSites", value.asInstanceOf[js.Any])
    
    inline def setTrackingSitesVarargs(value: String*): Self = StObject.set(x, "trackingSites", js.Array(value*))
  }
}
