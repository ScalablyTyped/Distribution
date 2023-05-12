package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDownInfo extends StObject {
  
  var handled: Boolean
}
object KeyDownInfo {
  
  inline def apply(handled: Boolean): KeyDownInfo = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDownInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyDownInfo] (val x: Self) extends AnyVal {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
