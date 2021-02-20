package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DropDown
@js.native
trait DropDownIcons extends StObject {
  
  var dropdown: js.UndefOr[String] = js.native
}
object DropDownIcons {
  
  @scala.inline
  def apply(): DropDownIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownIcons]
  }
  
  @scala.inline
  implicit class DropDownIconsMutableBuilder[Self <: DropDownIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
  }
}
