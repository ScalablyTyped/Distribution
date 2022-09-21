package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blank
import typings.gestalt.gestaltStrings.self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnNavigationArgs extends StObject {
  
  var href: String
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object OnNavigationArgs {
  
  inline def apply(href: String): OnNavigationArgs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnNavigationArgs]
  }
  
  extension [Self <: OnNavigationArgs](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
