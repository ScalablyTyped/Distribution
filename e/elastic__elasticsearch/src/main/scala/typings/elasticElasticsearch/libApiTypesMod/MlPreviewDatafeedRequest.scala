package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var datafeed_config: js.UndefOr[MlDatafeedConfig] = js.undefined
  
  var datafeed_id: js.UndefOr[Id] = js.undefined
  
  var job_config: js.UndefOr[MlJobConfig] = js.undefined
}
object MlPreviewDatafeedRequest {
  
  inline def apply(): MlPreviewDatafeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPreviewDatafeedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPreviewDatafeedRequest] (val x: Self) extends AnyVal {
    
    inline def setDatafeed_config(value: MlDatafeedConfig): Self = StObject.set(x, "datafeed_config", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_configUndefined: Self = StObject.set(x, "datafeed_config", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
    
    inline def setJob_config(value: MlJobConfig): Self = StObject.set(x, "job_config", value.asInstanceOf[js.Any])
    
    inline def setJob_configUndefined: Self = StObject.set(x, "job_config", js.undefined)
  }
}
