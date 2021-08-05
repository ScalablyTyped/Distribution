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
  
  inline def apply(datafeed_id: String): MlPreviewDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDatafeed]
  }
  
  extension [Self <: MlPreviewDatafeed](x: Self) {
    
    inline def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
  }
}
