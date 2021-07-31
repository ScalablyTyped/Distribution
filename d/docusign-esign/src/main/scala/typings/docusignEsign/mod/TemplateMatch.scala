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
  
  @scala.inline
  def apply(): TemplateMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMatch]
  }
  
  @scala.inline
  implicit class TemplateMatchMutableBuilder[Self <: TemplateMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentEndPage(value: String): Self = StObject.set(x, "documentEndPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentEndPageUndefined: Self = StObject.set(x, "documentEndPage", js.undefined)
    
    @scala.inline
    def setDocumentStartPage(value: String): Self = StObject.set(x, "documentStartPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStartPageUndefined: Self = StObject.set(x, "documentStartPage", js.undefined)
    
    @scala.inline
    def setMatchPercentage(value: String): Self = StObject.set(x, "matchPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPercentageUndefined: Self = StObject.set(x, "matchPercentage", js.undefined)
  }
}
