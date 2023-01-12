package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDatafeedStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var datafeed_id: js.UndefOr[Ids] = js.undefined
}
object MlGetDatafeedStatsRequest {
  
  inline def apply(): MlGetDatafeedStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDatafeedStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetDatafeedStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setDatafeed_id(value: Ids): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
    
    inline def setDatafeed_idVarargs(value: Id*): Self = StObject.set(x, "datafeed_id", js.Array(value*))
  }
}
