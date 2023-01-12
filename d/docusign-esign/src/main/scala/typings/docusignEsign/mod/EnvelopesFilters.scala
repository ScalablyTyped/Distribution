package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopesFilters extends StObject {
  
  var acStatus: js.UndefOr[String] = js.undefined
  
  var continuationToken: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[String] = js.undefined
  
  var customField: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var envelopeIds: js.UndefOr[String] = js.undefined
  
  var exclude: js.UndefOr[String] = js.undefined
  
  var folderIds: js.UndefOr[String] = js.undefined
  
  var folderTypes: js.UndefOr[String] = js.undefined
  
  var fromDate: js.UndefOr[String] = js.undefined
  
  var fromToStatus: js.UndefOr[String] = js.undefined
  
  var include: js.UndefOr[String] = js.undefined
  
  var includePurgeInformation: js.UndefOr[String] = js.undefined
  
  var intersectingFolderIds: js.UndefOr[String] = js.undefined
  
  var lastQueriedDate: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[String] = js.undefined
  
  var orderBy: js.UndefOr[String] = js.undefined
  
  var powerformids: js.UndefOr[String] = js.undefined
  
  var queryBudget: js.UndefOr[String] = js.undefined
  
  var requesterDateFormat: js.UndefOr[String] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var startPosition: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var toDate: js.UndefOr[String] = js.undefined
  
  var transactionIds: js.UndefOr[String] = js.undefined
  
  var userFilter: js.UndefOr[String] = js.undefined
  
  var userId: js.UndefOr[String] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
}
object EnvelopesFilters {
  
  inline def apply(): EnvelopesFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopesFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopesFilters] (val x: Self) extends AnyVal {
    
    inline def setAcStatus(value: String): Self = StObject.set(x, "acStatus", value.asInstanceOf[js.Any])
    
    inline def setAcStatusUndefined: Self = StObject.set(x, "acStatus", js.undefined)
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldUndefined: Self = StObject.set(x, "customField", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnvelopeIds(value: String): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setFolderIds(value: String): Self = StObject.set(x, "folderIds", value.asInstanceOf[js.Any])
    
    inline def setFolderIdsUndefined: Self = StObject.set(x, "folderIds", js.undefined)
    
    inline def setFolderTypes(value: String): Self = StObject.set(x, "folderTypes", value.asInstanceOf[js.Any])
    
    inline def setFolderTypesUndefined: Self = StObject.set(x, "folderTypes", js.undefined)
    
    inline def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setFromToStatus(value: String): Self = StObject.set(x, "fromToStatus", value.asInstanceOf[js.Any])
    
    inline def setFromToStatusUndefined: Self = StObject.set(x, "fromToStatus", js.undefined)
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludePurgeInformation(value: String): Self = StObject.set(x, "includePurgeInformation", value.asInstanceOf[js.Any])
    
    inline def setIncludePurgeInformationUndefined: Self = StObject.set(x, "includePurgeInformation", js.undefined)
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIntersectingFolderIds(value: String): Self = StObject.set(x, "intersectingFolderIds", value.asInstanceOf[js.Any])
    
    inline def setIntersectingFolderIdsUndefined: Self = StObject.set(x, "intersectingFolderIds", js.undefined)
    
    inline def setLastQueriedDate(value: String): Self = StObject.set(x, "lastQueriedDate", value.asInstanceOf[js.Any])
    
    inline def setLastQueriedDateUndefined: Self = StObject.set(x, "lastQueriedDate", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPowerformids(value: String): Self = StObject.set(x, "powerformids", value.asInstanceOf[js.Any])
    
    inline def setPowerformidsUndefined: Self = StObject.set(x, "powerformids", js.undefined)
    
    inline def setQueryBudget(value: String): Self = StObject.set(x, "queryBudget", value.asInstanceOf[js.Any])
    
    inline def setQueryBudgetUndefined: Self = StObject.set(x, "queryBudget", js.undefined)
    
    inline def setRequesterDateFormat(value: String): Self = StObject.set(x, "requesterDateFormat", value.asInstanceOf[js.Any])
    
    inline def setRequesterDateFormatUndefined: Self = StObject.set(x, "requesterDateFormat", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    inline def setTransactionIds(value: String): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setUserFilter(value: String): Self = StObject.set(x, "userFilter", value.asInstanceOf[js.Any])
    
    inline def setUserFilterUndefined: Self = StObject.set(x, "userFilter", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
