package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxForm.FormItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormEmptyItem extends StObject {
  
  /**
    * Specifies the number of columns spanned by the item.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the form item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the item&apos;s type. Set it to &apos;empty&apos; to create an empty item.
    */
  var itemType: js.UndefOr[FormItemType] = js.undefined
  
  /**
    * Specifies a name that identifies the form item.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the current form item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the sequence number of the item in a form, group or tab.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object dxFormEmptyItem {
  
  inline def apply(): dxFormEmptyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormEmptyItem]
  }
  
  extension [Self <: dxFormEmptyItem](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setItemType(value: FormItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
