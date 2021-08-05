package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModel[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var model_id: String
}
object MlPutTrainedModel {
  
  inline def apply[T](body: T, model_id: String): MlPutTrainedModel[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModel[T]]
  }
  
  extension [Self <: MlPutTrainedModel[?], T](x: Self & MlPutTrainedModel[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
