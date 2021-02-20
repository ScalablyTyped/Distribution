package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingListSummary extends StObject {
  
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
  implicit class BulkSendingListSummaryMutableBuilder[Self <: BulkSendingListSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkSendListId(value: String): Self = StObject.set(x, "bulkSendListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkSendListIdUndefined: Self = StObject.set(x, "bulkSendListId", js.undefined)
    
    @scala.inline
    def setCreatedByUser(value: String): Self = StObject.set(x, "createdByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUserUndefined: Self = StObject.set(x, "createdByUser", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
