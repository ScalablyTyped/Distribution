package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corner extends StObject {
  
  var corner: String
  
  var originX: String
  
  var originY: String
  
  var original: Object
  
  var width: Double
}
object Corner {
  
  inline def apply(corner: String, originX: String, originY: String, original: Object, width: Double): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  
  extension [Self <: Corner](x: Self) {
    
    inline def setCorner(value: String): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setOriginX(value: String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: Object): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
