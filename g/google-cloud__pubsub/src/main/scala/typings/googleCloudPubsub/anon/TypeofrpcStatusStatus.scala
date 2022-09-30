package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.operationsProtos.google.rpc.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrpcStatusStatus extends StObject {
  
  /** Represents a Status. */
  var Status: Instantiable0[typings.googleGax.mod.operationsProtos.google.rpc.Status] & TypeofStatus
}
object TypeofrpcStatusStatus {
  
  inline def apply(Status: Instantiable0[Status] & TypeofStatus): TypeofrpcStatusStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrpcStatusStatus]
  }
  
  extension [Self <: TypeofrpcStatusStatus](x: Self) {
    
    inline def setStatus(value: Instantiable0[Status] & TypeofStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
