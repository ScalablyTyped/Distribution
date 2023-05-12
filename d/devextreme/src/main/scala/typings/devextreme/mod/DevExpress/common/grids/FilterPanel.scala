package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPanel[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
  
  /**
    * Customizes the filter expression&apos;s text representation.
    */
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterPanelCustomizeTextArg[TComponent], String]] = js.undefined
  
  /**
    * Specifies whether the filter expression is applied.
    */
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies texts for the filter panel&apos;s elements.
    */
  var texts: js.UndefOr[FilterPanelTexts] = js.undefined
  
  /**
    * Specifies whether the filter panel is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object FilterPanel {
  
  inline def apply[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): FilterPanel[TComponent, TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPanel[TComponent, TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterPanel[?, ?, ?], TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (FilterPanel[TComponent, TRowData, TKey])) extends AnyVal {
    
    inline def setCustomizeText(value: /* e */ FilterPanelCustomizeTextArg[TComponent] => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    inline def setTexts(value: FilterPanelTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
