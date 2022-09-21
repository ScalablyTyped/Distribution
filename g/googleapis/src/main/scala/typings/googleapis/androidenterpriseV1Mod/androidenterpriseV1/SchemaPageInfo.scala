package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageInfo extends StObject {
  
  /**
    * Maximum number of results returned in one page. ! The number of results included in the API response.
    */
  var resultPerPage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Index of the first result returned in the current page.
    */
  var startIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total number of results available on the backend ! The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPageInfo {
  
  inline def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  extension [Self <: SchemaPageInfo](x: Self) {
    
    inline def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
    
    inline def setResultPerPageNull: Self = StObject.set(x, "resultPerPage", null)
    
    inline def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsNull: Self = StObject.set(x, "totalResults", null)
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
