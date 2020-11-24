package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointRegionMouseClickEventArgs extends js.Object {
  
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** X-coordinate of point in pixel
    */
  var locationX: js.UndefOr[Double] = js.native
  
  /** Y-coordinate of point in pixel
    */
  var locationY: js.UndefOr[Double] = js.native
  
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Index of the point in series
    */
  var pointIndex: js.UndefOr[Double] = js.native
  
  /** Type of the series
    */
  var seriesType: js.UndefOr[String] = js.native
  
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object PointRegionMouseClickEventArgs {
  
  @scala.inline
  def apply(): PointRegionMouseClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointRegionMouseClickEventArgs]
  }
  
  @scala.inline
  implicit class PointRegionMouseClickEventArgsOps[Self <: PointRegionMouseClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setLocationX(value: Double): Self = this.set("locationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationX: Self = this.set("locationX", js.undefined)
    
    @scala.inline
    def setLocationY(value: Double): Self = this.set("locationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationY: Self = this.set("locationY", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointIndex: Self = this.set("pointIndex", js.undefined)
    
    @scala.inline
    def setSeriesType(value: String): Self = this.set("seriesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesType: Self = this.set("seriesType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
