package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderBadge extends StObject {
  
  var title: String
  
  var tootipText: js.UndefOr[String] = js.undefined
}
object PageHeaderBadge {
  
  inline def apply(title: String): PageHeaderBadge = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderBadge]
  }
  
  extension [Self <: PageHeaderBadge](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTootipText(value: String): Self = StObject.set(x, "tootipText", value.asInstanceOf[js.Any])
    
    inline def setTootipTextUndefined: Self = StObject.set(x, "tootipText", js.undefined)
  }
}
