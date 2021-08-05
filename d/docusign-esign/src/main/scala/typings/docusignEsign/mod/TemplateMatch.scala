package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateMatch extends StObject {
  
  var documentEndPage: js.UndefOr[String] = js.undefined
  
  var documentStartPage: js.UndefOr[String] = js.undefined
  
  var matchPercentage: js.UndefOr[String] = js.undefined
}
object TemplateMatch {
  
  inline def apply(): TemplateMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMatch]
  }
  
  extension [Self <: TemplateMatch](x: Self) {
    
    inline def setDocumentEndPage(value: String): Self = StObject.set(x, "documentEndPage", value.asInstanceOf[js.Any])
    
    inline def setDocumentEndPageUndefined: Self = StObject.set(x, "documentEndPage", js.undefined)
    
    inline def setDocumentStartPage(value: String): Self = StObject.set(x, "documentStartPage", value.asInstanceOf[js.Any])
    
    inline def setDocumentStartPageUndefined: Self = StObject.set(x, "documentStartPage", js.undefined)
    
    inline def setMatchPercentage(value: String): Self = StObject.set(x, "matchPercentage", value.asInstanceOf[js.Any])
    
    inline def setMatchPercentageUndefined: Self = StObject.set(x, "matchPercentage", js.undefined)
  }
}
