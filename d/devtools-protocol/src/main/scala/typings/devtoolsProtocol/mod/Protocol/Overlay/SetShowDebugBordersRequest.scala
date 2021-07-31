package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowDebugBordersRequest extends StObject {
  
  /**
    * True for showing debug borders
    */
  var show: Boolean
}
object SetShowDebugBordersRequest {
  
  @scala.inline
  def apply(show: Boolean): SetShowDebugBordersRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowDebugBordersRequest]
  }
  
  @scala.inline
  implicit class SetShowDebugBordersRequestMutableBuilder[Self <: SetShowDebugBordersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
