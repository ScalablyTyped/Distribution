package typings.djangoBananas.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavItem extends StObject {
  
  var icon: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object NavItem {
  
  inline def apply(): NavItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavItem]
  }
  
  extension [Self <: NavItem](x: Self) {
    
    inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
