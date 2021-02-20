package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotMs extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var slotMs: js.UndefOr[String] = js.native
}
object SlotMs {
  
  @scala.inline
  def apply(): SlotMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotMs]
  }
  
  @scala.inline
  implicit class SlotMsMutableBuilder[Self <: SlotMs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
