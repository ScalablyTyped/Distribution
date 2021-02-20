package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttArrow extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var spaceAfter: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object GanttArrow {
  
  @scala.inline
  def apply(): GanttArrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttArrow]
  }
  
  @scala.inline
  implicit class GanttArrowMutableBuilder[Self <: GanttArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
