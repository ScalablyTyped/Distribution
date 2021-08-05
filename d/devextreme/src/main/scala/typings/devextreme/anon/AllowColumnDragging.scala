package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowColumnDragging extends StObject {
  
  var allowColumnDragging: js.UndefOr[Boolean] = js.undefined
  
  var emptyPanelText: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean | auto] = js.undefined
}
object AllowColumnDragging {
  
  inline def apply(): AllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowColumnDragging]
  }
  
  extension [Self <: AllowColumnDragging](x: Self) {
    
    inline def setAllowColumnDragging(value: Boolean): Self = StObject.set(x, "allowColumnDragging", value.asInstanceOf[js.Any])
    
    inline def setAllowColumnDraggingUndefined: Self = StObject.set(x, "allowColumnDragging", js.undefined)
    
    inline def setEmptyPanelText(value: String): Self = StObject.set(x, "emptyPanelText", value.asInstanceOf[js.Any])
    
    inline def setEmptyPanelTextUndefined: Self = StObject.set(x, "emptyPanelText", js.undefined)
    
    inline def setVisible(value: Boolean | auto): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
