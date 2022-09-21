package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod.DevExpress.common.ScrollDirection
import typings.devextreme.mod.DevExpress.ui.dxScrollable.ScrollEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxScrollableOptions[TComponent]
  extends StObject
     with DOMComponentOptions[TComponent] {
  
  /**
    * A Boolean value specifying whether to enable or disable the bounce-back effect.
    */
  var bounceEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string value specifying the available scrolling directions.
    */
  var direction: js.UndefOr[ScrollDirection] = js.undefined
  
  /**
    * Specifies whether the UI component responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed on each scroll gesture.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ScrollEventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed each time the UI component is updated.
    */
  var onUpdated: js.UndefOr[js.Function1[/* e */ ScrollEventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A Boolean value specifying whether or not an end-user can scroll the UI component content swiping it up or down. Applies only if useNative is false
    */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can scroll the content with the scrollbar. Applies only if useNative is false.
    */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when the UI component shows the scrollbar.
    */
  var showScrollbar: js.UndefOr[onScroll | onHover | always | never] = js.undefined
  
  /**
    * Indicates whether to use native or simulated scrolling.
    */
  var useNative: js.UndefOr[Boolean] = js.undefined
}
object dxScrollableOptions {
  
  inline def apply[TComponent](): dxScrollableOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollableOptions[TComponent]]
  }
  
  extension [Self <: dxScrollableOptions[?], TComponent](x: Self & dxScrollableOptions[TComponent]) {
    
    inline def setBounceEnabled(value: Boolean): Self = StObject.set(x, "bounceEnabled", value.asInstanceOf[js.Any])
    
    inline def setBounceEnabledUndefined: Self = StObject.set(x, "bounceEnabled", js.undefined)
    
    inline def setDirection(value: ScrollDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnScroll(value: /* e */ ScrollEventInfo[TComponent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnUpdated(value: /* e */ ScrollEventInfo[TComponent] => Unit): Self = StObject.set(x, "onUpdated", js.Any.fromFunction1(value))
    
    inline def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
    
    inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
    
    inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
    
    inline def setScrollByThumb(value: Boolean): Self = StObject.set(x, "scrollByThumb", value.asInstanceOf[js.Any])
    
    inline def setScrollByThumbUndefined: Self = StObject.set(x, "scrollByThumb", js.undefined)
    
    inline def setShowScrollbar(value: onScroll | onHover | always | never): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowScrollbarUndefined: Self = StObject.set(x, "showScrollbar", js.undefined)
    
    inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
