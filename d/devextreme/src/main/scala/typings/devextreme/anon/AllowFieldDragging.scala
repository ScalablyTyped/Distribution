package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowFieldDragging extends StObject {
  
  var allowFieldDragging: js.UndefOr[Boolean] = js.native
  
  var showColumnFields: js.UndefOr[Boolean] = js.native
  
  var showDataFields: js.UndefOr[Boolean] = js.native
  
  var showFilterFields: js.UndefOr[Boolean] = js.native
  
  var showRowFields: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[ColumnFieldArea] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
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
