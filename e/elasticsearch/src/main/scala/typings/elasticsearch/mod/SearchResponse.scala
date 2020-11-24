package typings.elasticsearch.mod

import typings.elasticsearch.anon.Hits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse[T] extends js.Object {
  
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
  implicit class SearchResponseOps[Self <: SearchResponse[_], T] (val x: Self with SearchResponse[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = this.set("_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: Hits[T]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimed_out(value: Boolean): Self = this.set("timed_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTook(value: Double): Self = this.set("took", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scroll_id(value: String): Self = this.set("_scroll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_scroll_id: Self = this.set("_scroll_id", js.undefined)
    
    @scala.inline
    def setAggregations(value: js.Any): Self = this.set("aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregations: Self = this.set("aggregations", js.undefined)
  }
}
