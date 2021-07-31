package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrectedQuery extends StObject {
  
  var correctedQuery: js.UndefOr[String] = js.undefined
  
  var htmlCorrectedQuery: js.UndefOr[String] = js.undefined
}
object CorrectedQuery {
  
  @scala.inline
  def apply(): CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrectedQuery]
  }
  
  @scala.inline
  implicit class CorrectedQueryMutableBuilder[Self <: CorrectedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrectedQuery(value: String): Self = StObject.set(x, "correctedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectedQueryUndefined: Self = StObject.set(x, "correctedQuery", js.undefined)
    
    @scala.inline
    def setHtmlCorrectedQuery(value: String): Self = StObject.set(x, "htmlCorrectedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlCorrectedQueryUndefined: Self = StObject.set(x, "htmlCorrectedQuery", js.undefined)
  }
}
