package typings.fridaGum

import typings.fridaGum.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmBaseOperand extends js.Object {
  
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
  implicit class ArmBaseOperandOps[Self <: ArmBaseOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubtracted(value: Boolean): Self = this.set("subtracted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Type): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    
    @scala.inline
    def setVectorIndex(value: Double): Self = this.set("vectorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorIndex: Self = this.set("vectorIndex", js.undefined)
  }
}
