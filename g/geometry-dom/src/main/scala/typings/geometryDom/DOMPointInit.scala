package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMPointInit extends StObject {
  
  /**
    * w coordinate: 1
    */
  var w: js.UndefOr[Double] = js.native
  
  /**
    * x coordinate: 0
    */
  var x: Double = js.native
  
  /**
    * y coordinate: 0
    */
  var y: Double = js.native
  
  /**
    * z coordinate: 0
    */
  var z: js.UndefOr[Double] = js.native
}
object DOMPointInit {
  
  @scala.inline
  def apply(x: Double, y: Double): DOMPointInit = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointInit]
  }
  
  @scala.inline
  implicit class DOMPointInitMutableBuilder[Self <: DOMPointInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
