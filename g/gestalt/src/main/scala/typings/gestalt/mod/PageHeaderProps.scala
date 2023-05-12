package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityControls
import typings.gestalt.anon.AccessibilityLabelHref
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderProps extends StObject {
  
  var badge: js.UndefOr[typings.gestalt.anon.Text] = js.undefined
  
  var borderStyle: js.UndefOr[sm | none] = js.undefined
  
  var dropdownAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var helperIconButton: js.UndefOr[AccessibilityControls] = js.undefined
  
  var helperLink: js.UndefOr[AccessibilityLabelHref] = js.undefined
  
  var items: js.UndefOr[js.Array[Node]] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var primaryAction: js.UndefOr[PageHeaderAction] = js.undefined
  
  var secondaryAction: js.UndefOr[PageHeaderAction] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var thumbnail: js.UndefOr[ReactElement] = js.undefined
  
  var title: String
}
object PageHeaderProps {
  
  inline def apply(title: String): PageHeaderProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: typings.gestalt.anon.Text): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBorderStyle(value: sm | none): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setDropdownAccessibilityLabel(value: String): Self = StObject.set(x, "dropdownAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setDropdownAccessibilityLabelUndefined: Self = StObject.set(x, "dropdownAccessibilityLabel", js.undefined)
    
    inline def setHelperIconButton(value: AccessibilityControls): Self = StObject.set(x, "helperIconButton", value.asInstanceOf[js.Any])
    
    inline def setHelperIconButtonUndefined: Self = StObject.set(x, "helperIconButton", js.undefined)
    
    inline def setHelperLink(value: AccessibilityLabelHref): Self = StObject.set(x, "helperLink", value.asInstanceOf[js.Any])
    
    inline def setHelperLinkUndefined: Self = StObject.set(x, "helperLink", js.undefined)
    
    inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPrimaryAction(value: PageHeaderAction): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setSecondaryAction(value: PageHeaderAction): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
    
    inline def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    inline def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    inline def setThumbnail(value: ReactElement): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
