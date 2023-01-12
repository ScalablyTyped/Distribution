package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelPreprocessor extends StObject {
  
  var frequency_encoding: js.UndefOr[MlPutTrainedModelFrequencyEncodingPreprocessor] = js.undefined
  
  var one_hot_encoding: js.UndefOr[MlPutTrainedModelOneHotEncodingPreprocessor] = js.undefined
  
  var target_mean_encoding: js.UndefOr[MlPutTrainedModelTargetMeanEncodingPreprocessor] = js.undefined
}
object MlPutTrainedModelPreprocessor {
  
  inline def apply(): MlPutTrainedModelPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPutTrainedModelPreprocessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelPreprocessor] (val x: Self) extends AnyVal {
    
    inline def setFrequency_encoding(value: MlPutTrainedModelFrequencyEncodingPreprocessor): Self = StObject.set(x, "frequency_encoding", value.asInstanceOf[js.Any])
    
    inline def setFrequency_encodingUndefined: Self = StObject.set(x, "frequency_encoding", js.undefined)
    
    inline def setOne_hot_encoding(value: MlPutTrainedModelOneHotEncodingPreprocessor): Self = StObject.set(x, "one_hot_encoding", value.asInstanceOf[js.Any])
    
    inline def setOne_hot_encodingUndefined: Self = StObject.set(x, "one_hot_encoding", js.undefined)
    
    inline def setTarget_mean_encoding(value: MlPutTrainedModelTargetMeanEncodingPreprocessor): Self = StObject.set(x, "target_mean_encoding", value.asInstanceOf[js.Any])
    
    inline def setTarget_mean_encodingUndefined: Self = StObject.set(x, "target_mean_encoding", js.undefined)
  }
}
