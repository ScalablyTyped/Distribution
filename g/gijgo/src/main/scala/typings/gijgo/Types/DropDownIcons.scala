package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DropDown
trait DropDownIcons extends StObject {
  
  var dropdown: js.UndefOr[String] = js.undefined
}
object DropDownIcons {
  
  inline def apply(): DropDownIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownIcons]
  }
  
  extension [Self <: DropDownIcons](x: Self) {
    
    inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
  }
}
