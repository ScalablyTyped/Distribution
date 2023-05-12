package typings.gestalt.mod

import typings.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.ExternalLinkIcon
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelpButtonProps extends StObject {
  
  var accessibilityLabel: String
  
  var accessibilityPopoverLabel: String
  
  var idealDirection: js.UndefOr[IdealDirectionType] = js.undefined
  
  var isWithinFixedContainer: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[ExternalLinkIcon] = js.undefined
  
  var onClick: js.UndefOr[TapAreaEventHandlerType] = js.undefined
  
  var text: String | ReactElement
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object HelpButtonProps {
  
  inline def apply(accessibilityLabel: String, accessibilityPopoverLabel: String, text: String | ReactElement): HelpButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], accessibilityPopoverLabel = accessibilityPopoverLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelpButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HelpButtonProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPopoverLabel(value: String): Self = StObject.set(x, "accessibilityPopoverLabel", value.asInstanceOf[js.Any])
    
    inline def setIdealDirection(value: IdealDirectionType): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setIsWithinFixedContainer(value: Boolean): Self = StObject.set(x, "isWithinFixedContainer", value.asInstanceOf[js.Any])
    
    inline def setIsWithinFixedContainerUndefined: Self = StObject.set(x, "isWithinFixedContainer", js.undefined)
    
    inline def setLink(value: ExternalLinkIcon): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String | ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
