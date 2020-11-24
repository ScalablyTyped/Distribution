package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlFlushJob[T] extends Generic {
  
  var advance_time: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var calc_interim: js.UndefOr[Boolean] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var job_id: String = js.native
  
  var skip_time: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[String] = js.native
}
object MlFlushJob {
  
  @scala.inline
  def apply[T](job_id: String): MlFlushJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFlushJob[T]]
  }
  
  @scala.inline
  implicit class MlFlushJobOps[Self <: MlFlushJob[_], T] (val x: Self with MlFlushJob[T]) extends AnyVal {
    
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
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvance_time(value: String): Self = this.set("advance_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvance_time: Self = this.set("advance_time", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCalc_interim(value: Boolean): Self = this.set("calc_interim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalc_interim: Self = this.set("calc_interim", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setSkip_time(value: String): Self = this.set("skip_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip_time: Self = this.set("skip_time", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
