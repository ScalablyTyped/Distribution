package typings.ejWebAll.anon

import typings.ejWebAll.ej.RadialSlider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadialSlider extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: RadialSlider
}
object TypeofRadialSlider {
  
  inline def apply(Locale: Any, fn: RadialSlider): TypeofRadialSlider = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadialSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRadialSlider] (val x: Self) extends AnyVal {
    
    inline def setFn(value: RadialSlider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
