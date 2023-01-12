package typings.gestalt.anon

import typings.gestalt.mod.DropdownOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDropdownOption extends StObject {
  
  var item: DropdownOption
}
object ItemDropdownOption {
  
  inline def apply(item: DropdownOption): ItemDropdownOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDropdownOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemDropdownOption] (val x: Self) extends AnyVal {
    
    inline def setItem(value: DropdownOption): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
