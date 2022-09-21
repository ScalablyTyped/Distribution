package typings.fridaGum

import typings.fridaGum.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmBaseOperand extends StObject {
  
  var access: OperandAccess
  
  var shift: js.UndefOr[Type] = js.undefined
  
  var subtracted: Boolean
  
  var vectorIndex: js.UndefOr[Double] = js.undefined
}
object ArmBaseOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean): ArmBaseOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmBaseOperand]
  }
  
  extension [Self <: ArmBaseOperand](x: Self) {
    
    inline def setAccess(value: OperandAccess): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Type): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setSubtracted(value: Boolean): Self = StObject.set(x, "subtracted", value.asInstanceOf[js.Any])
    
    inline def setVectorIndex(value: Double): Self = StObject.set(x, "vectorIndex", value.asInstanceOf[js.Any])
    
    inline def setVectorIndexUndefined: Self = StObject.set(x, "vectorIndex", js.undefined)
  }
}
