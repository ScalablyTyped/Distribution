package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVisibleSizeRequest extends StObject {
  
  /**
    * Frame height (DIP).
    */
  var height: integer
  
  /**
    * Frame width (DIP).
    */
  var width: integer
}
object SetVisibleSizeRequest {
  
  inline def apply(height: integer, width: integer): SetVisibleSizeRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVisibleSizeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetVisibleSizeRequest] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
