package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.html_strip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisHtmlStripCharFilter
  extends StObject
     with AnalysisCharFilterBase
     with AnalysisCharFilterDefinition {
  
  var `type`: html_strip
}
object AnalysisHtmlStripCharFilter {
  
  inline def apply(): AnalysisHtmlStripCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("html_strip")
    __obj.asInstanceOf[AnalysisHtmlStripCharFilter]
  }
  
  extension [Self <: AnalysisHtmlStripCharFilter](x: Self) {
    
    inline def setType(value: html_strip): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
