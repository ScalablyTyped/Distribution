package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTunnelv1ProtoTunnelerInfo extends StObject {
  
  /**
    * backoff_retry_count stores the number of times the tunneler has been retried by tunManager for current backoff sequence. Gets reset to 0 if time difference between 2 consecutive retries exceeds backoffRetryResetTime.
    */
  var backoffRetryCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * id is the unique id of a tunneler.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * latest_err stores the Error for the latest tunneler failure. Gets reset everytime the tunneler is retried by tunManager.
    */
  var latestErr: js.UndefOr[SchemaTunnelv1ProtoTunnelerError] = js.undefined
  
  /**
    * latest_retry_time stores the time when the tunneler was last restarted.
    */
  var latestRetryTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * total_retry_count stores the total number of times the tunneler has been retried by tunManager.
    */
  var totalRetryCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTunnelv1ProtoTunnelerInfo {
  
  inline def apply(): SchemaTunnelv1ProtoTunnelerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTunnelv1ProtoTunnelerInfo]
  }
  
  extension [Self <: SchemaTunnelv1ProtoTunnelerInfo](x: Self) {
    
    inline def setBackoffRetryCount(value: Double): Self = StObject.set(x, "backoffRetryCount", value.asInstanceOf[js.Any])
    
    inline def setBackoffRetryCountNull: Self = StObject.set(x, "backoffRetryCount", null)
    
    inline def setBackoffRetryCountUndefined: Self = StObject.set(x, "backoffRetryCount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLatestErr(value: SchemaTunnelv1ProtoTunnelerError): Self = StObject.set(x, "latestErr", value.asInstanceOf[js.Any])
    
    inline def setLatestErrUndefined: Self = StObject.set(x, "latestErr", js.undefined)
    
    inline def setLatestRetryTime(value: String): Self = StObject.set(x, "latestRetryTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRetryTimeNull: Self = StObject.set(x, "latestRetryTime", null)
    
    inline def setLatestRetryTimeUndefined: Self = StObject.set(x, "latestRetryTime", js.undefined)
    
    inline def setTotalRetryCount(value: Double): Self = StObject.set(x, "totalRetryCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRetryCountNull: Self = StObject.set(x, "totalRetryCount", null)
    
    inline def setTotalRetryCountUndefined: Self = StObject.set(x, "totalRetryCount", js.undefined)
  }
}
