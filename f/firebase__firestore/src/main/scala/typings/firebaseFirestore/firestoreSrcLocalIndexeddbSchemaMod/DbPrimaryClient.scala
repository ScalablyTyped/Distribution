package typings.firebaseFirestore.firestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbPrimaryClient extends StObject {
  
  /** Whether to allow shared access from multiple tabs. */
  var allowTabSynchronization: Boolean
  
  var leaseTimestampMs: Double
  
  var ownerId: String
}
object DbPrimaryClient {
  
  inline def apply(allowTabSynchronization: Boolean, leaseTimestampMs: Double, ownerId: String): DbPrimaryClient = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], leaseTimestampMs = leaseTimestampMs.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbPrimaryClient]
  }
  
  extension [Self <: DbPrimaryClient](x: Self) {
    
    inline def setAllowTabSynchronization(value: Boolean): Self = StObject.set(x, "allowTabSynchronization", value.asInstanceOf[js.Any])
    
    inline def setLeaseTimestampMs(value: Double): Self = StObject.set(x, "leaseTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
  }
}
