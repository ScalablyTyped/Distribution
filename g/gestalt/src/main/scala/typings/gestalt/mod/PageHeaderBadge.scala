package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderBadge extends StObject {
  
  var text: String
  
  var tooltipText: js.UndefOr[String] = js.undefined
}
object PageHeaderBadge {
  
  inline def apply(text: String): PageHeaderBadge = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderBadge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageHeaderBadge] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
    
    inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
  }
}
