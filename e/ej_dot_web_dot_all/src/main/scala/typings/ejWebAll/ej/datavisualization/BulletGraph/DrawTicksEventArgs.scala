package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawTicksEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the interval value.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /** returns the settings for majorTicks.
    */
  var majorTickSettings: js.UndefOr[js.Any] = js.native
  
  /** returns the maximum value.
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /** returns the minimum value.
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /** returns the value of minorTicksPerInterval.
    */
  var minorTickPerInterval: js.UndefOr[Double] = js.native
  
  /** returns the settings for minorTicks.
    */
  var minorTickSettings: js.UndefOr[js.Any] = js.native
  
  /** returns the model of the bullet graph.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DrawTicksEventArgs {
  
  @scala.inline
  def apply(): DrawTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawTicksEventArgs]
  }
  
  @scala.inline
  implicit class DrawTicksEventArgsOps[Self <: DrawTicksEventArgs] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMajorTickSettings(value: js.Any): Self = this.set("majorTickSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTickSettings: Self = this.set("majorTickSettings", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMinorTickPerInterval(value: Double): Self = this.set("minorTickPerInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickPerInterval: Self = this.set("minorTickPerInterval", js.undefined)
    
    @scala.inline
    def setMinorTickSettings(value: js.Any): Self = this.set("minorTickSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickSettings: Self = this.set("minorTickSettings", js.undefined)
    
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
