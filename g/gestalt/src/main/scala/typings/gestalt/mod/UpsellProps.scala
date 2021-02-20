package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsellProps extends StObject {
  
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
  implicit class UpsellPropsMutableBuilder[Self <: UpsellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLink(value: LinkData): Self = StObject.set(x, "primaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLinkUndefined: Self = StObject.set(x, "primaryLink", js.undefined)
    
    @scala.inline
    def setSecondaryLink(value: LinkData): Self = StObject.set(x, "secondaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLinkUndefined: Self = StObject.set(x, "secondaryLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
