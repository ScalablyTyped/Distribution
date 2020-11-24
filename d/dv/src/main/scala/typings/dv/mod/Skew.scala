package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skew extends js.Object {
  
  var angle: Double = js.native
  
  var confidence: Double = js.native
}
object Skew {
  
  @scala.inline
  def apply(angle: Double, confidence: Double): Skew = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skew]
  }
  
  @scala.inline
  implicit class SkewOps[Self <: Skew] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
  }
}
