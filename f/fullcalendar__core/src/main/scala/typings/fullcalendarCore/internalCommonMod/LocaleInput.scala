package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleInput
  extends StObject
     with CalendarOptions {
  
  var code: String
}
object LocaleInput {
  
  inline def apply(code: String): LocaleInput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleInput] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
