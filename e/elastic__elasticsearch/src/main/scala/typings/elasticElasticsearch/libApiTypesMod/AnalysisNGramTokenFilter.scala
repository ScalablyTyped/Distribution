package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.ngram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisNGramTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var max_gram: js.UndefOr[integer] = js.undefined
  
  var min_gram: js.UndefOr[integer] = js.undefined
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var `type`: ngram
}
object AnalysisNGramTokenFilter {
  
  inline def apply(): AnalysisNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[AnalysisNGramTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisNGramTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setMax_gram(value: integer): Self = StObject.set(x, "max_gram", value.asInstanceOf[js.Any])
    
    inline def setMax_gramUndefined: Self = StObject.set(x, "max_gram", js.undefined)
    
    inline def setMin_gram(value: integer): Self = StObject.set(x, "min_gram", value.asInstanceOf[js.Any])
    
    inline def setMin_gramUndefined: Self = StObject.set(x, "min_gram", js.undefined)
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setType(value: ngram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
