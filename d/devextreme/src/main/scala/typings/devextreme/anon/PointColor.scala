package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointColor extends js.Object {
  
  var pointColor: js.UndefOr[String] = js.native
  
  var pointIndex: js.UndefOr[Double] = js.native
  
  var pointName: js.UndefOr[js.Any] = js.native
}
object PointColor {
  
  @scala.inline
  def apply(): PointColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointColor]
  }
  
  @scala.inline
  implicit class PointColorOps[Self <: PointColor] (val x: Self) extends AnyVal {
    
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
    def setPointColor(value: String): Self = this.set("pointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointColor: Self = this.set("pointColor", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointIndex: Self = this.set("pointIndex", js.undefined)
    
    @scala.inline
    def setPointName(value: js.Any): Self = this.set("pointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointName: Self = this.set("pointName", js.undefined)
  }
}
