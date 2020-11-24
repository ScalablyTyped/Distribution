package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEnvelopeStatus extends js.Object {
  
  /**
    * Identifier used to query the status of an individual bulk recipient batch.
    */
  var batchId: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the batch being queried.
    */
  var batchSize: js.UndefOr[String] = js.native
  
  /**
    * A list of bulk envelope objects.
    */
  var bulkEnvelopes: js.UndefOr[js.Array[BulkEnvelope]] = js.native
  
  /**
    * URI at which you can retrieve the batch envelopes.
    */
  var bulkEnvelopesBatchUri: js.UndefOr[String] = js.native
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * The number of entries with a status of `failed`.
    */
  var failed: js.UndefOr[String] = js.native
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of entries with a status of `queued`.
    */
  var queued: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The number of entries with a status of `sent`.
    */
  var sent: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The date on which the bulk envelope was created.
    */
  var submittedDate: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
}
object BulkEnvelopeStatus {
  
  @scala.inline
  def apply(): BulkEnvelopeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEnvelopeStatus]
  }
  
  @scala.inline
  implicit class BulkEnvelopeStatusOps[Self <: BulkEnvelopeStatus] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: String): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setBulkEnvelopesVarargs(value: BulkEnvelope*): Self = this.set("bulkEnvelopes", js.Array(value :_*))
    
    @scala.inline
    def setBulkEnvelopes(value: js.Array[BulkEnvelope]): Self = this.set("bulkEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkEnvelopes: Self = this.set("bulkEnvelopes", js.undefined)
    
    @scala.inline
    def setBulkEnvelopesBatchUri(value: String): Self = this.set("bulkEnvelopesBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkEnvelopesBatchUri: Self = this.set("bulkEnvelopesBatchUri", js.undefined)
    
    @scala.inline
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setFailed(value: String): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setNextUri(value: String): Self = this.set("nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextUri: Self = this.set("nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = this.set("previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousUri: Self = this.set("previousUri", js.undefined)
    
    @scala.inline
    def setQueued(value: String): Self = this.set("queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = this.set("resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetSize: Self = this.set("resultSetSize", js.undefined)
    
    @scala.inline
    def setSent(value: String): Self = this.set("sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSent: Self = this.set("sent", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setSubmittedDate(value: String): Self = this.set("submittedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedDate: Self = this.set("submittedDate", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = this.set("totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSetSize: Self = this.set("totalSetSize", js.undefined)
  }
}
