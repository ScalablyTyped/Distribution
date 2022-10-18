package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.asciifolding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisAsciiFoldingTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var `type`: asciifolding
}
object AnalysisAsciiFoldingTokenFilter {
  
  inline def apply(): AnalysisAsciiFoldingTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asciifolding")
    __obj.asInstanceOf[AnalysisAsciiFoldingTokenFilter]
  }
  
  extension [Self <: AnalysisAsciiFoldingTokenFilter](x: Self) {
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setType(value: asciifolding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
