package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerVersionUpdatedEvent extends StObject {
  
  var versions: js.Array[ServiceWorkerVersion]
}
object WorkerVersionUpdatedEvent {
  
  inline def apply(versions: js.Array[ServiceWorkerVersion]): WorkerVersionUpdatedEvent = {
    val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerVersionUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerVersionUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setVersions(value: js.Array[ServiceWorkerVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: ServiceWorkerVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
