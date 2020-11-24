package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonSeriesOptionsCornerRadius extends js.Object {
  
  /** Specifies the radius for the bottom left corner.
    * @Default {0}
    */
  var bottomLeft: js.UndefOr[Double] = js.native
  
  /** Specifies the radius for the bottom right corner.
    * @Default {0}
    */
  var bottomRight: js.UndefOr[Double] = js.native
  
  /** Specifies the radius for the top left corner.
    * @Default {0}
    */
  var topLeft: js.UndefOr[Double] = js.native
  
  /** Specifies the radius for the top right corner.
    * @Default {0}
    */
  var topRight: js.UndefOr[Double] = js.native
}
object CommonSeriesOptionsCornerRadius {
  
  @scala.inline
  def apply(): CommonSeriesOptionsCornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsCornerRadius]
  }
  
  @scala.inline
  implicit class CommonSeriesOptionsCornerRadiusOps[Self <: CommonSeriesOptionsCornerRadius] (val x: Self) extends AnyVal {
    
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
    def setBottomLeft(value: Double): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    
    @scala.inline
    def setBottomRight(value: Double): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    
    @scala.inline
    def setTopLeft(value: Double): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    
    @scala.inline
    def setTopRight(value: Double): Self = this.set("topRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
}
