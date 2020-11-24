package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivColor extends js.Object {
  
  var divColor: String = js.native
  
  var divLength: Double = js.native
  
  var divWidth: Double = js.native
  
  var divisions: Double = js.native
  
  var subColor: String = js.native
  
  var subDivisions: Double = js.native
  
  var subLength: Double = js.native
  
  var subWidth: Double = js.native
}
object DivColor {
  
  @scala.inline
  def apply(
    divColor: String,
    divLength: Double,
    divWidth: Double,
    divisions: Double,
    subColor: String,
    subDivisions: Double,
    subLength: Double,
    subWidth: Double
  ): DivColor = {
    val __obj = js.Dynamic.literal(divColor = divColor.asInstanceOf[js.Any], divLength = divLength.asInstanceOf[js.Any], divWidth = divWidth.asInstanceOf[js.Any], divisions = divisions.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any], subDivisions = subDivisions.asInstanceOf[js.Any], subLength = subLength.asInstanceOf[js.Any], subWidth = subWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivColor]
  }
  
  @scala.inline
  implicit class DivColorOps[Self <: DivColor] (val x: Self) extends AnyVal {
    
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
    def setDivColor(value: String): Self = this.set("divColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivLength(value: Double): Self = this.set("divLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivWidth(value: Double): Self = this.set("divWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisions(value: Double): Self = this.set("divisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubColor(value: String): Self = this.set("subColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDivisions(value: Double): Self = this.set("subDivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLength(value: Double): Self = this.set("subLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubWidth(value: Double): Self = this.set("subWidth", value.asInstanceOf[js.Any])
  }
}
