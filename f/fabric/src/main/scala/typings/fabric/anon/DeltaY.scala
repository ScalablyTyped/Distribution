package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaY extends StObject {
  
  var deltaY: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var kernedWidth: js.UndefOr[Double] = js.native
  
  var left: Double = js.native
  
  var width: Double = js.native
}
object DeltaY {
  
  @scala.inline
  def apply(left: Double, width: Double): DeltaY = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaY]
  }
  
  @scala.inline
  implicit class DeltaYMutableBuilder[Self <: DeltaY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKernedWidth(value: Double): Self = StObject.set(x, "kernedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernedWidthUndefined: Self = StObject.set(x, "kernedWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
