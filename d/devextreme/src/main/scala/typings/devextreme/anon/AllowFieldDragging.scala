package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowFieldDragging extends StObject {
  
  var allowFieldDragging: js.UndefOr[Boolean] = js.undefined
  
  var showColumnFields: js.UndefOr[Boolean] = js.undefined
  
  var showDataFields: js.UndefOr[Boolean] = js.undefined
  
  var showFilterFields: js.UndefOr[Boolean] = js.undefined
  
  var showRowFields: js.UndefOr[Boolean] = js.undefined
  
  var texts: js.UndefOr[ColumnFieldArea] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AllowFieldDragging {
  
  @scala.inline
  def apply(): AllowFieldDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowFieldDragging]
  }
  
  @scala.inline
  implicit class AllowFieldDraggingMutableBuilder[Self <: AllowFieldDragging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFieldDragging(value: Boolean): Self = StObject.set(x, "allowFieldDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFieldDraggingUndefined: Self = StObject.set(x, "allowFieldDragging", js.undefined)
    
    @scala.inline
    def setShowColumnFields(value: Boolean): Self = StObject.set(x, "showColumnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnFieldsUndefined: Self = StObject.set(x, "showColumnFields", js.undefined)
    
    @scala.inline
    def setShowDataFields(value: Boolean): Self = StObject.set(x, "showDataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDataFieldsUndefined: Self = StObject.set(x, "showDataFields", js.undefined)
    
    @scala.inline
    def setShowFilterFields(value: Boolean): Self = StObject.set(x, "showFilterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilterFieldsUndefined: Self = StObject.set(x, "showFilterFields", js.undefined)
    
    @scala.inline
    def setShowRowFields(value: Boolean): Self = StObject.set(x, "showRowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowFieldsUndefined: Self = StObject.set(x, "showRowFields", js.undefined)
    
    @scala.inline
    def setTexts(value: ColumnFieldArea): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
