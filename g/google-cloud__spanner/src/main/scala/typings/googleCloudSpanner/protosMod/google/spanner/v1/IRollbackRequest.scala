package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RollbackRequest. */
trait IRollbackRequest extends StObject {
  
  /** RollbackRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** RollbackRequest transactionId */
  var transactionId: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object IRollbackRequest {
  
  inline def apply(): IRollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRollbackRequest]
  }
  
  extension [Self <: IRollbackRequest](x: Self) {
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTransactionId(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
