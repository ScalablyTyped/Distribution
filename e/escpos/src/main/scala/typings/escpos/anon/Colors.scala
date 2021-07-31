package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: Double
  
  var height: Double
  
  var width: Double
}
object Colors {
  
  @scala.inline
  def apply(colors: Double, height: Double, width: Double): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
