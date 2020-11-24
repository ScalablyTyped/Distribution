package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcData extends js.Object {
  
  val endingAngle: Double = js.native
  
  val innerRadius: Double = js.native
  
  val startingAngle: Double = js.native
}
object ArcData {
  
  @scala.inline
  def apply(endingAngle: Double, innerRadius: Double, startingAngle: Double): ArcData = {
    val __obj = js.Dynamic.literal(endingAngle = endingAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startingAngle = startingAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcData]
  }
  
  @scala.inline
  implicit class ArcDataOps[Self <: ArcData] (val x: Self) extends AnyVal {
    
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
    def setEndingAngle(value: Double): Self = this.set("endingAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingAngle(value: Double): Self = this.set("startingAngle", value.asInstanceOf[js.Any])
  }
}
