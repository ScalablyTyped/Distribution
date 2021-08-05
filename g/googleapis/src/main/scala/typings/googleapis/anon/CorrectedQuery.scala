package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrectedQuery extends StObject {
  
  var correctedQuery: js.UndefOr[String] = js.undefined
  
  var htmlCorrectedQuery: js.UndefOr[String] = js.undefined
}
object CorrectedQuery {
  
  inline def apply(): CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrectedQuery]
  }
  
  extension [Self <: CorrectedQuery](x: Self) {
    
    inline def setCorrectedQuery(value: String): Self = StObject.set(x, "correctedQuery", value.asInstanceOf[js.Any])
    
    inline def setCorrectedQueryUndefined: Self = StObject.set(x, "correctedQuery", js.undefined)
    
    inline def setHtmlCorrectedQuery(value: String): Self = StObject.set(x, "htmlCorrectedQuery", value.asInstanceOf[js.Any])
    
    inline def setHtmlCorrectedQueryUndefined: Self = StObject.set(x, "htmlCorrectedQuery", js.undefined)
  }
}
