package typings.devextreme.anon

import typings.devextreme.devextremeStrings.buttonClick
import typings.devextreme.devextremeStrings.rowClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowCollapsing extends StObject {
  
  var allowCollapsing: js.UndefOr[Boolean] = js.undefined
  
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  
  var contextMenuEnabled: js.UndefOr[Boolean] = js.undefined
  
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.undefined
  
  var texts: js.UndefOr[GroupByThisColumn] = js.undefined
}
object AllowCollapsing {
  
  inline def apply(): AllowCollapsing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowCollapsing]
  }
  
  extension [Self <: AllowCollapsing](x: Self) {
    
    inline def setAllowCollapsing(value: Boolean): Self = StObject.set(x, "allowCollapsing", value.asInstanceOf[js.Any])
    
    inline def setAllowCollapsingUndefined: Self = StObject.set(x, "allowCollapsing", js.undefined)
    
    inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
    
    inline def setContextMenuEnabled(value: Boolean): Self = StObject.set(x, "contextMenuEnabled", value.asInstanceOf[js.Any])
    
    inline def setContextMenuEnabledUndefined: Self = StObject.set(x, "contextMenuEnabled", js.undefined)
    
    inline def setExpandMode(value: buttonClick | rowClick): Self = StObject.set(x, "expandMode", value.asInstanceOf[js.Any])
    
    inline def setExpandModeUndefined: Self = StObject.set(x, "expandMode", js.undefined)
    
    inline def setTexts(value: GroupByThisColumn): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
