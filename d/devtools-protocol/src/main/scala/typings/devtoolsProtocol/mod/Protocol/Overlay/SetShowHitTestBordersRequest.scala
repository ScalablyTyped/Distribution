package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowHitTestBordersRequest extends StObject {
  
  /**
    * True for showing hit-test borders
    */
  var show: Boolean = js.native
}
object SetShowHitTestBordersRequest {
  
  @scala.inline
  def apply(show: Boolean): SetShowHitTestBordersRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowHitTestBordersRequest]
  }
  
  @scala.inline
  implicit class SetShowHitTestBordersRequestMutableBuilder[Self <: SetShowHitTestBordersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
