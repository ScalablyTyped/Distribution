package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleResponse
  extends StObject
     with BaseResponse {
  
  var data: GIFObject
}
object SingleResponse {
  
  inline def apply(data: GIFObject, meta: Msg, pagination: Count): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
  
  extension [Self <: SingleResponse](x: Self) {
    
    inline def setData(value: GIFObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
