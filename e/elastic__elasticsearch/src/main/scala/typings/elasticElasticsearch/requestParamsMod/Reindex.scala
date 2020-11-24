package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reindex[T] extends Generic {
  
  var body: T = js.native
  
  var max_docs: js.UndefOr[Double] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var requests_per_second: js.UndefOr[Double] = js.native
  
  var scroll: js.UndefOr[String] = js.native
  
  var slices: js.UndefOr[Double | String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var wait_for_active_shards: js.UndefOr[String] = js.native
  
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}
object Reindex {
  
  @scala.inline
  def apply[T](body: T): Reindex[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reindex[T]]
  }
  
  @scala.inline
  implicit class ReindexOps[Self <: Reindex[_], T] (val x: Self with Reindex[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_docs(value: Double): Self = this.set("max_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_docs: Self = this.set("max_docs", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRequests_per_second(value: Double): Self = this.set("requests_per_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests_per_second: Self = this.set("requests_per_second", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSlices(value: Double | String): Self = this.set("slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
}
