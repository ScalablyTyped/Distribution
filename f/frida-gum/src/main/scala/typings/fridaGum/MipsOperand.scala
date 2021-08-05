package typings.fridaGum

import typings.fridaGum.anon.BaseDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.MipsRegOperand
  - typings.fridaGum.MipsImmOperand
  - typings.fridaGum.MipsMemOperand
*/
trait MipsOperand extends StObject
object MipsOperand {
  
  inline def MipsImmOperand(value: Double): typings.fridaGum.MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.MipsImmOperand]
  }
  
  inline def MipsMemOperand(value: BaseDisp): typings.fridaGum.MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.MipsMemOperand]
  }
  
  inline def MipsRegOperand(value: MipsRegister): typings.fridaGum.MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.MipsRegOperand]
  }
}
