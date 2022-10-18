package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownGetNodePluginsStatus extends StObject {
  
  var status: ShutdownGetNodeShutdownStatus
}
object ShutdownGetNodePluginsStatus {
  
  inline def apply(status: ShutdownGetNodeShutdownStatus): ShutdownGetNodePluginsStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownGetNodePluginsStatus]
  }
  
  extension [Self <: ShutdownGetNodePluginsStatus](x: Self) {
    
    inline def setStatus(value: ShutdownGetNodeShutdownStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
