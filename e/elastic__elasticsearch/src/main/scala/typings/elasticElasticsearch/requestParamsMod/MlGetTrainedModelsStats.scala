package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetTrainedModelsStats extends Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var model_id: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object MlGetTrainedModelsStats {
  
  @scala.inline
  def apply(): MlGetTrainedModelsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModelsStats]
  }
  
  @scala.inline
  implicit class MlGetTrainedModelsStatsMutableBuilder[Self <: MlGetTrainedModelsStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
