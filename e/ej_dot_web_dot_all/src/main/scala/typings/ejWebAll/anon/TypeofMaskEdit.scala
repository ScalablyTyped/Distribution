package typings.ejWebAll.anon

import typings.ejWebAll.ej.MaskEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMaskEdit extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: MaskEdit
}
object TypeofMaskEdit {
  
  inline def apply(Locale: js.Any, fn: MaskEdit): TypeofMaskEdit = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMaskEdit]
  }
  
  extension [Self <: TypeofMaskEdit](x: Self) {
    
    inline def setFn(value: MaskEdit): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
