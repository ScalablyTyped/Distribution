package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reindex[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var max_docs: js.UndefOr[Double] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var requests_per_second: js.UndefOr[Double] = js.undefined
  
  var scroll: js.UndefOr[String] = js.undefined
  
  var slices: js.UndefOr[Double | String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object Reindex {
  
  @scala.inline
  def apply[T](body: T): Reindex[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reindex[T]]
  }
  
  @scala.inline
  implicit class ReindexMutableBuilder[Self <: Reindex[?], T] (val x: Self & Reindex[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_docs(value: Double): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSlices(value: Double | String): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
