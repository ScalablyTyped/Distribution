package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.fallback.operationsProtos.google.rpc.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrpcStatus extends StObject {
  
  /** Represents a Status. */
  var Status: Instantiable0[typings.googleGax.mod.fallback.operationsProtos.google.rpc.Status] & TypeofStatus
}
object TypeofrpcStatus {
  
  inline def apply(Status: Instantiable0[Status] & TypeofStatus): TypeofrpcStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrpcStatus]
  }
  
  extension [Self <: TypeofrpcStatus](x: Self) {
    
    inline def setStatus(value: Instantiable0[Status] & TypeofStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
