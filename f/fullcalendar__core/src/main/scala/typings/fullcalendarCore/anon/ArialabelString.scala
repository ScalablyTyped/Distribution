package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArialabelString extends StObject {
  
  var `aria-label`: String
}
object ArialabelString {
  
  inline def apply(`aria-label`: String): ArialabelString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArialabelString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArialabelString] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
  }
}
