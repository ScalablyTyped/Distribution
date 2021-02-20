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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItemLabels extends StObject {
  
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  
  var badge: js.UndefOr[String] = js.native
  
  var colCount: js.UndefOr[Double] = js.native
  
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  
  var tabTemplate: js.UndefOr[
    template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AlignItemLabels {
  
  @scala.inline
  def apply(): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemLabels]
  }
  
  @scala.inline
  implicit class AlignItemLabelsMutableBuilder[Self <: AlignItemLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItemLabels(value: Boolean): Self = StObject.set(x, "alignItemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemLabelsUndefined: Self = StObject.set(x, "alignItemLabels", js.undefined)
    
    @scala.inline
    def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColCountByScreen(value: js.Any): Self = StObject.set(x, "colCountByScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColCountByScreenUndefined: Self = StObject.set(x, "colCountByScreen", js.undefined)
    
    @scala.inline
    def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(
      value: (dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem)*
    ): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTabTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
    ): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = StObject.set(x, "tabTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
    
    @scala.inline
    def setTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
