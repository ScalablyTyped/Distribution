package typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbClientMetadata extends StObject {
  
  /** The auto-generated client id assigned at client startup. */
  var clientId: String
  
  /** Whether this client is running in a foreground tab. */
  var inForeground: Boolean
  
  /** Whether the client's network connection is enabled. */
  var networkEnabled: Boolean
  
  /** The last time this state was updated. */
  var updateTimeMs: Double
}
object DbClientMetadata {
  
  inline def apply(clientId: String, inForeground: Boolean, networkEnabled: Boolean, updateTimeMs: Double): DbClientMetadata = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], inForeground = inForeground.asInstanceOf[js.Any], networkEnabled = networkEnabled.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbClientMetadata]
  }
  
  extension [Self <: DbClientMetadata](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setInForeground(value: Boolean): Self = StObject.set(x, "inForeground", value.asInstanceOf[js.Any])
    
    inline def setNetworkEnabled(value: Boolean): Self = StObject.set(x, "networkEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeMs(value: Double): Self = StObject.set(x, "updateTimeMs", value.asInstanceOf[js.Any])
  }
}
