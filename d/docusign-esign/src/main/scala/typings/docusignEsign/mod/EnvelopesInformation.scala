package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopesInformation extends js.Object {
  
  /**
    * A token returned by an earlier API call that you can use with a new call to resume a search query at the point where it left off.  This token system enhances the performance of the API.
    */
  var continuationToken: js.UndefOr[String] = js.native
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * Array of envelope statuses and transaction IDs in the result set.
    */
  var envelopeTransactionStatuses: js.UndefOr[js.Array[EnvelopeTransactionStatus]] = js.native
  
  /**
    * Set of envelope information
    */
  var envelopes: js.UndefOr[js.Array[Envelope]] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * The last time that a query was performed.
    */
  var lastQueriedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
}
object EnvelopesInformation {
  
  @scala.inline
  def apply(): EnvelopesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopesInformation]
  }
  
  @scala.inline
  implicit class EnvelopesInformationOps[Self <: EnvelopesInformation] (val x: Self) extends AnyVal {
    
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
    def setContinuationToken(value: String): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("continuationToken", js.undefined)
    
    @scala.inline
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setEnvelopeTransactionStatusesVarargs(value: EnvelopeTransactionStatus*): Self = this.set("envelopeTransactionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeTransactionStatuses(value: js.Array[EnvelopeTransactionStatus]): Self = this.set("envelopeTransactionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeTransactionStatuses: Self = this.set("envelopeTransactionStatuses", js.undefined)
    
    @scala.inline
    def setEnvelopesVarargs(value: Envelope*): Self = this.set("envelopes", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopes(value: js.Array[Envelope]): Self = this.set("envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopes: Self = this.set("envelopes", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setLastQueriedDateTime(value: String): Self = this.set("lastQueriedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastQueriedDateTime: Self = this.set("lastQueriedDateTime", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = this.set("resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetSize: Self = this.set("resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = this.set("totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSetSize: Self = this.set("totalSetSize", js.undefined)
  }
}
