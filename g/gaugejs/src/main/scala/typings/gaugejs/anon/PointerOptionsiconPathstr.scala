package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined gaugejs.gaugejs.PointerOptions & {  iconPath :string | undefined,   iconScale :number | undefined,   iconAngle :number | undefined} */
@js.native
trait PointerOptionsiconPathstr extends js.Object {
  
  var color: String = js.native
  
  var iconAngle: js.UndefOr[Double] = js.native
  
  var iconPath: js.UndefOr[String] = js.native
  
  var iconScale: js.UndefOr[Double] = js.native
  
  var length: Double = js.native
  
  var strokeWidth: Double = js.native
}
object PointerOptionsiconPathstr {
  
  @scala.inline
  def apply(color: String, length: Double, strokeWidth: Double): PointerOptionsiconPathstr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerOptionsiconPathstr]
  }
  
  @scala.inline
  implicit class PointerOptionsiconPathstrOps[Self <: PointerOptionsiconPathstr] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconAngle(value: Double): Self = this.set("iconAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconAngle: Self = this.set("iconAngle", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    
    @scala.inline
    def setIconScale(value: Double): Self = this.set("iconScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconScale: Self = this.set("iconScale", js.undefined)
  }
}
