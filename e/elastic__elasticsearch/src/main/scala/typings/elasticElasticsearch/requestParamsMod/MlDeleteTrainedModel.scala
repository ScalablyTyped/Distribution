package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlDeleteTrainedModel extends Generic {
  
  var model_id: String = js.native
}
object MlDeleteTrainedModel {
  
  @scala.inline
  def apply(model_id: String): MlDeleteTrainedModel = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteTrainedModel]
  }
  
  @scala.inline
  implicit class MlDeleteTrainedModelMutableBuilder[Self <: MlDeleteTrainedModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
