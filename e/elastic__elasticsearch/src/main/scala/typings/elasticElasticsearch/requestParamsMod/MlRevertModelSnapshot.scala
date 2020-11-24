package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlRevertModelSnapshot[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var delete_intervening_results: js.UndefOr[Boolean] = js.native
  
  var job_id: String = js.native
  
  var snapshot_id: String = js.native
}
object MlRevertModelSnapshot {
  
  @scala.inline
  def apply[T](job_id: String, snapshot_id: String): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
  
  @scala.inline
  implicit class MlRevertModelSnapshotOps[Self <: MlRevertModelSnapshot[_], T] (val x: Self with MlRevertModelSnapshot[T]) extends AnyVal {
    
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
    def setSnapshot_id(value: String): Self = this.set("snapshot_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setDelete_intervening_results(value: Boolean): Self = this.set("delete_intervening_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete_intervening_results: Self = this.set("delete_intervening_results", js.undefined)
  }
}
