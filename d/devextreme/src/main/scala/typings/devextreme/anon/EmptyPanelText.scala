package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dragAndDrop
import typings.devextreme.devextremeStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyPanelText extends StObject {
  
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  var emptyPanelText: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[dragAndDrop | select] = js.undefined
  
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object EmptyPanelText {
  
  @scala.inline
  def apply(): EmptyPanelText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmptyPanelText]
  }
  
  @scala.inline
  implicit class EmptyPanelTextMutableBuilder[Self <: EmptyPanelText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    @scala.inline
    def setEmptyPanelText(value: String): Self = StObject.set(x, "emptyPanelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyPanelTextUndefined: Self = StObject.set(x, "emptyPanelText", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMode(value: dragAndDrop | select): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
