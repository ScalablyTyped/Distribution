package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Barcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBarcode extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Barcode
}
object TypeofBarcode {
  
  inline def apply(Locale: Any, fn: Barcode): TypeofBarcode = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBarcode]
  }
  
  extension [Self <: TypeofBarcode](x: Self) {
    
    inline def setFn(value: Barcode): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
