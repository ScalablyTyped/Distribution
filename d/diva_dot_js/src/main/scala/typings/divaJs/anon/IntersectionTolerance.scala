package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTolerance extends js.Object {
  
  var intersectionTolerance: Double = js.native
}
object IntersectionTolerance {
  
  @scala.inline
  def apply(intersectionTolerance: Double): IntersectionTolerance = {
    val __obj = js.Dynamic.literal(intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTolerance]
  }
  
  @scala.inline
  implicit class IntersectionToleranceOps[Self <: IntersectionTolerance] (val x: Self) extends AnyVal {
    
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
    def setIntersectionTolerance(value: Double): Self = this.set("intersectionTolerance", value.asInstanceOf[js.Any])
  }
}
