package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Merges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelVocabularyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Merges] = js.undefined
  
  var model_id: Id
}
object MlPutTrainedModelVocabularyRequest {
  
  inline def apply(model_id: Id): MlPutTrainedModelVocabularyRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelVocabularyRequest]
  }
  
  extension [Self <: MlPutTrainedModelVocabularyRequest](x: Self) {
    
    inline def setBody(value: Merges): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
