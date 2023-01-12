package typings.gestalt.mod

import typings.gestalt.anon.AnimationState
import typings.gestalt.anon.OnDismissStart
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetProps extends StObject {
  
  var accessibilityDismissButtonLabel: String
  
  var accessibilitySheetLabel: String
  
  var children: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* args */ AnimationState, Unit]] = js.undefined
  
  def onDismiss(): Unit
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var subHeading: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
}
object SheetProps {
  
  inline def apply(accessibilityDismissButtonLabel: String, accessibilitySheetLabel: String, onDismiss: () => Unit): SheetProps = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], accessibilitySheetLabel = accessibilitySheetLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[SheetProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilitySheetLabel(value: String): Self = StObject.set(x, "accessibilitySheetLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: SheetNodeOrRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setFooter(value: SheetNodeOrRenderProp): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setOnAnimationEnd(value: /* args */ AnimationState => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: SheetNodeOrRenderProp): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "subHeading", js.Any.fromFunction1(value))
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
  }
}
