package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTargetInfoResponse extends StObject {
  
  var targetInfo: TargetInfo = js.native
}
object GetTargetInfoResponse {
  
  @scala.inline
  def apply(targetInfo: TargetInfo): GetTargetInfoResponse = {
    val __obj = js.Dynamic.literal(targetInfo = targetInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetInfoResponse]
  }
  
  @scala.inline
  implicit class GetTargetInfoResponseMutableBuilder[Self <: GetTargetInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetInfo(value: TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
  }
}
