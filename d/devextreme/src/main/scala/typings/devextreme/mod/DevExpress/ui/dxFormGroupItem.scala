package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxForm.FormItemType
import typings.devextreme.mod.DevExpress.ui.dxForm.GroupItemTemplateData
import typings.devextreme.mod.DevExpress.ui.dxForm.Item
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormGroupItem extends StObject {
  
  /**
    * Specifies whether or not all group item labels are aligned.
    */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the group caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * The count of columns in the group layout.
    */
  var colCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the relation between the screen size qualifier and the number of columns in the grouped layout.
    */
  var colCountByScreen: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the number of columns spanned by the item.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the form item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the item&apos;s type. Set it to &apos;group&apos; to create a group item.
    */
  var itemType: js.UndefOr[FormItemType] = js.undefined
  
  /**
    * Holds an array of form items displayed within the group.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /**
    * Specifies a name that identifies the form item.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A template to be used for rendering a group item.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ GroupItemTemplateData, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether or not the current form item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the sequence number of the item in a form, group or tab.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object dxFormGroupItem {
  
  inline def apply(): dxFormGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormGroupItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxFormGroupItem] (val x: Self) extends AnyVal {
    
    inline def setAlignItemLabels(value: Boolean): Self = StObject.set(x, "alignItemLabels", value.asInstanceOf[js.Any])
    
    inline def setAlignItemLabelsUndefined: Self = StObject.set(x, "alignItemLabels", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreen(value: Any): Self = StObject.set(x, "colCountByScreen", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreenUndefined: Self = StObject.set(x, "colCountByScreen", js.undefined)
    
    inline def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setItemType(value: FormItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* data */ GroupItemTemplateData, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* data */ GroupItemTemplateData, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
