package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DanglingIndicesDeleteDanglingIndex extends Generic {
  
  var accept_data_loss: js.UndefOr[Boolean] = js.native
  
  var index_uuid: String = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object DanglingIndicesDeleteDanglingIndex {
  
  @scala.inline
  def apply(index_uuid: String): DanglingIndicesDeleteDanglingIndex = {
    val __obj = js.Dynamic.literal(index_uuid = index_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesDeleteDanglingIndex]
  }
  
  @scala.inline
  implicit class DanglingIndicesDeleteDanglingIndexOps[Self <: DanglingIndicesDeleteDanglingIndex] (val x: Self) extends AnyVal {
    
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
    def setIndex_uuid(value: String): Self = this.set("index_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_data_loss(value: Boolean): Self = this.set("accept_data_loss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_data_loss: Self = this.set("accept_data_loss", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
