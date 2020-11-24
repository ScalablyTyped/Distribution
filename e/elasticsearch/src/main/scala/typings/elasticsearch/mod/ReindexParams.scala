package typings.elasticsearch.mod

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
  implicit class ReindexParamsOps[Self <: ReindexParams] (val x: Self) extends AnyVal {
    
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
    def setBody(value: typings.elasticsearch.anon.Conflicts): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRequestsPerSecond(value: Double): Self = this.set("requestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsPerSecond: Self = this.set("requestsPerSecond", js.undefined)
    
    @scala.inline
    def setSlices(value: Double): Self = this.set("slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = this.set("waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForCompletion: Self = this.set("waitForCompletion", js.undefined)
  }
}
