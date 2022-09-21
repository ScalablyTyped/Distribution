package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowPanel extends StObject {
  
  /**
    * Specifies whether to show the progress panel.
    */
  var showPanel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the pop-up notification window.
    */
  var showPopup: js.UndefOr[Boolean] = js.undefined
}
object ShowPanel {
  
  inline def apply(): ShowPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowPanel]
  }
  
  extension [Self <: ShowPanel](x: Self) {
    
    inline def setShowPanel(value: Boolean): Self = StObject.set(x, "showPanel", value.asInstanceOf[js.Any])
    
    inline def setShowPanelUndefined: Self = StObject.set(x, "showPanel", js.undefined)
    
    inline def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    inline def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
  }
}
