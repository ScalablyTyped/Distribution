package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
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
  implicit class BootstrapClientEditEventMapMutableBuilder[Self <: BootstrapClientEditEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGotFocus(value: EventArgs): Self = StObject.set(x, "gotFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLostFocus(value: EventArgs): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: EditValidationEventArgs): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
  }
}
