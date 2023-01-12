package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BccEmailArchiveHistoryList extends StObject {
  
  /**
    * A list of changes to the BCC email archive configuration.
    */
  var bccEmailArchiveHistory: js.UndefOr[
    js.Array[
      /* Contains details about the history of the BCC email archive configuration. */ BccEmailArchiveHistory
    ]
  ] = js.undefined
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.undefined
  
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
object BccEmailArchiveHistoryList {
  
  inline def apply(): BccEmailArchiveHistoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailArchiveHistoryList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BccEmailArchiveHistoryList] (val x: Self) extends AnyVal {
    
    inline def setBccEmailArchiveHistory(
      value: js.Array[
          /* Contains details about the history of the BCC email archive configuration. */ BccEmailArchiveHistory
        ]
    ): Self = StObject.set(x, "bccEmailArchiveHistory", value.asInstanceOf[js.Any])
    
    inline def setBccEmailArchiveHistoryUndefined: Self = StObject.set(x, "bccEmailArchiveHistory", js.undefined)
    
    inline def setBccEmailArchiveHistoryVarargs(
      value: (/* Contains details about the history of the BCC email archive configuration. */ BccEmailArchiveHistory)*
    ): Self = StObject.set(x, "bccEmailArchiveHistory", js.Array(value*))
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    inline def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    inline def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    inline def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
