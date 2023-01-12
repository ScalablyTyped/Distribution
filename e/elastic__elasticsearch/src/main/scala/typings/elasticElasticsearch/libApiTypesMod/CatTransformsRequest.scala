package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatTransformsRequest
  extends StObject
     with CatCatRequestBase {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  @JSName("h")
  var h_CatTransformsRequest: js.UndefOr[CatCatTransformColumns] = js.undefined
  
  @JSName("s")
  var s_CatTransformsRequest: js.UndefOr[CatCatTransformColumns] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var time: js.UndefOr[TimeUnit] = js.undefined
  
  var transform_id: js.UndefOr[Id] = js.undefined
}
object CatTransformsRequest {
  
  inline def apply(): CatTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatTransformsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatTransformsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setH(value: CatCatTransformColumns): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: CatCatTransformColumn*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setS(value: CatCatTransformColumns): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: CatCatTransformColumn*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTime(value: TimeUnit): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def setTransform_idUndefined: Self = StObject.set(x, "transform_id", js.undefined)
  }
}
