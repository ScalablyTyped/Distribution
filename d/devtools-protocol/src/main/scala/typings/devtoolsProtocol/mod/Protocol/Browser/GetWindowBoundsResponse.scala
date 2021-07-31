package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWindowBoundsResponse extends StObject {
  
  /**
    * Bounds information of the window. When window state is 'minimized', the restored window
    * position and size are returned.
    */
  var bounds: Bounds
}
object GetWindowBoundsResponse {
  
  @scala.inline
  def apply(bounds: Bounds): GetWindowBoundsResponse = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowBoundsResponse]
  }
  
  @scala.inline
  implicit class GetWindowBoundsResponseMutableBuilder[Self <: GetWindowBoundsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
  }
}
