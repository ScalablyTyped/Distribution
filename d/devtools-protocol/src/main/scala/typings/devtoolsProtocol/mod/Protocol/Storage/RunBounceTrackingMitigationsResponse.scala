package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunBounceTrackingMitigationsResponse extends StObject {
  
  var deletedSites: js.Array[String]
}
object RunBounceTrackingMitigationsResponse {
  
  inline def apply(deletedSites: js.Array[String]): RunBounceTrackingMitigationsResponse = {
    val __obj = js.Dynamic.literal(deletedSites = deletedSites.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBounceTrackingMitigationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunBounceTrackingMitigationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeletedSites(value: js.Array[String]): Self = StObject.set(x, "deletedSites", value.asInstanceOf[js.Any])
    
    inline def setDeletedSitesVarargs(value: String*): Self = StObject.set(x, "deletedSites", js.Array(value*))
  }
}
