package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * When set to **true**, the current user needs to take action on the item.
    */
  var actionRequired: js.UndefOr[String] = js.native
  
  /**
    * The number of days a sent envelope remains active before it expires.
    */
  var expires: js.UndefOr[String] = js.native
  
  /**
    * Filters for any combination of folder ids and folder types. The possible folder types are:
    *
    * - `awaiting_my_signature`
    * - `completed`
    * - `draft`
    * - `drafts`
    * - `expiring_soon`
    * - `inbox`
    * - `out_for_signature`
    * - `recyclebin`
    * - `sentitems`
    * - `waiting_for_others`
    */
  var folderIds: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime of the beginning of a date range. If no value is provided, the default search is the previous 30 days.
    */
  var fromDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the item is a template.
    */
  var isTemplate: js.UndefOr[String] = js.native
  
  /**
    * (Optional) The order in which to sort the results.
    *
    * Valid values are:
    *
    *
    * * `asc`: Ascending order.
    * * `desc`: Descending order.
    */
  var order: js.UndefOr[String] = js.native
  
  /**
    * The field used to sort the results.
    *
    * Example: `Created`
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var searchTarget: js.UndefOr[String] = js.native
  
  /**
    * A free text search field for searching across the items in a folder. The search looks for the text that you enter in the recipient names and emails,
    * envelope custom fields, sender name, and subject.
    */
  var searchText: js.UndefOr[String] = js.native
  
  /**
    * The status of the envelope. By default, all statuses are returned.
    *
    * For details, see [Envelope Status Code Descriptions](https://developers.docusign.com/esign-rest-api/guides/status-and-error-codes#envelope-status-code-descriptions).
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime of the end of a date range. If no value is provided, the default search is to the current date.
    */
  var toDateTime: js.UndefOr[String] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setActionRequired(value: String): Self = this.set("actionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionRequired: Self = this.set("actionRequired", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setFolderIds(value: String): Self = this.set("folderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderIds: Self = this.set("folderIds", js.undefined)
    
    @scala.inline
    def setFromDateTime(value: String): Self = this.set("fromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDateTime: Self = this.set("fromDateTime", js.undefined)
    
    @scala.inline
    def setIsTemplate(value: String): Self = this.set("isTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTemplate: Self = this.set("isTemplate", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setSearchTarget(value: String): Self = this.set("searchTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTarget: Self = this.set("searchTarget", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setToDateTime(value: String): Self = this.set("toDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDateTime: Self = this.set("toDateTime", js.undefined)
  }
}
