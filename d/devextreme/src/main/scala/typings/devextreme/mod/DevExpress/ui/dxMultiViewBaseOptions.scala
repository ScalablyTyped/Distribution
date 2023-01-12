package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxMultiView.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxMultiViewBaseOptions[TComponent /* <: dxMultiView[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[TComponent, TItem, TKey] {
  
  /**
    * Specifies whether or not to animate the displayed item change.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to render the view&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to scroll back to the first item after the last item is swiped.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to allow users to change the selected index by swiping.
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}
object dxMultiViewBaseOptions {
  
  inline def apply[TComponent /* <: dxMultiView[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey](): dxMultiViewBaseOptions[TComponent, TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMultiViewBaseOptions[TComponent, TItem, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxMultiViewBaseOptions[?, ?, ?], TComponent /* <: dxMultiView[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey] (val x: Self & (dxMultiViewBaseOptions[TComponent, TItem, TKey])) extends AnyVal {
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
  }
}
