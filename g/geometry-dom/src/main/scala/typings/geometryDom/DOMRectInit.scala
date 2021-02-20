package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRectInit extends StObject {
  
  /**
    * height value
    */
  var height: Double = js.native
  
  /**
    * width value
    */
  var width: Double = js.native
  
  /**
    * x coordinate
    */
  var x: Double = js.native
  
  /**
    * y coordinate
    */
  var y: Double = js.native
}
object DOMRectInit {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): DOMRectInit = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectInit]
  }
  
  @scala.inline
  implicit class DOMRectInitMutableBuilder[Self <: DOMRectInit] (val x: Self) extends AnyVal {
    
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
