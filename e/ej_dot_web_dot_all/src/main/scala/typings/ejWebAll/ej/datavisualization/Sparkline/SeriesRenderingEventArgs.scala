package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesRenderingEventArgs extends js.Object {
  
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Maximum x value of the data point
    */
  var maxX: js.UndefOr[js.Any] = js.native
  
  /** Maximum y value of the data point
    */
  var maxY: js.UndefOr[js.Any] = js.native
  
  /** Minimum x value of the data point
    */
  var minX: js.UndefOr[js.Any] = js.native
  
  /** Minimum y value of the data point
    */
  var minY: js.UndefOr[js.Any] = js.native
  
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object SeriesRenderingEventArgs {
  
  @scala.inline
  def apply(): SeriesRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesRenderingEventArgs]
  }
  
  @scala.inline
  implicit class SeriesRenderingEventArgsOps[Self <: SeriesRenderingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setMaxX(value: js.Any): Self = this.set("maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxX: Self = this.set("maxX", js.undefined)
    
    @scala.inline
    def setMaxY(value: js.Any): Self = this.set("maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxY: Self = this.set("maxY", js.undefined)
    
    @scala.inline
    def setMinX(value: js.Any): Self = this.set("minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinX: Self = this.set("minX", js.undefined)
    
    @scala.inline
    def setMinY(value: js.Any): Self = this.set("minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinY: Self = this.set("minY", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
