package typings.gestalt.mod

import typings.gestalt.anon.OnDismiss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationProps extends StObject {
  
  var accessibilityLabel: String
  
  var children: Node
  
  var dismissButton: js.UndefOr[OnDismiss] = js.undefined
  
  var footer: js.UndefOr[Node] = js.undefined
  
  var header: js.UndefOr[Node] = js.undefined
  
  var showBorder: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object SideNavigationProps {
  
  inline def apply(accessibilityLabel: String): SideNavigationProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDismissButton(value: OnDismiss): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setFooter(value: Node): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: Node): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
