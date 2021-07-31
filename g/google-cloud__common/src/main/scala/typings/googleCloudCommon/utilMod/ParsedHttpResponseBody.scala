package typings.googleCloudCommon.utilMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedHttpResponseBody extends StObject {
  
  var body: ResponseBody
  
  var err: js.UndefOr[Error] = js.undefined
}
object ParsedHttpResponseBody {
  
  @scala.inline
  def apply(body: ResponseBody): ParsedHttpResponseBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpResponseBody]
  }
  
  @scala.inline
  implicit class ParsedHttpResponseBodyMutableBuilder[Self <: ParsedHttpResponseBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
  }
}
