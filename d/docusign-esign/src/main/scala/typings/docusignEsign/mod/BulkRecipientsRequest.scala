package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkRecipientsRequest extends StObject {
  
  /**
    * A complex type containing information about the bulk recipients in the request.
    */
  var bulkRecipients: js.UndefOr[js.Array[BulkRecipient]] = js.undefined
}
object BulkRecipientsRequest {
  
  @scala.inline
  def apply(): BulkRecipientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsRequest]
  }
  
  @scala.inline
  implicit class BulkRecipientsRequestMutableBuilder[Self <: BulkRecipientsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkRecipients(value: js.Array[BulkRecipient]): Self = StObject.set(x, "bulkRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkRecipientsUndefined: Self = StObject.set(x, "bulkRecipients", js.undefined)
    
    @scala.inline
    def setBulkRecipientsVarargs(value: BulkRecipient*): Self = StObject.set(x, "bulkRecipients", js.Array(value :_*))
  }
}
