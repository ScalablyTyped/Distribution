package typings.ejWebAll.anon

import typings.ejWebAll.ej.Rotator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRotator extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Rotator = js.native
}
object TypeofRotator {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Rotator): TypeofRotator = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRotator]
  }
  
  @scala.inline
  implicit class TypeofRotatorMutableBuilder[Self <: TypeofRotator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Rotator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
