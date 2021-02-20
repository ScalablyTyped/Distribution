package typings.ejWebAll.anon

import typings.ejWebAll.ej.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofButton extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Button = js.native
}
object TypeofButton {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Button): TypeofButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofButton]
  }
  
  @scala.inline
  implicit class TypeofButtonMutableBuilder[Self <: TypeofButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Button): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
