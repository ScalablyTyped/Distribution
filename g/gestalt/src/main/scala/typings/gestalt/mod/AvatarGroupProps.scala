package typings.gestalt.mod

import typings.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.Name
import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.fit
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarGroupProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: String
  
  var addCollaborators: js.UndefOr[Boolean] = js.undefined
  
  var collaborators: js.Array[Name]
  
  var href: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[OnTapType] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | fit] = js.undefined
}
object AvatarGroupProps {
  
  inline def apply(accessibilityLabel: String, collaborators: js.Array[Name]): AvatarGroupProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvatarGroupProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAddCollaborators(value: Boolean): Self = StObject.set(x, "addCollaborators", value.asInstanceOf[js.Any])
    
    inline def setAddCollaboratorsUndefined: Self = StObject.set(x, "addCollaborators", js.undefined)
    
    inline def setCollaborators(value: js.Array[Name]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsVarargs(value: Name*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: xs | sm | md | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
