package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedHttpRespMessage extends StObject {
  
  var err: js.UndefOr[ApiError] = js.undefined
  
  var resp: Response[js.Any]
}
object ParsedHttpRespMessage {
  
  @scala.inline
  def apply(resp: Response[js.Any]): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
  
  @scala.inline
  implicit class ParsedHttpRespMessageMutableBuilder[Self <: ParsedHttpRespMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErr(value: ApiError): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    @scala.inline
    def setResp(value: Response[js.Any]): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
  }
}
