package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapClientEditEventMap extends ControlEventMap {
  
  var gotFocus: EventArgs = js.native
  
  var lostFocus: EventArgs = js.native
  
  var validation: EditValidationEventArgs = js.native
  
  var valueChanged: ProcessingModeEventArgs = js.native
}
object BootstrapClientEditEventMap {
  
  @scala.inline
  def apply(
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapClientEditEventMap = {
    val __obj = js.Dynamic.literal(gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientEditEventMap]
  }
  
  @scala.inline
  implicit class BootstrapClientEditEventMapOps[Self <: BootstrapClientEditEventMap] (val x: Self) extends AnyVal {
    
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
    def setGotFocus(value: EventArgs): Self = this.set("gotFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLostFocus(value: EventArgs): Self = this.set("lostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: EditValidationEventArgs): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: ProcessingModeEventArgs): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
  }
}
