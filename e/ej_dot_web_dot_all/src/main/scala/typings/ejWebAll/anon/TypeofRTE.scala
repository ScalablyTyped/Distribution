package typings.ejWebAll.anon

import typings.ejWebAll.ej.RTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRTE extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: RTE = js.native
}
object TypeofRTE {
  
  @scala.inline
  def apply(Locale: js.Any, fn: RTE): TypeofRTE = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRTE]
  }
  
  @scala.inline
  implicit class TypeofRTEMutableBuilder[Self <: TypeofRTE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: RTE): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
