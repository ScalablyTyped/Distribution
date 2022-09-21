package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTunnelv1ProtoTunnelerError extends StObject {
  
  /**
    * Original raw error
    */
  var err: js.UndefOr[String | Null] = js.undefined
  
  /**
    * retryable isn't used for now, but we may want to reuse it in the future.
    */
  var retryable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTunnelv1ProtoTunnelerError {
  
  inline def apply(): SchemaTunnelv1ProtoTunnelerError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTunnelv1ProtoTunnelerError]
  }
  
  extension [Self <: SchemaTunnelv1ProtoTunnelerError](x: Self) {
    
    inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrNull: Self = StObject.set(x, "err", null)
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setRetryable(value: Boolean): Self = StObject.set(x, "retryable", value.asInstanceOf[js.Any])
    
    inline def setRetryableNull: Self = StObject.set(x, "retryable", null)
    
    inline def setRetryableUndefined: Self = StObject.set(x, "retryable", js.undefined)
  }
}
