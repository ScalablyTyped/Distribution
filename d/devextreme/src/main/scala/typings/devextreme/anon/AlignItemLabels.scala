package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFormButtonItem
import typings.devextreme.mod.DevExpress.ui.dxFormEmptyItem
import typings.devextreme.mod.DevExpress.ui.dxFormGroupItem
import typings.devextreme.mod.DevExpress.ui.dxFormSimpleItem
import typings.devextreme.mod.DevExpress.ui.dxFormTabbedItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemLabels extends StObject {
  
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  
  var badge: js.UndefOr[String] = js.undefined
  
  var colCount: js.UndefOr[Double] = js.undefined
  
  var colCountByScreen: js.UndefOr[js.Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.undefined
  
  var tabTemplate: js.UndefOr[
    template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, js.Any])
  ] = js.undefined
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, js.Any])
  ] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object AlignItemLabels {
  
  inline def apply(): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemLabels]
  }
  
  extension [Self <: AlignItemLabels](x: Self) {
    
    inline def setAlignItemLabels(value: Boolean): Self = StObject.set(x, "alignItemLabels", value.asInstanceOf[js.Any])
    
    inline def setAlignItemLabelsUndefined: Self = StObject.set(x, "alignItemLabels", js.undefined)
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreen(value: js.Any): Self = StObject.set(x, "colCountByScreen", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreenUndefined: Self = StObject.set(x, "colCountByScreen", js.undefined)
    
    inline def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem)*
    ): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTabTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, js.Any])
    ): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
    
    inline def setTabTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => js.Any): Self = StObject.set(x, "tabTemplate", js.Any.fromFunction3(value))
    
    inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, js.Any])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => js.Any): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
