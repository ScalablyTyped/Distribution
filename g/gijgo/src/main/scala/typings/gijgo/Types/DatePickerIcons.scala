package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DatePicker
trait DatePickerIcons extends StObject {
  
  var rightIcon: js.UndefOr[String] = js.undefined
}
object DatePickerIcons {
  
  inline def apply(): DatePickerIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerIcons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerIcons] (val x: Self) extends AnyVal {
    
    inline def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
  }
}
