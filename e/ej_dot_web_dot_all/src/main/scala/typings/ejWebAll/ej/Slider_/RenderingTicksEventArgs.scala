package typings.ejWebAll.ej.Slider_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingTicksEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the current Li element
    */
  var tick: js.UndefOr[js.Any] = js.native
  
  /** returns slider tick value
    */
  var value: js.UndefOr[Double] = js.native
  
  /** returns the value type either tooltip or label value
    */
  var valueType: js.UndefOr[String] = js.native
}
object RenderingTicksEventArgs {
  
  @scala.inline
  def apply(): RenderingTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingTicksEventArgs]
  }
  
  @scala.inline
  implicit class RenderingTicksEventArgsOps[Self <: RenderingTicksEventArgs] (val x: Self) extends AnyVal {
    
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
    def setTick(value: js.Any): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
