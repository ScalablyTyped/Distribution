package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopesInformation extends StObject {
  
  /**
    * A token returned by an earlier API call that you can use with a new call to resume a search query at the point where it left off.  This token system enhances the performance of the API.
    */
  var continuationToken: js.UndefOr[String] = js.undefined
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Array of envelope statuses and transaction IDs in the result set.
    */
  var envelopeTransactionStatuses: js.UndefOr[js.Array[EnvelopeTransactionStatus]] = js.undefined
  
  /**
    * Set of envelope information
    */
  var envelopes: js.UndefOr[js.Array[Envelope]] = js.undefined
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.undefined
  
  /**
    * The last time that a query was performed.
    */
  var lastQueriedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.undefined
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.undefined
}
object EnvelopesInformation {
  
  inline def apply(): EnvelopesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopesInformation]
  }
  
  extension [Self <: EnvelopesInformation](x: Self) {
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setEnvelopeTransactionStatuses(value: js.Array[EnvelopeTransactionStatus]): Self = StObject.set(x, "envelopeTransactionStatuses", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeTransactionStatusesUndefined: Self = StObject.set(x, "envelopeTransactionStatuses", js.undefined)
    
    inline def setEnvelopeTransactionStatusesVarargs(value: EnvelopeTransactionStatus*): Self = StObject.set(x, "envelopeTransactionStatuses", js.Array(value :_*))
    
    inline def setEnvelopes(value: js.Array[Envelope]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    inline def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    inline def setEnvelopesVarargs(value: Envelope*): Self = StObject.set(x, "envelopes", js.Array(value :_*))
    
    inline def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    inline def setLastQueriedDateTime(value: String): Self = StObject.set(x, "lastQueriedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastQueriedDateTimeUndefined: Self = StObject.set(x, "lastQueriedDateTime", js.undefined)
    
    inline def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
