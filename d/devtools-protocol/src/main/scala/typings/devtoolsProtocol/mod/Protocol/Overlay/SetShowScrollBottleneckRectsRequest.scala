package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowScrollBottleneckRectsRequest extends StObject {
  
  /**
    * True for showing scroll bottleneck rects
    */
  var show: Boolean
}
object SetShowScrollBottleneckRectsRequest {
  
  @scala.inline
  def apply(show: Boolean): SetShowScrollBottleneckRectsRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowScrollBottleneckRectsRequest]
  }
  
  @scala.inline
  implicit class SetShowScrollBottleneckRectsRequestMutableBuilder[Self <: SetShowScrollBottleneckRectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
