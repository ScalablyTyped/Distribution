package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataAdaptorOptions extends js.Object {
  
  var accept: js.UndefOr[String] = js.native
  
  var batch: js.UndefOr[String] = js.native
  
  var batchChangeSetContentType: js.UndefOr[String] = js.native
  
  var batchContent: js.UndefOr[String] = js.native
  
  var batchPre: js.UndefOr[String] = js.native
  
  var changeSet: js.UndefOr[String] = js.native
  
  var changeSetContent: js.UndefOr[String] = js.native
  
  var contentId: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[String] = js.native
  
  var expand: js.UndefOr[String] = js.native
  
  var multipartAccept: js.UndefOr[String] = js.native
  
  var requestType: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[String] = js.native
  
  var skip: js.UndefOr[String] = js.native
  
  var sortBy: js.UndefOr[String] = js.native
  
  var take: js.UndefOr[String] = js.native
  
  var where: js.UndefOr[String] = js.native
}
object ODataAdaptorOptions {
  
  @scala.inline
  def apply(): ODataAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataAdaptorOptions]
  }
  
  @scala.inline
  implicit class ODataAdaptorOptionsOps[Self <: ODataAdaptorOptions] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setBatch(value: String): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setBatchChangeSetContentType(value: String): Self = this.set("batchChangeSetContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchChangeSetContentType: Self = this.set("batchChangeSetContentType", js.undefined)
    
    @scala.inline
    def setBatchContent(value: String): Self = this.set("batchContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchContent: Self = this.set("batchContent", js.undefined)
    
    @scala.inline
    def setBatchPre(value: String): Self = this.set("batchPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchPre: Self = this.set("batchPre", js.undefined)
    
    @scala.inline
    def setChangeSet(value: String): Self = this.set("changeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSet: Self = this.set("changeSet", js.undefined)
    
    @scala.inline
    def setChangeSetContent(value: String): Self = this.set("changeSetContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetContent: Self = this.set("changeSetContent", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setMultipartAccept(value: String): Self = this.set("multipartAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipartAccept: Self = this.set("multipartAccept", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSkip(value: String): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setTake(value: String): Self = this.set("take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
