package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDatafeed
  extends StObject
     with Generic {
  
  var datafeed_id: String
}
object MlPreviewDatafeed {
  
  @scala.inline
  def apply(datafeed_id: String): MlPreviewDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDatafeed]
  }
  
  @scala.inline
  implicit class MlPreviewDatafeedMutableBuilder[Self <: MlPreviewDatafeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
  }
}
