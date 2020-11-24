package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRecipientsSummaryResponse extends js.Object {
  
  /**
    * A complex type containing information about the bulk recipients in the response.
    */
  var bulkRecipients: js.UndefOr[js.Array[BulkRecipient]] = js.native
  
  /**
    * The number of items returned in this response.
    */
  var bulkRecipientsCount: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var bulkRecipientsUri: js.UndefOr[String] = js.native
  
  /**
    * Array or errors.
    */
  var errorDetails: js.UndefOr[
    js.Array[
      /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ]
  ] = js.native
}
object BulkRecipientsSummaryResponse {
  
  @scala.inline
  def apply(): BulkRecipientsSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsSummaryResponse]
  }
  
  @scala.inline
  implicit class BulkRecipientsSummaryResponseOps[Self <: BulkRecipientsSummaryResponse] (val x: Self) extends AnyVal {
    
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
    def setBulkRecipientsVarargs(value: BulkRecipient*): Self = this.set("bulkRecipients", js.Array(value :_*))
    
    @scala.inline
    def setBulkRecipients(value: js.Array[BulkRecipient]): Self = this.set("bulkRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkRecipients: Self = this.set("bulkRecipients", js.undefined)
    
    @scala.inline
    def setBulkRecipientsCount(value: String): Self = this.set("bulkRecipientsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkRecipientsCount: Self = this.set("bulkRecipientsCount", js.undefined)
    
    @scala.inline
    def setBulkRecipientsUri(value: String): Self = this.set("bulkRecipientsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkRecipientsUri: Self = this.set("bulkRecipientsUri", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(
      value: (/* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails)*
    ): Self = this.set("errorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: js.Array[
          /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
        ]
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
  }
}
