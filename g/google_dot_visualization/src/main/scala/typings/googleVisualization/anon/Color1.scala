package typings.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color1 extends js.Object {
  
  var color1: String = js.native
  
  var color2: String = js.native
  
  var useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.native
  
  var x1: String = js.native
  
  var x2: String = js.native
  
  var y1: String = js.native
  
  var y2: String = js.native
}
object Color1 {
  
  @scala.inline
  def apply(color1: String, color2: String, x1: String, x2: String, y1: String, y2: String): Color1 = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color1]
  }
  
  @scala.inline
  implicit class Color1Ops[Self <: Color1] (val x: Self) extends AnyVal {
    
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
    def setColor1(value: String): Self = this.set("color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2(value: String): Self = this.set("color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseObjectBoundingBoxUnits(value: Boolean): Self = this.set("useObjectBoundingBoxUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseObjectBoundingBoxUnits: Self = this.set("useObjectBoundingBoxUnits", js.undefined)
  }
}
