package typings.fridaGum

import typings.fridaGum.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmBaseOperand extends StObject {
  
  var shift: js.UndefOr[Type] = js.native
  
  var subtracted: Boolean = js.native
  
  var vectorIndex: js.UndefOr[Double] = js.native
}
object ArmBaseOperand {
  
  @scala.inline
  def apply(subtracted: Boolean): ArmBaseOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmBaseOperand]
  }
  
  @scala.inline
  implicit class ArmBaseOperandMutableBuilder[Self <: ArmBaseOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShift(value: Type): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    @scala.inline
    def setSubtracted(value: Boolean): Self = StObject.set(x, "subtracted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorIndex(value: Double): Self = StObject.set(x, "vectorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorIndexUndefined: Self = StObject.set(x, "vectorIndex", js.undefined)
  }
}
