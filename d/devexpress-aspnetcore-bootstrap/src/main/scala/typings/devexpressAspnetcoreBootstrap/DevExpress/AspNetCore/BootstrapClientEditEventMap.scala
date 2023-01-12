package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapClientEditEventMap
  extends StObject
     with ControlEventMap {
  
  var gotFocus: EventArgs
  
  var lostFocus: EventArgs
  
  var validation: EditValidationEventArgs
  
  var valueChanged: ProcessingModeEventArgs
}
object BootstrapClientEditEventMap {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BootstrapClientEditEventMap] (val x: Self) extends AnyVal {
    
    inline def setGotFocus(value: EventArgs): Self = StObject.set(x, "gotFocus", value.asInstanceOf[js.Any])
    
    inline def setLostFocus(value: EventArgs): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: EditValidationEventArgs): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
  }
}
