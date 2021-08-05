package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedSearchTime extends StObject {
  
  var formattedSearchTime: js.UndefOr[String] = js.undefined
  
  var formattedTotalResults: js.UndefOr[String] = js.undefined
  
  var searchTime: js.UndefOr[Double] = js.undefined
  
  var totalResults: js.UndefOr[String] = js.undefined
}
object FormattedSearchTime {
  
  inline def apply(): FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattedSearchTime]
  }
  
  extension [Self <: FormattedSearchTime](x: Self) {
    
    inline def setFormattedSearchTime(value: String): Self = StObject.set(x, "formattedSearchTime", value.asInstanceOf[js.Any])
    
    inline def setFormattedSearchTimeUndefined: Self = StObject.set(x, "formattedSearchTime", js.undefined)
    
    inline def setFormattedTotalResults(value: String): Self = StObject.set(x, "formattedTotalResults", value.asInstanceOf[js.Any])
    
    inline def setFormattedTotalResultsUndefined: Self = StObject.set(x, "formattedTotalResults", js.undefined)
    
    inline def setSearchTime(value: Double): Self = StObject.set(x, "searchTime", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeUndefined: Self = StObject.set(x, "searchTime", js.undefined)
    
    inline def setTotalResults(value: String): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
