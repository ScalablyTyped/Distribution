package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends StObject {
  
  /**
    * Rectangle height in device independent pixels (dip).
    */
  var height: Double = js.native
  
  /**
    * Page scale factor.
    */
  var scale: Double = js.native
  
  /**
    * Rectangle width in device independent pixels (dip).
    */
  var width: Double = js.native
  
  /**
    * X offset in device independent pixels (dip).
    */
  var x: Double = js.native
  
  /**
    * Y offset in device independent pixels (dip).
    */
  var y: Double = js.native
}
object Viewport {
  
  @scala.inline
  def apply(height: Double, scale: Double, width: Double, x: Double, y: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
