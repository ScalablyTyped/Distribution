package typings.ejWebAll.anon

import typings.ejWebAll.ej.RadialMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRadialMenu extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: RadialMenu = js.native
}
object TypeofRadialMenu {
  
  @scala.inline
  def apply(Locale: js.Any, fn: RadialMenu): TypeofRadialMenu = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadialMenu]
  }
  
  @scala.inline
  implicit class TypeofRadialMenuMutableBuilder[Self <: TypeofRadialMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: RadialMenu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
