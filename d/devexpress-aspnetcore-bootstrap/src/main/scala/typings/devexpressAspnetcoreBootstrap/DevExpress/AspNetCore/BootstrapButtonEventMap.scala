package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapButtonEventMap extends ControlEventMap {
  
  var checkedChanged: ProcessingModeEventArgs = js.native
  
  var click: ButtonClickEventArgs = js.native
  
  var gotFocus: EventArgs = js.native
  
  var lostFocus: EventArgs = js.native
}
object BootstrapButtonEventMap {
  
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    click: ButtonClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs
  ): BootstrapButtonEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapButtonEventMap]
  }
  
  @scala.inline
  implicit class BootstrapButtonEventMapMutableBuilder[Self <: BootstrapButtonEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckedChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "checkedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: ButtonClickEventArgs): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGotFocus(value: EventArgs): Self = StObject.set(x, "gotFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLostFocus(value: EventArgs): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
  }
}
