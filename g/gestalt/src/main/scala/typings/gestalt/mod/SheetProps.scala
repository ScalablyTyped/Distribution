package typings.gestalt.mod

import typings.gestalt.anon.OnDismissStart
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetProps extends js.Object {
  
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
  implicit class SheetPropsOps[Self <: SheetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityDismissButtonLabel(value: String): Self = this.set("accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilitySheetLabel(value: String): Self = this.set("accessibilitySheetLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildrenFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: SheetNodeOrRenderProp): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setFooterFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFooter(value: SheetNodeOrRenderProp): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSubHeadingFunction1(value: /* prop */ OnDismissStart => ReactNode): Self = this.set("subHeading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubHeading(value: SheetNodeOrRenderProp): Self = this.set("subHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubHeading: Self = this.set("subHeading", js.undefined)
  }
}
