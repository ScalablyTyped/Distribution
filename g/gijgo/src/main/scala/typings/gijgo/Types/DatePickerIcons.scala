package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DatePicker
@js.native
trait DatePickerIcons extends StObject {
  
  var rightIcon: js.UndefOr[String] = js.native
}
object DatePickerIcons {
  
  @scala.inline
  def apply(): DatePickerIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerIcons]
  }
  
  @scala.inline
  implicit class DatePickerIconsMutableBuilder[Self <: DatePickerIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
  }
}
