package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.ui.WidgetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
  */
trait GridBaseOptionsBlank[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey]
  extends StObject
     with WidgetOptions[TComponent] {
  
  /**
    * 
    */
  @JSName("focusStateEnabled")
  var focusStateEnabled_GridBaseOptionsBlank: js.UndefOr[Any] = js.undefined
}
object GridBaseOptionsBlank {
  
  inline def apply[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): GridBaseOptionsBlank[TComponent, TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseOptionsBlank[TComponent, TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridBaseOptionsBlank[?, ?, ?], TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (GridBaseOptionsBlank[TComponent, TRowData, TKey])) extends AnyVal {
    
    inline def setFocusStateEnabled(value: Any): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
  }
}
