package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelVocabularyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var merges: js.UndefOr[js.Array[String]] = js.undefined
  
  var model_id: Id
  
  var vocabulary: js.Array[String]
}
object MlPutTrainedModelVocabularyRequest {
  
  inline def apply(model_id: Id, vocabulary: js.Array[String]): MlPutTrainedModelVocabularyRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any], vocabulary = vocabulary.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelVocabularyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelVocabularyRequest] (val x: Self) extends AnyVal {
    
    inline def setMerges(value: js.Array[String]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    inline def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    inline def setMergesVarargs(value: String*): Self = StObject.set(x, "merges", js.Array(value*))
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setVocabulary(value: js.Array[String]): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
    
    inline def setVocabularyVarargs(value: String*): Self = StObject.set(x, "vocabulary", js.Array(value*))
  }
}
