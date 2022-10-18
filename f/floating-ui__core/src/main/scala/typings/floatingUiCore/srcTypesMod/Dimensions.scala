package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @floating-ui/core.@floating-ui/core/src/types.Length ]: number} */
trait Dimensions extends StObject {
  
  var height: Double
  
  var width: Double
}
object Dimensions {
  
  inline def apply(height: Double, width: Double): Dimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
