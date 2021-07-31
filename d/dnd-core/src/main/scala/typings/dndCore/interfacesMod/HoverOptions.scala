package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverOptions extends StObject {
  
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
}
object HoverOptions {
  
  @scala.inline
  def apply(): HoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverOptions]
  }
  
  @scala.inline
  implicit class HoverOptionsMutableBuilder[Self <: HoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetUndefined: Self = StObject.set(x, "clientOffset", js.undefined)
  }
}
