package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatMlDatafeedsRequest
  extends StObject
     with CatCatRequestBase {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var datafeed_id: js.UndefOr[Id] = js.undefined
  
  @JSName("h")
  var h_CatMlDatafeedsRequest: js.UndefOr[CatCatDatafeedColumns] = js.undefined
  
  @JSName("s")
  var s_CatMlDatafeedsRequest: js.UndefOr[CatCatDatafeedColumns] = js.undefined
  
  var time: js.UndefOr[TimeUnit] = js.undefined
}
object CatMlDatafeedsRequest {
  
  inline def apply(): CatMlDatafeedsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlDatafeedsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatMlDatafeedsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
    
    inline def setH(value: CatCatDatafeedColumns): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: CatCatDatafeedColumn*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setS(value: CatCatDatafeedColumns): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: CatCatDatafeedColumn*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setTime(value: TimeUnit): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
