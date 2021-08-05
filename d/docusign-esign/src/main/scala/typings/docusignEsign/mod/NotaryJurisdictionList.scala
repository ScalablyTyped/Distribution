package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJurisdictionList extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  var notaryJurisdictions: js.UndefOr[js.Array[NotaryJurisdiction]] = js.undefined
  
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
object NotaryJurisdictionList {
  
  inline def apply(): NotaryJurisdictionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJurisdictionList]
  }
  
  extension [Self <: NotaryJurisdictionList](x: Self) {
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    inline def setNotaryJurisdictions(value: js.Array[NotaryJurisdiction]): Self = StObject.set(x, "notaryJurisdictions", value.asInstanceOf[js.Any])
    
    inline def setNotaryJurisdictionsUndefined: Self = StObject.set(x, "notaryJurisdictions", js.undefined)
    
    inline def setNotaryJurisdictionsVarargs(value: NotaryJurisdiction*): Self = StObject.set(x, "notaryJurisdictions", js.Array(value :_*))
    
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
