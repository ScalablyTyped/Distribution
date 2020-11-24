package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutProps extends js.Object {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.native
  
  var iconAccessibilityLabel: String = js.native
  
  var message: String = js.native
  
  var primaryLink: js.UndefOr[LinkData] = js.native
  
  var secondaryLink: js.UndefOr[LinkData] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: error | info | warning = js.native
}
object CalloutProps {
  
  @scala.inline
  def apply(iconAccessibilityLabel: String, message: String, `type`: error | info | warning): CalloutProps = {
    val __obj = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  @scala.inline
  implicit class CalloutPropsOps[Self <: CalloutProps] (val x: Self) extends AnyVal {
    
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
    def setIconAccessibilityLabel(value: String): Self = this.set("iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error | info | warning): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissButton(value: AccessibilityLabel): Self = this.set("dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissButton: Self = this.set("dismissButton", js.undefined)
    
    @scala.inline
    def setPrimaryLink(value: LinkData): Self = this.set("primaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryLink: Self = this.set("primaryLink", js.undefined)
    
    @scala.inline
    def setSecondaryLink(value: LinkData): Self = this.set("secondaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryLink: Self = this.set("secondaryLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
