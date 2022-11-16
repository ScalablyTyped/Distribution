package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxMultiView.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxMultiView.MultiViewInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type dxMultiViewOptions = devextreme.devextreme.DevExpress.ui.dxMultiView.Properties<TItem, TKey>
}}}
to avoid circular code involving: 
- devextreme.devextreme.DevExpress.ui.dxMultiView.MultiViewInstance
- devextreme.devextreme.DevExpress.ui.dxMultiView.Properties
- devextreme.devextreme.DevExpress.ui.dxMultiViewOptions
*/
trait dxMultiViewOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with dxMultiViewBaseOptions[MultiViewInstance[TItem, TKey], TItem, TKey]
object dxMultiViewOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxMultiViewOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMultiViewOptions[TItem, TKey]]
  }
}
