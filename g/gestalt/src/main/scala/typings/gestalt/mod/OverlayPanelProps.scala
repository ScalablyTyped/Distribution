package typings.gestalt.mod

import typings.gestalt.anon.AnimationState
import typings.gestalt.anon.Message
import typings.gestalt.anon.OnDismissStart
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayPanelProps extends StObject {
  
  var accessibilityDismissButtonLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabel: String
  
  var children: js.UndefOr[NodeOrRenderProp] = js.undefined
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  
  var dismissConfirmation: js.UndefOr[Message] = js.undefined
  
  var footer: js.UndefOr[NodeOrRenderProp] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var onAnimationEnd: js.UndefOr[OnAnimationEndType] = js.undefined
  
  def onDismiss(): Unit
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var subHeading: js.UndefOr[NodeOrRenderProp] = js.undefined
}
object OverlayPanelProps {
  
  inline def apply(accessibilityLabel: String, onDismiss: () => Unit): OverlayPanelProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[OverlayPanelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayPanelProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityDismissButtonLabelUndefined: Self = StObject.set(x, "accessibilityDismissButtonLabel", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: NodeOrRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setDismissConfirmation(value: Message): Self = StObject.set(x, "dismissConfirmation", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationUndefined: Self = StObject.set(x, "dismissConfirmation", js.undefined)
    
    inline def setFooter(value: NodeOrRenderProp): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setOnAnimationEnd(value: /* args */ AnimationState => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: NodeOrRenderProp): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "subHeading", js.Any.fromFunction1(value))
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
  }
}
