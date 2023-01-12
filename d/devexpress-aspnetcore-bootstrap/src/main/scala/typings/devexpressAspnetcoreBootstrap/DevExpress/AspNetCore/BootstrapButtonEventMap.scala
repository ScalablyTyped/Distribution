package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapButtonEventMap
  extends StObject
     with ControlEventMap {
  
  var checkedChanged: ProcessingModeEventArgs
  
  var click: ButtonClickEventArgs
  
  var gotFocus: EventArgs
  
  var lostFocus: EventArgs
}
object BootstrapButtonEventMap {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BootstrapButtonEventMap] (val x: Self) extends AnyVal {
    
    inline def setCheckedChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "checkedChanged", value.asInstanceOf[js.Any])
    
    inline def setClick(value: ButtonClickEventArgs): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setGotFocus(value: EventArgs): Self = StObject.set(x, "gotFocus", value.asInstanceOf[js.Any])
    
    inline def setLostFocus(value: EventArgs): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
  }
}
