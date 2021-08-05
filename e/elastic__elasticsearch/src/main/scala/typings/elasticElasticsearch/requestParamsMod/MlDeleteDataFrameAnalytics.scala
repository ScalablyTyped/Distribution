package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteDataFrameAnalytics
  extends StObject
     with Generic {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlDeleteDataFrameAnalytics {
  
  inline def apply(id: String): MlDeleteDataFrameAnalytics = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteDataFrameAnalytics]
  }
  
  extension [Self <: MlDeleteDataFrameAnalytics](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
