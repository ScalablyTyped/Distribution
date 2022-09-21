package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerFormSendersResponse extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  /**
    * An array of `userInfo` objects containing information about users who have sent PowerForms.
    */
  var powerFormSenders: js.UndefOr[js.Array[UserInfo]] = js.undefined
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[Double] = js.undefined
}
object PowerFormSendersResponse {
  
  inline def apply(): PowerFormSendersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormSendersResponse]
  }
  
  extension [Self <: PowerFormSendersResponse](x: Self) {
    
    inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    inline def setPowerFormSenders(value: js.Array[UserInfo]): Self = StObject.set(x, "powerFormSenders", value.asInstanceOf[js.Any])
    
    inline def setPowerFormSendersUndefined: Self = StObject.set(x, "powerFormSenders", js.undefined)
    
    inline def setPowerFormSendersVarargs(value: UserInfo*): Self = StObject.set(x, "powerFormSenders", js.Array(value*))
    
    inline def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    inline def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    inline def setResultSetSize(value: Double): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setTotalSetSize(value: Double): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
