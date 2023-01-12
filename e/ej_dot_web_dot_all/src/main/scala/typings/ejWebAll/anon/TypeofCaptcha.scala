package typings.ejWebAll.anon

import typings.ejWebAll.ej.Captcha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCaptcha extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Captcha
}
object TypeofCaptcha {
  
  inline def apply(Locale: Any, fn: Captcha): TypeofCaptcha = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCaptcha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCaptcha] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Captcha): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
