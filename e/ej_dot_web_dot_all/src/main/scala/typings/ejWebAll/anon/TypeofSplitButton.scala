package typings.ejWebAll.anon

import typings.ejWebAll.ej.SplitButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitButton extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: SplitButton
}
object TypeofSplitButton {
  
  inline def apply(Locale: Any, fn: SplitButton): TypeofSplitButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSplitButton] (val x: Self) extends AnyVal {
    
    inline def setFn(value: SplitButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
