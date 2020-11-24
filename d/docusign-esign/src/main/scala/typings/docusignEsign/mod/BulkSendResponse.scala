package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendResponse extends js.Object {
  
  /**
    * A batch identifier that you can use to get the status of the batch.
    */
  var batchId: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the envelope or template that was sent.
    */
  var envelopeOrTemplateId: js.UndefOr[String] = js.native
  
  /**
    * A human-readable object that describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of errors that occurred. This information is intended to be parsed by machine.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
}
object BulkSendResponse {
  
  @scala.inline
  def apply(): BulkSendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendResponse]
  }
  
  @scala.inline
  implicit class BulkSendResponseOps[Self <: BulkSendResponse] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: String): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setEnvelopeOrTemplateId(value: String): Self = this.set("envelopeOrTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeOrTemplateId: Self = this.set("envelopeOrTemplateId", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: String*): Self = this.set("errorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(value: js.Array[String]): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
