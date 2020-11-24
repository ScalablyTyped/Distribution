package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingList extends js.Object {
  
  /**
    * An array of `bulkCopy` objects. Each object represents an instance or copy of an envelope and contains details such as the recipient, custom fields, tabs,
    * and other information.
    */
  var bulkCopies: js.UndefOr[js.Array[BulkSendingCopy]] = js.native
  
  /**
    * The GUID of the bulk send list.
    */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * The name of the bulk send list.
    */
  var name: js.UndefOr[String] = js.native
}
object BulkSendingList {
  
  @scala.inline
  def apply(): BulkSendingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingList]
  }
  
  @scala.inline
  implicit class BulkSendingListOps[Self <: BulkSendingList] (val x: Self) extends AnyVal {
    
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
    def setBulkCopiesVarargs(value: BulkSendingCopy*): Self = this.set("bulkCopies", js.Array(value :_*))
    
    @scala.inline
    def setBulkCopies(value: js.Array[BulkSendingCopy]): Self = this.set("bulkCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkCopies: Self = this.set("bulkCopies", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
