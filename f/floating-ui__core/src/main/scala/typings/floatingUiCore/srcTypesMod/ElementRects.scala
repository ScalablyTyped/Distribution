package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementRects extends StObject {
  
  var floating: Rect
  
  var reference: Rect
}
object ElementRects {
  
  inline def apply(floating: Rect, reference: Rect): ElementRects = {
    val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementRects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementRects] (val x: Self) extends AnyVal {
    
    inline def setFloating(value: Rect): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
