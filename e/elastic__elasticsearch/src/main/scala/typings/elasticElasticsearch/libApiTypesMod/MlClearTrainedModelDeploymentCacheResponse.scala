package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlClearTrainedModelDeploymentCacheResponse extends StObject {
  
  var cleared: Boolean
}
object MlClearTrainedModelDeploymentCacheResponse {
  
  inline def apply(cleared: Boolean): MlClearTrainedModelDeploymentCacheResponse = {
    val __obj = js.Dynamic.literal(cleared = cleared.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlClearTrainedModelDeploymentCacheResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlClearTrainedModelDeploymentCacheResponse] (val x: Self) extends AnyVal {
    
    inline def setCleared(value: Boolean): Self = StObject.set(x, "cleared", value.asInstanceOf[js.Any])
  }
}
