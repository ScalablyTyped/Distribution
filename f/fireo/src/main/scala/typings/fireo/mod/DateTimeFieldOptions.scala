package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFieldOptions
  extends StObject
     with BaseFieldOptions {
  
  var auto: js.UndefOr[Boolean] = js.undefined
}
object DateTimeFieldOptions {
  
  inline def apply(): DateTimeFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
  }
}
