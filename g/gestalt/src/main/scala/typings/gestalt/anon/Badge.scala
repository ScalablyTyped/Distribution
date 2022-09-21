package typings.gestalt.anon

import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.mod.BadgeObject
import typings.gestalt.mod.Icons
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var iconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var iconButton: js.UndefOr[ReactElement] = js.undefined
  
  var summary: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: String
  
  var `type`: js.UndefOr[info | error] = js.undefined
}
object Badge {
  
  inline def apply(title: String): Badge = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  extension [Self <: Badge](x: Self) {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabelUndefined: Self = StObject.set(x, "iconAccessibilityLabel", js.undefined)
    
    inline def setIconButton(value: ReactElement): Self = StObject.set(x, "iconButton", value.asInstanceOf[js.Any])
    
    inline def setIconButtonUndefined: Self = StObject.set(x, "iconButton", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSummary(value: js.Array[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSummaryVarargs(value: String*): Self = StObject.set(x, "summary", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: info | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
