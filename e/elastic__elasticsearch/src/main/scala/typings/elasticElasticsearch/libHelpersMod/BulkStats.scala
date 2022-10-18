package typings.elasticElasticsearch.libHelpersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkStats extends StObject {
  
  var aborted: Boolean
  
  var bytes: Double
  
  var failed: Double
  
  var noop: Double
  
  var retry: Double
  
  var successful: Double
  
  var time: Double
  
  var total: Double
}
object BulkStats {
  
  inline def apply(
    aborted: Boolean,
    bytes: Double,
    failed: Double,
    noop: Double,
    retry: Double,
    successful: Double,
    time: Double,
    total: Double
  ): BulkStats = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkStats]
  }
  
  extension [Self <: BulkStats](x: Self) {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setNoop(value: Double): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setSuccessful(value: Double): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
