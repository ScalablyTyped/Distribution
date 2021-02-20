package typings.ejWebAll.anon

import typings.ejWebAll.ej.Calculate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCalculate extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Calculate = js.native
}
object TypeofCalculate {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Calculate): TypeofCalculate = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalculate]
  }
  
  @scala.inline
  implicit class TypeofCalculateMutableBuilder[Self <: TypeofCalculate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Calculate): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
