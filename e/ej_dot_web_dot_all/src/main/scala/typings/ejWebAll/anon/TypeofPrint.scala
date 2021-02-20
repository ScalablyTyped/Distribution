package typings.ejWebAll.anon

import typings.ejWebAll.ej.Print
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPrint extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Print = js.native
}
object TypeofPrint {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Print): TypeofPrint = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPrint]
  }
  
  @scala.inline
  implicit class TypeofPrintMutableBuilder[Self <: TypeofPrint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Print): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
