package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessor extends StObject {
  
  var frequency_encoding: js.UndefOr[MlDataframeAnalysisFeatureProcessorFrequencyEncoding] = js.undefined
  
  var multi_encoding: js.UndefOr[MlDataframeAnalysisFeatureProcessorMultiEncoding] = js.undefined
  
  var n_gram_encoding: js.UndefOr[MlDataframeAnalysisFeatureProcessorNGramEncoding] = js.undefined
  
  var one_hot_encoding: js.UndefOr[MlDataframeAnalysisFeatureProcessorOneHotEncoding] = js.undefined
  
  var target_mean_encoding: js.UndefOr[MlDataframeAnalysisFeatureProcessorTargetMeanEncoding] = js.undefined
}
object MlDataframeAnalysisFeatureProcessor {
  
  inline def apply(): MlDataframeAnalysisFeatureProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessor]
  }
  
  extension [Self <: MlDataframeAnalysisFeatureProcessor](x: Self) {
    
    inline def setFrequency_encoding(value: MlDataframeAnalysisFeatureProcessorFrequencyEncoding): Self = StObject.set(x, "frequency_encoding", value.asInstanceOf[js.Any])
    
    inline def setFrequency_encodingUndefined: Self = StObject.set(x, "frequency_encoding", js.undefined)
    
    inline def setMulti_encoding(value: MlDataframeAnalysisFeatureProcessorMultiEncoding): Self = StObject.set(x, "multi_encoding", value.asInstanceOf[js.Any])
    
    inline def setMulti_encodingUndefined: Self = StObject.set(x, "multi_encoding", js.undefined)
    
    inline def setN_gram_encoding(value: MlDataframeAnalysisFeatureProcessorNGramEncoding): Self = StObject.set(x, "n_gram_encoding", value.asInstanceOf[js.Any])
    
    inline def setN_gram_encodingUndefined: Self = StObject.set(x, "n_gram_encoding", js.undefined)
    
    inline def setOne_hot_encoding(value: MlDataframeAnalysisFeatureProcessorOneHotEncoding): Self = StObject.set(x, "one_hot_encoding", value.asInstanceOf[js.Any])
    
    inline def setOne_hot_encodingUndefined: Self = StObject.set(x, "one_hot_encoding", js.undefined)
    
    inline def setTarget_mean_encoding(value: MlDataframeAnalysisFeatureProcessorTargetMeanEncoding): Self = StObject.set(x, "target_mean_encoding", value.asInstanceOf[js.Any])
    
    inline def setTarget_mean_encodingUndefined: Self = StObject.set(x, "target_mean_encoding", js.undefined)
  }
}
