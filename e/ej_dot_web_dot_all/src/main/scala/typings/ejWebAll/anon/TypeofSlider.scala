package typings.ejWebAll.anon

import typings.ejWebAll.ej.Slider_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSlider extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Slider_
}
object TypeofSlider {
  
  inline def apply(Locale: Any, fn: Slider_): TypeofSlider = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSlider] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Slider_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
