package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/rectangle
  /**
    * The height of the rectangle (must be an integer).
    */
  var height: Double = js.native
  
  /**
    * The width of the rectangle (must be an integer).
    */
  var width: Double = js.native
  
  /**
    * The x coordinate of the origin of the rectangle (must be an integer).
    */
  var x: Double = js.native
  
  /**
    * The y coordinate of the origin of the rectangle (must be an integer).
    */
  var y: Double = js.native
}
object Rectangle {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  
  @scala.inline
  implicit class RectangleMutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
