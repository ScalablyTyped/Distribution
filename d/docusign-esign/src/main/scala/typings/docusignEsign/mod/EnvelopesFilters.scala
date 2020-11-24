package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopesFilters extends js.Object {
  
  var acStatus: js.UndefOr[String] = js.native
  
  var continuationToken: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[String] = js.native
  
  var customField: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var envelopeIds: js.UndefOr[String] = js.native
  
  var exclude: js.UndefOr[String] = js.native
  
  var folderIds: js.UndefOr[String] = js.native
  
  var folderTypes: js.UndefOr[String] = js.native
  
  var fromDate: js.UndefOr[String] = js.native
  
  var fromToStatus: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[String] = js.native
  
  var includePurgeInformation: js.UndefOr[String] = js.native
  
  var intersectingFolderIds: js.UndefOr[String] = js.native
  
  var lastQueriedDate: js.UndefOr[String] = js.native
  
  var order: js.UndefOr[String] = js.native
  
  var orderBy: js.UndefOr[String] = js.native
  
  var powerformids: js.UndefOr[String] = js.native
  
  var queryBudget: js.UndefOr[String] = js.native
  
  var requesterDateFormat: js.UndefOr[String] = js.native
  
  var searchText: js.UndefOr[String] = js.native
  
  var startPosition: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var toDate: js.UndefOr[String] = js.native
  
  var transactionIds: js.UndefOr[String] = js.native
  
  var userFilter: js.UndefOr[String] = js.native
  
  var userId: js.UndefOr[String] = js.native
  
  var userName: js.UndefOr[String] = js.native
}
object EnvelopesFilters {
  
  @scala.inline
  def apply(): EnvelopesFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopesFilters]
  }
  
  @scala.inline
  implicit class EnvelopesFiltersOps[Self <: EnvelopesFilters] (val x: Self) extends AnyVal {
    
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
    def setAcStatus(value: String): Self = this.set("acStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcStatus: Self = this.set("acStatus", js.undefined)
    
    @scala.inline
    def setContinuationToken(value: String): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("continuationToken", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCustomField(value: String): Self = this.set("customField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomField: Self = this.set("customField", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnvelopeIds(value: String): Self = this.set("envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIds: Self = this.set("envelopeIds", js.undefined)
    
    @scala.inline
    def setExclude(value: String): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFolderIds(value: String): Self = this.set("folderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderIds: Self = this.set("folderIds", js.undefined)
    
    @scala.inline
    def setFolderTypes(value: String): Self = this.set("folderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderTypes: Self = this.set("folderTypes", js.undefined)
    
    @scala.inline
    def setFromDate(value: String): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDate: Self = this.set("fromDate", js.undefined)
    
    @scala.inline
    def setFromToStatus(value: String): Self = this.set("fromToStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromToStatus: Self = this.set("fromToStatus", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIncludePurgeInformation(value: String): Self = this.set("includePurgeInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePurgeInformation: Self = this.set("includePurgeInformation", js.undefined)
    
    @scala.inline
    def setIntersectingFolderIds(value: String): Self = this.set("intersectingFolderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersectingFolderIds: Self = this.set("intersectingFolderIds", js.undefined)
    
    @scala.inline
    def setLastQueriedDate(value: String): Self = this.set("lastQueriedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastQueriedDate: Self = this.set("lastQueriedDate", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPowerformids(value: String): Self = this.set("powerformids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerformids: Self = this.set("powerformids", js.undefined)
    
    @scala.inline
    def setQueryBudget(value: String): Self = this.set("queryBudget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryBudget: Self = this.set("queryBudget", js.undefined)
    
    @scala.inline
    def setRequesterDateFormat(value: String): Self = this.set("requesterDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterDateFormat: Self = this.set("requesterDateFormat", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setToDate(value: String): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
    
    @scala.inline
    def setTransactionIds(value: String): Self = this.set("transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionIds: Self = this.set("transactionIds", js.undefined)
    
    @scala.inline
    def setUserFilter(value: String): Self = this.set("userFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserFilter: Self = this.set("userFilter", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
