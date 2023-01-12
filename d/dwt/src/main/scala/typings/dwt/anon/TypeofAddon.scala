package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAddon extends StObject {
  
  val OCRPro: TypeofOCRPro
}
object TypeofAddon {
  
  inline def apply(OCRPro: TypeofOCRPro): TypeofAddon = {
    val __obj = js.Dynamic.literal(OCRPro = OCRPro.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAddon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAddon] (val x: Self) extends AnyVal {
    
    inline def setOCRPro(value: TypeofOCRPro): Self = StObject.set(x, "OCRPro", value.asInstanceOf[js.Any])
  }
}
