package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var exclude_generated: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetDataFrameAnalyticsRequest {
  
  inline def apply(): MlGetDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlGetDataFrameAnalyticsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setExclude_generated(value: Boolean): Self = StObject.set(x, "exclude_generated", value.asInstanceOf[js.Any])
    
    inline def setExclude_generatedUndefined: Self = StObject.set(x, "exclude_generated", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
