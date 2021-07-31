package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMaxCallStackSizeToCaptureRequest extends StObject {
  
  var size: integer
}
object SetMaxCallStackSizeToCaptureRequest {
  
  @scala.inline
  def apply(size: integer): SetMaxCallStackSizeToCaptureRequest = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMaxCallStackSizeToCaptureRequest]
  }
  
  @scala.inline
  implicit class SetMaxCallStackSizeToCaptureRequestMutableBuilder[Self <: SetMaxCallStackSizeToCaptureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
