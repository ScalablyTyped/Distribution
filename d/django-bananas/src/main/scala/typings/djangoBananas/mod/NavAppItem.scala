package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavAppItem extends StObject {
  
  var showSubheader: js.UndefOr[Boolean] = js.undefined
}
object NavAppItem {
  
  inline def apply(): NavAppItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavAppItem]
  }
  
  extension [Self <: NavAppItem](x: Self) {
    
    inline def setShowSubheader(value: Boolean): Self = StObject.set(x, "showSubheader", value.asInstanceOf[js.Any])
    
    inline def setShowSubheaderUndefined: Self = StObject.set(x, "showSubheader", js.undefined)
  }
}
