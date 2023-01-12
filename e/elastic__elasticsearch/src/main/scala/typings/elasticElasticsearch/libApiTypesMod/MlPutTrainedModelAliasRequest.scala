package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelAliasRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var model_alias: Name
  
  var model_id: Id
  
  var reassign: js.UndefOr[Boolean] = js.undefined
}
object MlPutTrainedModelAliasRequest {
  
  inline def apply(model_alias: Name, model_id: Id): MlPutTrainedModelAliasRequest = {
    val __obj = js.Dynamic.literal(model_alias = model_alias.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setModel_alias(value: Name): Self = StObject.set(x, "model_alias", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setReassign(value: Boolean): Self = StObject.set(x, "reassign", value.asInstanceOf[js.Any])
    
    inline def setReassignUndefined: Self = StObject.set(x, "reassign", js.undefined)
  }
}
