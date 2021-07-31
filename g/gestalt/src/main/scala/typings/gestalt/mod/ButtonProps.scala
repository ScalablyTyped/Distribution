package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltNumbers.`-1`
import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltStrings.blank
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.nofollow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.self
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.submit
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.transparentWhiteText
import typings.gestalt.gestaltStrings.white
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[gray | red | blue | transparent | transparentWhiteText | white] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var iconEnd: js.UndefOr[Icons] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      js.Object
    ]
  ] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
  
  var text: String
  
  var `type`: js.UndefOr[submit | button] = js.undefined
}
object ButtonProps {
  
  @scala.inline
  def apply(text: String): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setColor(value: gray | red | blue | transparent | transparentWhiteText | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIconEnd(value: Icons): Self = StObject.set(x, "iconEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconEndUndefined: Self = StObject.set(x, "iconEnd", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: submit | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
