package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkRecipientsSummaryResponse extends StObject {
  
  /**
    * A complex type containing information about the bulk recipients in the response.
    */
  var bulkRecipients: js.UndefOr[js.Array[BulkRecipient]] = js.undefined
  
  /**
    * The number of items returned in this response.
    */
  var bulkRecipientsCount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var bulkRecipientsUri: js.UndefOr[String] = js.undefined
  
  /**
    * Array or errors.
    */
  var errorDetails: js.UndefOr[
    js.Array[
      /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ]
  ] = js.undefined
}
object BulkRecipientsSummaryResponse {
  
  inline def apply(): BulkRecipientsSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsSummaryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkRecipientsSummaryResponse] (val x: Self) extends AnyVal {
    
    inline def setBulkRecipients(value: js.Array[BulkRecipient]): Self = StObject.set(x, "bulkRecipients", value.asInstanceOf[js.Any])
    
    inline def setBulkRecipientsCount(value: String): Self = StObject.set(x, "bulkRecipientsCount", value.asInstanceOf[js.Any])
    
    inline def setBulkRecipientsCountUndefined: Self = StObject.set(x, "bulkRecipientsCount", js.undefined)
    
    inline def setBulkRecipientsUndefined: Self = StObject.set(x, "bulkRecipients", js.undefined)
    
    inline def setBulkRecipientsUri(value: String): Self = StObject.set(x, "bulkRecipientsUri", value.asInstanceOf[js.Any])
    
    inline def setBulkRecipientsUriUndefined: Self = StObject.set(x, "bulkRecipientsUri", js.undefined)
    
    inline def setBulkRecipientsVarargs(value: BulkRecipient*): Self = StObject.set(x, "bulkRecipients", js.Array(value*))
    
    inline def setErrorDetails(
      value: js.Array[
          /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
        ]
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(
      value: (/* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails)*
    ): Self = StObject.set(x, "errorDetails", js.Array(value*))
  }
}
