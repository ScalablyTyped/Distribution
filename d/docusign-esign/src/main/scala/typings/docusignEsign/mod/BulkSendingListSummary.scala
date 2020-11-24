package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingListSummary extends js.Object {
  
  /**
    * The GUID of the bulk send list. This property is created after you post a new bulk send list.
    */
  var bulkSendListId: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the user who created the bulk send list.
    */
  var createdByUser: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime that the bulk send list was created.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  /**
    * The name of the bulk send list.
    */
  var name: js.UndefOr[String] = js.native
}
object BulkSendingListSummary {
  
  @scala.inline
  def apply(): BulkSendingListSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingListSummary]
  }
  
  @scala.inline
  implicit class BulkSendingListSummaryOps[Self <: BulkSendingListSummary] (val x: Self) extends AnyVal {
    
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
    def setBulkSendListId(value: String): Self = this.set("bulkSendListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSendListId: Self = this.set("bulkSendListId", js.undefined)
    
    @scala.inline
    def setCreatedByUser(value: String): Self = this.set("createdByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUser: Self = this.set("createdByUser", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
