package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteTrainedModelAliasRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var model_alias: Name
  
  var model_id: Id
}
object MlDeleteTrainedModelAliasRequest {
  
  inline def apply(model_alias: Name, model_id: Id): MlDeleteTrainedModelAliasRequest = {
    val __obj = js.Dynamic.literal(model_alias = model_alias.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteTrainedModelAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDeleteTrainedModelAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setModel_alias(value: Name): Self = StObject.set(x, "model_alias", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
