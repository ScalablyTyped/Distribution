package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterRerouteParams extends GenericParams {
  
  var dryRun: js.UndefOr[Boolean] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var metric: js.UndefOr[NameList] = js.native
  
  var retryFailed: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object ClusterRerouteParams {
  
  @scala.inline
  def apply(): ClusterRerouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRerouteParams]
  }
  
  @scala.inline
  implicit class ClusterRerouteParamsMutableBuilder[Self <: ClusterRerouteParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setRetryFailed(value: Boolean): Self = StObject.set(x, "retryFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryFailedUndefined: Self = StObject.set(x, "retryFailed", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
