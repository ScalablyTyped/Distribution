package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlDeleteExpiredData[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var job_id: js.UndefOr[String] = js.native
  
  var requests_per_second: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object MlDeleteExpiredData {
  
  @scala.inline
  def apply[T](): MlDeleteExpiredData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDeleteExpiredData[T]]
  }
  
  @scala.inline
  implicit class MlDeleteExpiredDataOps[Self <: MlDeleteExpiredData[_], T] (val x: Self with MlDeleteExpiredData[T]) extends AnyVal {
    
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
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
    
    @scala.inline
    def setRequests_per_second(value: Double): Self = this.set("requests_per_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests_per_second: Self = this.set("requests_per_second", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
