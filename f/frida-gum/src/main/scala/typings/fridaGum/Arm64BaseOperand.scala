package typings.fridaGum

import typings.fridaGum.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64BaseOperand extends StObject {
  
  var ext: js.UndefOr[Arm64Extender] = js.undefined
  
  var shift: js.UndefOr[Value] = js.undefined
  
  var vas: js.UndefOr[Arm64Vas] = js.undefined
  
  var vectorIndex: js.UndefOr[Double] = js.undefined
}
object Arm64BaseOperand {
  
  inline def apply(): Arm64BaseOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arm64BaseOperand]
  }
  
  extension [Self <: Arm64BaseOperand](x: Self) {
    
    inline def setExt(value: Arm64Extender): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setShift(value: Value): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setVas(value: Arm64Vas): Self = StObject.set(x, "vas", value.asInstanceOf[js.Any])
    
    inline def setVasUndefined: Self = StObject.set(x, "vas", js.undefined)
    
    inline def setVectorIndex(value: Double): Self = StObject.set(x, "vectorIndex", value.asInstanceOf[js.Any])
    
    inline def setVectorIndexUndefined: Self = StObject.set(x, "vectorIndex", js.undefined)
  }
}
