package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.ScrollbarMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollingBase extends StObject {
  
  /**
    * Specifies the rendering mode for columns. Applies when columns are left outside the viewport. Requires the columnWidth, columnAutoWidth, or width (for all columns) property specified.
    */
  var columnRenderingMode: js.UndefOr[DataRenderMode] = js.undefined
  
  /**
    * Specifies whether the UI component should load adjacent pages. Applies only if scrolling.mode is &apos;virtual&apos; or &apos;infinite&apos;.
    */
  var preloadEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to render rows after a user stops scrolling or at the same time as the user scrolls the widget.
    */
  var renderAsync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rendering mode for loaded rows.
    */
  var rowRenderingMode: js.UndefOr[DataRenderMode] = js.undefined
  
  /**
    * Specifies whether a user can scroll the content with a swipe gesture. Applies only if useNative is false.
    */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can scroll the content with the scrollbar. Applies only if useNative is false.
    */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when to show scrollbars. Applies only if useNative is false.
    */
  var showScrollbar: js.UndefOr[ScrollbarMode] = js.undefined
  
  /**
    * Specifies whether the widget should use native or simulated scrolling.
    */
  var useNative: js.UndefOr[Boolean | Mode] = js.undefined
}
object ScrollingBase {
  
  inline def apply(): ScrollingBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollingBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollingBase] (val x: Self) extends AnyVal {
    
    inline def setColumnRenderingMode(value: DataRenderMode): Self = StObject.set(x, "columnRenderingMode", value.asInstanceOf[js.Any])
    
    inline def setColumnRenderingModeUndefined: Self = StObject.set(x, "columnRenderingMode", js.undefined)
    
    inline def setPreloadEnabled(value: Boolean): Self = StObject.set(x, "preloadEnabled", value.asInstanceOf[js.Any])
    
    inline def setPreloadEnabledUndefined: Self = StObject.set(x, "preloadEnabled", js.undefined)
    
    inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
    
    inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
    
    inline def setRowRenderingMode(value: DataRenderMode): Self = StObject.set(x, "rowRenderingMode", value.asInstanceOf[js.Any])
    
    inline def setRowRenderingModeUndefined: Self = StObject.set(x, "rowRenderingMode", js.undefined)
    
    inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
    
    inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
    
    inline def setScrollByThumb(value: Boolean): Self = StObject.set(x, "scrollByThumb", value.asInstanceOf[js.Any])
    
    inline def setScrollByThumbUndefined: Self = StObject.set(x, "scrollByThumb", js.undefined)
    
    inline def setShowScrollbar(value: ScrollbarMode): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowScrollbarUndefined: Self = StObject.set(x, "showScrollbar", js.undefined)
    
    inline def setUseNative(value: Boolean | Mode): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
