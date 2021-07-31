package typings.flowdoc.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var h: Double
  
  var w: Double
}
object Size {
  
  @scala.inline
  def apply(h: Double, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
