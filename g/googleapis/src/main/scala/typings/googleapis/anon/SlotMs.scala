package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotMs extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var slotMs: js.UndefOr[String] = js.undefined
}
object SlotMs {
  
  inline def apply(): SlotMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotMs]
  }
  
  extension [Self <: SlotMs](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    inline def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
