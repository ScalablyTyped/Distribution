package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorVertex extends js.Object {
  
  val cornerRadius: js.UndefOr[Double] = js.native
  
  val handleMirroring: js.UndefOr[HandleMirroring] = js.native
  
  val strokeCap: js.UndefOr[StrokeCap] = js.native
  
  val strokeJoin: js.UndefOr[StrokeJoin] = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
object VectorVertex {
  
  @scala.inline
  def apply(x: Double, y: Double): VectorVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorVertex]
  }
  
  @scala.inline
  implicit class VectorVertexOps[Self <: VectorVertex] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setHandleMirroring(value: HandleMirroring): Self = this.set("handleMirroring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleMirroring: Self = this.set("handleMirroring", js.undefined)
    
    @scala.inline
    def setStrokeCap(value: StrokeCap): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeCap: Self = this.set("strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeJoin(value: StrokeJoin): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeJoin: Self = this.set("strokeJoin", js.undefined)
  }
}
