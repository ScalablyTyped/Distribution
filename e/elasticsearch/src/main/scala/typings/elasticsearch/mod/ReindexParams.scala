package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReindexParams extends GenericParams {
  
  @JSName("body")
  var body_ReindexParams: typings.elasticsearch.anon.Conflicts = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var requestsPerSecond: js.UndefOr[Double] = js.native
  
  var slices: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
  
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}
object ReindexParams {
  
  @scala.inline
  def apply(body: typings.elasticsearch.anon.Conflicts): ReindexParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexParams]
  }
  
  @scala.inline
  implicit class ReindexParamsMutableBuilder[Self <: ReindexParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: typings.elasticsearch.anon.Conflicts): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRequestsPerSecond(value: Double): Self = StObject.set(x, "requestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsPerSecondUndefined: Self = StObject.set(x, "requestsPerSecond", js.undefined)
    
    @scala.inline
    def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
