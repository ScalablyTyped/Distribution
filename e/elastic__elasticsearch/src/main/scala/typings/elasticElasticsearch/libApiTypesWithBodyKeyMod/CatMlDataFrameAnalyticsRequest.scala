package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatMlDataFrameAnalyticsRequest
  extends StObject
     with CatCatRequestBase {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  @JSName("h")
  var h_CatMlDataFrameAnalyticsRequest: js.UndefOr[CatCatDfaColumns] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  @JSName("s")
  var s_CatMlDataFrameAnalyticsRequest: js.UndefOr[CatCatDfaColumns] = js.undefined
  
  var time: js.UndefOr[Duration] = js.undefined
}
object CatMlDataFrameAnalyticsRequest {
  
  inline def apply(): CatMlDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlDataFrameAnalyticsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatMlDataFrameAnalyticsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setH(value: CatCatDfaColumns): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: CatCatDfaColumn*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setS(value: CatCatDfaColumns): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: CatCatDfaColumn*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
