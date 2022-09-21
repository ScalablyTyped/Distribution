package typings.ejWebAll.anon

import typings.ejWebAll.ej.Dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDialog extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Dialog
}
object TypeofDialog {
  
  inline def apply(Locale: Any, fn: Dialog): TypeofDialog = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDialog]
  }
  
  extension [Self <: TypeofDialog](x: Self) {
    
    inline def setFn(value: Dialog): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
