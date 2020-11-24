package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment extends js.Object {
  
  var error: Double = js.native
  
  var p1: Point = js.native
  
  var p2: Point = js.native
}
object Segment {
  
  @scala.inline
  def apply(error: Double, p1: Point, p2: Point): Segment = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: Point): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: Point): Self = this.set("p2", value.asInstanceOf[js.Any])
  }
}
