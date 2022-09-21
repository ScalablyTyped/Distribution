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
  
  inline def apply(): BulkRecipientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsRequest]
  }
  
  extension [Self <: BulkRecipientsRequest](x: Self) {
    
    inline def setBulkRecipients(value: js.Array[BulkRecipient]): Self = StObject.set(x, "bulkRecipients", value.asInstanceOf[js.Any])
    
    inline def setBulkRecipientsUndefined: Self = StObject.set(x, "bulkRecipients", js.undefined)
    
    inline def setBulkRecipientsVarargs(value: BulkRecipient*): Self = StObject.set(x, "bulkRecipients", js.Array(value*))
  }
}
