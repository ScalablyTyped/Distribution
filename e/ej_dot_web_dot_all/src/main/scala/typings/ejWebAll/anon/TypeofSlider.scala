package typings.ejWebAll.anon

import typings.ejWebAll.ej.Slider_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSlider extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Slider_ = js.native
}
object TypeofSlider {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Slider_): TypeofSlider = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSlider]
  }
  
  @scala.inline
  implicit class TypeofSliderMutableBuilder[Self <: TypeofSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Slider_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
