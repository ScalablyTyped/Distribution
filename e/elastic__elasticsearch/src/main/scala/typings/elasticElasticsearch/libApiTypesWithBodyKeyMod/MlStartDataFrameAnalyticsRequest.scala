package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlStartDataFrameAnalyticsRequest {
  
  inline def apply(id: Id): MlStartDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlStartDataFrameAnalyticsRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
