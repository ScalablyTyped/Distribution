package typings.ejWebAll.anon

import typings.ejWebAll.ej.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToolbar extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Toolbar
}
object TypeofToolbar {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Toolbar): TypeofToolbar = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToolbar]
  }
  
  @scala.inline
  implicit class TypeofToolbarMutableBuilder[Self <: TypeofToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Toolbar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
