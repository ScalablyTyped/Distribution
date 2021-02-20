package typings.gestalt.mod

import typings.gestalt.anon.OnDismissStart
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetProps extends StObject {
  
  var accessibilityDismissButtonLabel: String = js.native
  
  var accessibilitySheetLabel: String = js.native
  
  var children: js.UndefOr[SheetNodeOrRenderProp] = js.native
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[SheetNodeOrRenderProp] = js.native
  
  var heading: js.UndefOr[String] = js.native
  
  def onDismiss(): Unit = js.native
  
  var size: js.UndefOr[sm | md | lg] = js.native
  
  var subHeading: js.UndefOr[SheetNodeOrRenderProp] = js.native
}
object SheetProps {
  
  @scala.inline
  def apply(accessibilityDismissButtonLabel: String, accessibilitySheetLabel: String, onDismiss: () => Unit): SheetProps = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], accessibilitySheetLabel = accessibilitySheetLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[SheetProps]
  }
  
  @scala.inline
  implicit class SheetPropsMutableBuilder[Self <: SheetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilitySheetLabel(value: String): Self = StObject.set(x, "accessibilitySheetLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: SheetNodeOrRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setFooter(value: SheetNodeOrRenderProp): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubHeading(value: SheetNodeOrRenderProp): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeadingFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = StObject.set(x, "subHeading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
  }
}
