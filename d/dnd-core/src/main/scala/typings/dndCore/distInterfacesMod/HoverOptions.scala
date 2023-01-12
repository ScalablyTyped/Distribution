package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverOptions extends StObject {
  
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
}
object HoverOptions {
  
  inline def apply(): HoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverOptions] (val x: Self) extends AnyVal {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetUndefined: Self = StObject.set(x, "clientOffset", js.undefined)
  }
}
