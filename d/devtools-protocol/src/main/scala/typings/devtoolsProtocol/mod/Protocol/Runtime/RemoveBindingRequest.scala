package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveBindingRequest extends StObject {
  
  var name: String = js.native
}
object RemoveBindingRequest {
  
  @scala.inline
  def apply(name: String): RemoveBindingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBindingRequest]
  }
  
  @scala.inline
  implicit class RemoveBindingRequestMutableBuilder[Self <: RemoveBindingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
