package typings.fridaGum

import typings.fridaGum.fridaGumStrings.cimm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmCimmOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: cimm = js.native
  
  var value: Double = js.native
}
object ArmCimmOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: cimm, value: Double): ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmCimmOperand]
  }
  
  @scala.inline
  implicit class ArmCimmOperandMutableBuilder[Self <: ArmCimmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: cimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
