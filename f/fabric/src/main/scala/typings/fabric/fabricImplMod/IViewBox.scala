package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewBox extends StObject {
  
  /**
    * Height of viewbox
    */
  var height: Double = js.native
  
  /**
    * Width of viewbox
    */
  var width: Double = js.native
  
  /**
    * x-cooridnate of viewbox
    */
  var x: Double = js.native
  
  /**
    * y-coordinate of viewbox
    */
  var y: Double = js.native
}
object IViewBox {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): IViewBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewBox]
  }
  
  @scala.inline
  implicit class IViewBoxMutableBuilder[Self <: IViewBox] (val x: Self) extends AnyVal {
    
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
