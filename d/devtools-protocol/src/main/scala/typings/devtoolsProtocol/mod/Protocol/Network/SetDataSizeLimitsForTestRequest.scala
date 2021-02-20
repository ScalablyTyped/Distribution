package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDataSizeLimitsForTestRequest extends StObject {
  
  /**
    * Maximum per-resource size.
    */
  var maxResourceSize: integer = js.native
  
  /**
    * Maximum total buffer size.
    */
  var maxTotalSize: integer = js.native
}
object SetDataSizeLimitsForTestRequest {
  
  @scala.inline
  def apply(maxResourceSize: integer, maxTotalSize: integer): SetDataSizeLimitsForTestRequest = {
    val __obj = js.Dynamic.literal(maxResourceSize = maxResourceSize.asInstanceOf[js.Any], maxTotalSize = maxTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataSizeLimitsForTestRequest]
  }
  
  @scala.inline
  implicit class SetDataSizeLimitsForTestRequestMutableBuilder[Self <: SetDataSizeLimitsForTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResourceSize(value: integer): Self = StObject.set(x, "maxResourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalSize(value: integer): Self = StObject.set(x, "maxTotalSize", value.asInstanceOf[js.Any])
  }
}
