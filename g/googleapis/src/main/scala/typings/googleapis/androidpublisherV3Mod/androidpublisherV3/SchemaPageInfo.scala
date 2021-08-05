package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageInfo extends StObject {
  
  var resultPerPage: js.UndefOr[Double] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var totalResults: js.UndefOr[Double] = js.undefined
}
object SchemaPageInfo {
  
  inline def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  extension [Self <: SchemaPageInfo](x: Self) {
    
    inline def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
    
    inline def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
