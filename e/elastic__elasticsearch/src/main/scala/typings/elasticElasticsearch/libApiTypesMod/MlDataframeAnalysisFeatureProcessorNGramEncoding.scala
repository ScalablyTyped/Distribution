package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessorNGramEncoding extends StObject {
  
  var custom: js.UndefOr[Boolean] = js.undefined
  
  var feature_prefix: js.UndefOr[String] = js.undefined
  
  var field: Field
  
  var length: js.UndefOr[integer] = js.undefined
  
  var n_grams: js.Array[integer]
  
  var start: js.UndefOr[integer] = js.undefined
}
object MlDataframeAnalysisFeatureProcessorNGramEncoding {
  
  inline def apply(field: Field, n_grams: js.Array[integer]): MlDataframeAnalysisFeatureProcessorNGramEncoding = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], n_grams = n_grams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessorNGramEncoding]
  }
  
  extension [Self <: MlDataframeAnalysisFeatureProcessorNGramEncoding](x: Self) {
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setFeature_prefix(value: String): Self = StObject.set(x, "feature_prefix", value.asInstanceOf[js.Any])
    
    inline def setFeature_prefixUndefined: Self = StObject.set(x, "feature_prefix", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setN_grams(value: js.Array[integer]): Self = StObject.set(x, "n_grams", value.asInstanceOf[js.Any])
    
    inline def setN_gramsVarargs(value: integer*): Self = StObject.set(x, "n_grams", js.Array(value*))
    
    inline def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
