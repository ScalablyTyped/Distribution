package typings.googleVisualization.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHtmlBoolean extends StObject {
  
  var isHtml: Boolean
}
object IsHtmlBoolean {
  
  inline def apply(isHtml: Boolean): IsHtmlBoolean = {
    val __obj = js.Dynamic.literal(isHtml = isHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHtmlBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsHtmlBoolean] (val x: Self) extends AnyVal {
    
    inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
  }
}
