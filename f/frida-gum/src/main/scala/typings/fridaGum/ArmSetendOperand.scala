package typings.fridaGum

import typings.fridaGum.fridaGumStrings.setend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmSetendOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: setend
  
  var value: Endian
}
object ArmSetendOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Endian): ArmSetendOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setend")
    __obj.asInstanceOf[ArmSetendOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmSetendOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: setend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Endian): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
