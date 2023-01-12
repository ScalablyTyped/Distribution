package typings.googleCloudCommon.buildSrcUtilMod

import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedHttpRespMessage extends StObject {
  
  var err: js.UndefOr[ApiError] = js.undefined
  
  var resp: Response[Any]
}
object ParsedHttpRespMessage {
  
  inline def apply(resp: Response[Any]): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedHttpRespMessage] (val x: Self) extends AnyVal {
    
    inline def setErr(value: ApiError): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setResp(value: Response[Any]): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
  }
}
