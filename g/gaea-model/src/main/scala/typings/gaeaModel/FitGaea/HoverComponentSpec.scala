package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverComponentSpec extends StObject {
  
  var height: Double
  
  var hovering: Boolean
  
  var left: Double
  
  var top: Double
  
  var width: Double
}
object HoverComponentSpec {
  
  inline def apply(height: Double, hovering: Boolean, left: Double, top: Double, width: Double): HoverComponentSpec = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], hovering = hovering.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverComponentSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverComponentSpec] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
