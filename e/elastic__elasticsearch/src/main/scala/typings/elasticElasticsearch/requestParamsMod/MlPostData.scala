package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPostData[T] extends Generic {
  
  var body: T = js.native
  
  var job_id: String = js.native
  
  var reset_end: js.UndefOr[String] = js.native
  
  var reset_start: js.UndefOr[String] = js.native
}
object MlPostData {
  
  @scala.inline
  def apply[T](body: T, job_id: String): MlPostData[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostData[T]]
  }
  
  @scala.inline
  implicit class MlPostDataOps[Self <: MlPostData[_], T] (val x: Self with MlPostData[T]) extends AnyVal {
    
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
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset_end(value: String): Self = this.set("reset_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset_end: Self = this.set("reset_end", js.undefined)
    
    @scala.inline
    def setReset_start(value: String): Self = this.set("reset_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset_start: Self = this.set("reset_start", js.undefined)
  }
}
