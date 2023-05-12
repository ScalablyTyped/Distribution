package typings.floatingUiDom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/core.@floating-ui/core.Dimensions & {  fallback :boolean} */
trait Dimensionsfallbackboolean extends StObject {
  
  var fallback: Boolean
  
  var height: Double
  
  var width: Double
}
object Dimensionsfallbackboolean {
  
  inline def apply(fallback: Boolean, height: Double, width: Double): Dimensionsfallbackboolean = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensionsfallbackboolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimensionsfallbackboolean] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
