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
  
  @scala.inline
  def apply(id: String): MlDeleteDataFrameAnalytics = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteDataFrameAnalytics]
  }
  
  @scala.inline
  implicit class MlDeleteDataFrameAnalyticsMutableBuilder[Self <: MlDeleteDataFrameAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
