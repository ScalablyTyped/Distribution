package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteParams
  extends StObject
     with GenericParams {
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var metric: js.UndefOr[NameList] = js.undefined
  
  var retryFailed: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object ClusterRerouteParams {
  
  inline def apply(): ClusterRerouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRerouteParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteParams] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setRetryFailed(value: Boolean): Self = StObject.set(x, "retryFailed", value.asInstanceOf[js.Any])
    
    inline def setRetryFailedUndefined: Self = StObject.set(x, "retryFailed", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
