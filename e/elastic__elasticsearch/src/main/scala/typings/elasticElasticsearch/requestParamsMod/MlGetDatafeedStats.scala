package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDatafeedStats
  extends StObject
     with Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var datafeed_id: js.UndefOr[String] = js.undefined
}
object MlGetDatafeedStats {
  
  inline def apply(): MlGetDatafeedStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDatafeedStats]
  }
  
  extension [Self <: MlGetDatafeedStats](x: Self) {
    
    inline def setAllow_no_datafeeds(value: Boolean): Self = StObject.set(x, "allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_datafeedsUndefined: Self = StObject.set(x, "allow_no_datafeeds", js.undefined)
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
  }
}
