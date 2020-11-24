package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsellProps extends js.Object {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.native
  
  var message: String = js.native
  
  var primaryLink: js.UndefOr[LinkData] = js.native
  
  var secondaryLink: js.UndefOr[LinkData] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object UpsellProps {
  
  @scala.inline
  def apply(message: String): UpsellProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellProps]
  }
  
  @scala.inline
  implicit class UpsellPropsOps[Self <: UpsellProps] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
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
