package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * When set to **true**, the current user needs to take action on the item.
    */
  var actionRequired: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days a sent envelope remains active before it expires.
    */
  var expires: js.UndefOr[String] = js.undefined
  
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
  var folderIds: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime of the beginning of a date range. If no value is provided, the default search is the previous 30 days.
    */
  var fromDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the item is a template.
    */
  var isTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) The order in which to sort the results.
    *
    * Valid values are:
    *
    *
    * * `asc`: Ascending order.
    * * `desc`: Descending order.
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The field used to sort the results.
    *
    * Example: `Created`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var searchTarget: js.UndefOr[String] = js.undefined
  
  /**
    * A free text search field for searching across the items in a folder. The search looks for the text that you enter in the recipient names and emails,
    * envelope custom fields, sender name, and subject.
    */
  var searchText: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the envelope. By default, all statuses are returned.
    *
    * For details, see [Envelope Status Code Descriptions](https://developers.docusign.com/esign-rest-api/guides/status-and-error-codes#envelope-status-code-descriptions).
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime of the end of a date range. If no value is provided, the default search is to the current date.
    */
  var toDateTime: js.UndefOr[String] = js.undefined
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionRequired(value: String): Self = StObject.set(x, "actionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionRequiredUndefined: Self = StObject.set(x, "actionRequired", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setFolderIds(value: String): Self = StObject.set(x, "folderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdsUndefined: Self = StObject.set(x, "folderIds", js.undefined)
    
    @scala.inline
    def setFromDateTime(value: String): Self = StObject.set(x, "fromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateTimeUndefined: Self = StObject.set(x, "fromDateTime", js.undefined)
    
    @scala.inline
    def setIsTemplate(value: String): Self = StObject.set(x, "isTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTemplateUndefined: Self = StObject.set(x, "isTemplate", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setSearchTarget(value: String): Self = StObject.set(x, "searchTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTargetUndefined: Self = StObject.set(x, "searchTarget", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setToDateTime(value: String): Self = StObject.set(x, "toDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateTimeUndefined: Self = StObject.set(x, "toDateTime", js.undefined)
  }
}
