package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.ui.dxDrawer.OpenedStateMode
import typings.devextreme.mod.DevExpress.ui.dxDrawer.PanelLocation
import typings.devextreme.mod.DevExpress.ui.dxDrawer.RevealMode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDrawerOptions
  extends StObject
     with WidgetOptions[dxDrawer] {
  
  /**
    * Specifies the duration of the drawer&apos;s opening and closing animation (in milliseconds). Applies only if animationEnabled is true.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to use an opening and closing animation.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to close the drawer if a user clicks or taps the view area.
    */
  var closeOnOutsideClick: js.UndefOr[
    Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
  ] = js.undefined
  
  /**
    * Specifies the drawer&apos;s width or height (depending on the drawer&apos;s position) in the opened state.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the drawer&apos;s width or height (depending on the drawer&apos;s position) in the closed state.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the drawer is opened.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the drawer interacts with the view in the opened state.
    */
  var openedStateMode: js.UndefOr[OpenedStateMode] = js.undefined
  
  /**
    * Specifies the drawer&apos;s position in relation to the view.
    */
  var position: js.UndefOr[PanelLocation] = js.undefined
  
  /**
    * Specifies the drawer&apos;s reveal mode.
    */
  var revealMode: js.UndefOr[RevealMode] = js.undefined
  
  /**
    * Specifies whether to shade the view when the drawer is opened.
    */
  var shading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a CSS selector for the element in which the drawer should be rendered. Applies only when the openedStateMode is &apos;overlap&apos;.
    * @deprecated 
    */
  var target: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies the drawer&apos;s content.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ DxElement_[HTMLElement], Any])
  ] = js.undefined
}
object dxDrawerOptions {
  
  inline def apply(): dxDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDrawerOptions]
  }
  
  extension [Self <: dxDrawerOptions](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setCloseOnOutsideClick(
      value: Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
    ): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickFunction1(value: /* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent] => Boolean): Self = StObject.set(x, "closeOnOutsideClick", js.Any.fromFunction1(value))
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedStateMode(value: OpenedStateMode): Self = StObject.set(x, "openedStateMode", value.asInstanceOf[js.Any])
    
    inline def setOpenedStateModeUndefined: Self = StObject.set(x, "openedStateMode", js.undefined)
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPosition(value: PanelLocation): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRevealMode(value: RevealMode): Self = StObject.set(x, "revealMode", value.asInstanceOf[js.Any])
    
    inline def setRevealModeUndefined: Self = StObject.set(x, "revealMode", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setTarget(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTemplate(value: template | (js.Function1[/* Element */ DxElement_[HTMLElement], Any])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction1(value: /* Element */ DxElement_[HTMLElement] => Any): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
