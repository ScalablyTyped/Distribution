package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.shingle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisShingleTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var filler_token: js.UndefOr[String] = js.undefined
  
  var max_shingle_size: js.UndefOr[integer | String] = js.undefined
  
  var min_shingle_size: js.UndefOr[integer | String] = js.undefined
  
  var output_unigrams: js.UndefOr[Boolean] = js.undefined
  
  var output_unigrams_if_no_shingles: js.UndefOr[Boolean] = js.undefined
  
  var token_separator: js.UndefOr[String] = js.undefined
  
  var `type`: shingle
}
object AnalysisShingleTokenFilter {
  
  inline def apply(): AnalysisShingleTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shingle")
    __obj.asInstanceOf[AnalysisShingleTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisShingleTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setFiller_token(value: String): Self = StObject.set(x, "filler_token", value.asInstanceOf[js.Any])
    
    inline def setFiller_tokenUndefined: Self = StObject.set(x, "filler_token", js.undefined)
    
    inline def setMax_shingle_size(value: integer | String): Self = StObject.set(x, "max_shingle_size", value.asInstanceOf[js.Any])
    
    inline def setMax_shingle_sizeUndefined: Self = StObject.set(x, "max_shingle_size", js.undefined)
    
    inline def setMin_shingle_size(value: integer | String): Self = StObject.set(x, "min_shingle_size", value.asInstanceOf[js.Any])
    
    inline def setMin_shingle_sizeUndefined: Self = StObject.set(x, "min_shingle_size", js.undefined)
    
    inline def setOutput_unigrams(value: Boolean): Self = StObject.set(x, "output_unigrams", value.asInstanceOf[js.Any])
    
    inline def setOutput_unigramsUndefined: Self = StObject.set(x, "output_unigrams", js.undefined)
    
    inline def setOutput_unigrams_if_no_shingles(value: Boolean): Self = StObject.set(x, "output_unigrams_if_no_shingles", value.asInstanceOf[js.Any])
    
    inline def setOutput_unigrams_if_no_shinglesUndefined: Self = StObject.set(x, "output_unigrams_if_no_shingles", js.undefined)
    
    inline def setToken_separator(value: String): Self = StObject.set(x, "token_separator", value.asInstanceOf[js.Any])
    
    inline def setToken_separatorUndefined: Self = StObject.set(x, "token_separator", js.undefined)
    
    inline def setType(value: shingle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
