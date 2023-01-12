package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangle extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/rectangle
  /**
    * The height of the rectangle (must be an integer).
    */
  var height: Double
  
  /**
    * The width of the rectangle (must be an integer).
    */
  var width: Double
  
  /**
    * The x coordinate of the origin of the rectangle (must be an integer).
    */
  var x: Double
  
  /**
    * The y coordinate of the origin of the rectangle (must be an integer).
    */
  var y: Double
}
object Rectangle {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
