package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDataFrameAnalyticsStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object MlGetDataFrameAnalyticsStatsRequest {
  
  inline def apply(): MlGetDataFrameAnalyticsStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDataFrameAnalyticsStatsRequest]
  }
  
  extension [Self <: MlGetDataFrameAnalyticsStatsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
