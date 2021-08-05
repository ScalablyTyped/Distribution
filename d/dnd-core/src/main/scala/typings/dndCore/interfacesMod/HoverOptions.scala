package typings.dndCore.interfacesMod

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
  
  extension [Self <: HoverOptions](x: Self) {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetUndefined: Self = StObject.set(x, "clientOffset", js.undefined)
  }
}
