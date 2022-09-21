package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AlignItemLabels
import typings.devextreme.mod.DevExpress.ui.dxForm.FormItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormTabbedItem extends StObject {
  
  /**
    * Specifies the number of columns spanned by the item.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the form item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the item&apos;s type. Set it to &apos;tabbed&apos; to create a tabbed item.
    */
  var itemType: js.UndefOr[FormItemType] = js.undefined
  
  /**
    * Specifies a name that identifies the form item.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Holds a configuration object for the TabPanel UI component used to display the current form item.
    */
  var tabPanelOptions: js.UndefOr[dxTabPanelOptions[Any, Any]] = js.undefined
  
  /**
    * An array of tab configuration objects.
    */
  var tabs: js.UndefOr[js.Array[AlignItemLabels]] = js.undefined
  
  /**
    * Specifies whether or not the current form item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the sequence number of the item in a form, group or tab.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object dxFormTabbedItem {
  
  inline def apply(): dxFormTabbedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormTabbedItem]
  }
  
  extension [Self <: dxFormTabbedItem](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setItemType(value: FormItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTabPanelOptions(value: dxTabPanelOptions[Any, Any]): Self = StObject.set(x, "tabPanelOptions", value.asInstanceOf[js.Any])
    
    inline def setTabPanelOptionsUndefined: Self = StObject.set(x, "tabPanelOptions", js.undefined)
    
    inline def setTabs(value: js.Array[AlignItemLabels]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: AlignItemLabels*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
