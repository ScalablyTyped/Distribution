package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Barcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBarcode extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Barcode = js.native
}
object TypeofBarcode {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Barcode): TypeofBarcode = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBarcode]
  }
  
  @scala.inline
  implicit class TypeofBarcodeMutableBuilder[Self <: TypeofBarcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Barcode): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
