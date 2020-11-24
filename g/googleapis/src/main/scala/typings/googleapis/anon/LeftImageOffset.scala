package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftImageOffset extends js.Object {
  
  var leftImageOffset: js.UndefOr[Double] = js.native
  
  var topImageOffset: js.UndefOr[Double] = js.native
}
object LeftImageOffset {
  
  @scala.inline
  def apply(): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftImageOffset]
  }
  
  @scala.inline
  implicit class LeftImageOffsetOps[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
    
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
    def setLeftImageOffset(value: Double): Self = this.set("leftImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftImageOffset: Self = this.set("leftImageOffset", js.undefined)
    
    @scala.inline
    def setTopImageOffset(value: Double): Self = this.set("topImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopImageOffset: Self = this.set("topImageOffset", js.undefined)
  }
}
