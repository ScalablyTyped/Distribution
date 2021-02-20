package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleResponse extends BaseResponse {
  
  var data: GIFObject = js.native
}
object SingleResponse {
  
  @scala.inline
  def apply(data: GIFObject, meta: Msg, pagination: Count): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
  
  @scala.inline
  implicit class SingleResponseMutableBuilder[Self <: SingleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: GIFObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
