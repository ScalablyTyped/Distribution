package typings.ejWebAll.anon

import typings.ejWebAll.ej.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMenu extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Menu
}
object TypeofMenu {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Menu): TypeofMenu = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMenu]
  }
  
  @scala.inline
  implicit class TypeofMenuMutableBuilder[Self <: TypeofMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Menu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
