package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCheckBoxEventMap extends BootstrapClientEditEventMap {
  
  var checkedChanged: ProcessingModeEventArgs = js.native
}
object BootstrapCheckBoxEventMap {
  
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapCheckBoxEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCheckBoxEventMap]
  }
  
  @scala.inline
  implicit class BootstrapCheckBoxEventMapMutableBuilder[Self <: BootstrapCheckBoxEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckedChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "checkedChanged", value.asInstanceOf[js.Any])
  }
}
