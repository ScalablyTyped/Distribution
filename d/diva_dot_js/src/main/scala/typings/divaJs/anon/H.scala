package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H extends StObject {
  
  var h: Double
  
  var w: Double
}
object H {
  
  @scala.inline
  def apply(h: Double, w: Double): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
