package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownGetNodePersistentTaskStatus extends StObject {
  
  var status: ShutdownGetNodeShutdownStatus
}
object ShutdownGetNodePersistentTaskStatus {
  
  inline def apply(status: ShutdownGetNodeShutdownStatus): ShutdownGetNodePersistentTaskStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownGetNodePersistentTaskStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownGetNodePersistentTaskStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ShutdownGetNodeShutdownStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
