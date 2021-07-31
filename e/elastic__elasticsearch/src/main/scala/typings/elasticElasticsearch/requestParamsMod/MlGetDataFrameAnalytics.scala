package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDataFrameAnalytics
  extends StObject
     with Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object MlGetDataFrameAnalytics {
  
  @scala.inline
  def apply(): MlGetDataFrameAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDataFrameAnalytics]
  }
  
  @scala.inline
  implicit class MlGetDataFrameAnalyticsMutableBuilder[Self <: MlGetDataFrameAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
