package typings.ejWebAll.anon

import typings.ejWebAll.ej.Captcha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCaptcha extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Captcha
}
object TypeofCaptcha {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Captcha): TypeofCaptcha = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCaptcha]
  }
  
  @scala.inline
  implicit class TypeofCaptchaMutableBuilder[Self <: TypeofCaptcha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Captcha): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
