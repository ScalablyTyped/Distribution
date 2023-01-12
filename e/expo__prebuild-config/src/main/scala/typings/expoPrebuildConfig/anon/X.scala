package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.canvasLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var key: String | canvasLocation
  
  var x: Double
  
  var y: Double
}
object X {
  
  inline def apply(key: String | canvasLocation, x: Double, y: Double): X = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String | canvasLocation): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
