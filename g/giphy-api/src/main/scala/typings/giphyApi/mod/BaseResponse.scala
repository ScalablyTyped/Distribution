package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseResponse extends StObject {
  
  var meta: Msg
  
  var pagination: Count
}
object BaseResponse {
  
  inline def apply(meta: Msg, pagination: Count): BaseResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  
  extension [Self <: BaseResponse](x: Self) {
    
    inline def setMeta(value: Msg): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPagination(value: Count): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
