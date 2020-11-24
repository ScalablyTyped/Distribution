package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorSegment extends js.Object {
  
  val end: Double = js.native
  
  val start: Double = js.native
  
   // Defaults to { x: 0, y: 0 }
  val tangentEnd: js.UndefOr[Vector] = js.native
  
  val tangentStart: js.UndefOr[Vector] = js.native
}
object VectorSegment {
  
  @scala.inline
  def apply(end: Double, start: Double): VectorSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSegment]
  }
  
  @scala.inline
  implicit class VectorSegmentOps[Self <: VectorSegment] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentEnd(value: Vector): Self = this.set("tangentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTangentEnd: Self = this.set("tangentEnd", js.undefined)
    
    @scala.inline
    def setTangentStart(value: Vector): Self = this.set("tangentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTangentStart: Self = this.set("tangentStart", js.undefined)
  }
}
