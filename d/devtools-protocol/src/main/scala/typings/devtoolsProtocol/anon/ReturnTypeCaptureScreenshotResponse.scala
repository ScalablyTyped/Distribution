package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotRequest
import typings.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCaptureScreenshotResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[CaptureScreenshotRequest]]
  
  var returnType: CaptureScreenshotResponse
}
object ReturnTypeCaptureScreenshotResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[CaptureScreenshotRequest]], returnType: CaptureScreenshotResponse): ReturnTypeCaptureScreenshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCaptureScreenshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCaptureScreenshotResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[CaptureScreenshotRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[CaptureScreenshotRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CaptureScreenshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
