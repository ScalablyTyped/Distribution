package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxTabs.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxTabs.TabsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type dxTabsOptions = devextreme.devextreme.DevExpress.ui.dxTabs.Properties<TItem, TKey>
}}}
to avoid circular code involving: 
- devextreme.devextreme.DevExpress.ui.dxTabs.Properties
- devextreme.devextreme.DevExpress.ui.dxTabs.TabsInstance
- devextreme.devextreme.DevExpress.ui.dxTabsOptions
*/
trait dxTabsOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with dxTabsBaseOptions[TabsInstance[TItem, TKey], TItem, TKey]
object dxTabsOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxTabsOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabsOptions[TItem, TKey]]
  }
}
