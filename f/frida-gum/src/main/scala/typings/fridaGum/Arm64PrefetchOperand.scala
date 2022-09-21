package typings.fridaGum

import typings.fridaGum.fridaGumStrings.prefetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64PrefetchOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: prefetch
  
  var value: Double
}
object Arm64PrefetchOperand {
  
  inline def apply(access: OperandAccess, value: Double): Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prefetch")
    __obj.asInstanceOf[Arm64PrefetchOperand]
  }
  
  extension [Self <: Arm64PrefetchOperand](x: Self) {
    
    inline def setType(value: prefetch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
