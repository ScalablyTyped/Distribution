package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPutTrainedModel[T] extends Generic {
  
  var body: T = js.native
  
  var model_id: String = js.native
}
object MlPutTrainedModel {
  
  @scala.inline
  def apply[T](body: T, model_id: String): MlPutTrainedModel[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModel[T]]
  }
  
  @scala.inline
  implicit class MlPutTrainedModelMutableBuilder[Self <: MlPutTrainedModel[_], T] (val x: Self with MlPutTrainedModel[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
