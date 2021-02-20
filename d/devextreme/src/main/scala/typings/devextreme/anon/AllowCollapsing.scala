package typings.devextreme.anon

import typings.devextreme.devextremeStrings.buttonClick
import typings.devextreme.devextremeStrings.rowClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowCollapsing extends StObject {
  
  var allowCollapsing: js.UndefOr[Boolean] = js.native
  
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  
  var contextMenuEnabled: js.UndefOr[Boolean] = js.native
  
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.native
  
  var texts: js.UndefOr[GroupByThisColumn] = js.native
}
object AllowCollapsing {
  
  @scala.inline
  def apply(): AllowCollapsing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowCollapsing]
  }
  
  @scala.inline
  implicit class AllowCollapsingMutableBuilder[Self <: AllowCollapsing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCollapsing(value: Boolean): Self = StObject.set(x, "allowCollapsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCollapsingUndefined: Self = StObject.set(x, "allowCollapsing", js.undefined)
    
    @scala.inline
    def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
    
    @scala.inline
    def setContextMenuEnabled(value: Boolean): Self = StObject.set(x, "contextMenuEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuEnabledUndefined: Self = StObject.set(x, "contextMenuEnabled", js.undefined)
    
    @scala.inline
    def setExpandMode(value: buttonClick | rowClick): Self = StObject.set(x, "expandMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandModeUndefined: Self = StObject.set(x, "expandMode", js.undefined)
    
    @scala.inline
    def setTexts(value: GroupByThisColumn): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
