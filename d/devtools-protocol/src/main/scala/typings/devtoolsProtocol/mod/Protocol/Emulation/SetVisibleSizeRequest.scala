package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVisibleSizeRequest extends StObject {
  
  /**
    * Frame height (DIP).
    */
  var height: integer = js.native
  
  /**
    * Frame width (DIP).
    */
  var width: integer = js.native
}
object SetVisibleSizeRequest {
  
  @scala.inline
  def apply(height: integer, width: integer): SetVisibleSizeRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVisibleSizeRequest]
  }
  
  @scala.inline
  implicit class SetVisibleSizeRequestMutableBuilder[Self <: SetVisibleSizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
