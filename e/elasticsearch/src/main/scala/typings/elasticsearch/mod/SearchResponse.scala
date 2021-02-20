package typings.elasticsearch.mod

import typings.elasticsearch.anon.Hits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse[T] extends StObject {
  
  var _scroll_id: js.UndefOr[String] = js.native
  
  var _shards: ShardsResponse = js.native
  
  var aggregations: js.UndefOr[js.Any] = js.native
  
  var hits: Hits[T] = js.native
  
  var timed_out: Boolean = js.native
  
  var took: Double = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply[T](_shards: ShardsResponse, hits: Hits[T], timed_out: Boolean, took: Double): SearchResponse[T] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[T]]
  }
  
  @scala.inline
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse[_], T] (val x: Self with SearchResponse[T]) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Any): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setHits(value: Hits[T]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scroll_id(value: String): Self = StObject.set(x, "_scroll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scroll_idUndefined: Self = StObject.set(x, "_scroll_id", js.undefined)
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
