package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesRangeCalculateEventArgs extends js.Object {
  
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** delta - Difference between minimum and maximum value of axis range.    interval - Interval value of axis range. Grid lines, tick lines and axis labels are drawn based on this
    * interval value.    max - Maximum value of axis range.    min - Minimum value of axis range.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Instance of the chart model object.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object AxesRangeCalculateEventArgs {
  
  @scala.inline
  def apply(): AxesRangeCalculateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesRangeCalculateEventArgs]
  }
  
  @scala.inline
  implicit class AxesRangeCalculateEventArgsOps[Self <: AxesRangeCalculateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
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
