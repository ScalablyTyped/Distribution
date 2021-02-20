package typings.fridaGum

import typings.fridaGum.fridaGumStrings.prefetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64PrefetchOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: prefetch = js.native
  
  var value: Double = js.native
}
object Arm64PrefetchOperand {
  
  @scala.inline
  def apply(`type`: prefetch, value: Double): Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64PrefetchOperand]
  }
  
  @scala.inline
  implicit class Arm64PrefetchOperandMutableBuilder[Self <: Arm64PrefetchOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: prefetch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
