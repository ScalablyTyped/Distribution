package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetProduceCompilationCacheRequest extends StObject {
  
  var enabled: Boolean = js.native
}
object SetProduceCompilationCacheRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetProduceCompilationCacheRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetProduceCompilationCacheRequest]
  }
  
  @scala.inline
  implicit class SetProduceCompilationCacheRequestMutableBuilder[Self <: SetProduceCompilationCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
