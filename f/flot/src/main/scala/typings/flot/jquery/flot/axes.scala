package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axes extends StObject {
  
  var x2axis: js.UndefOr[axis] = js.native
  
  var xaxis: axis = js.native
  
  var y2axis: js.UndefOr[axis] = js.native
  
  var yaxis: axis = js.native
}
object axes {
  
  @scala.inline
  def apply(xaxis: axis, yaxis: axis): axes = {
    val __obj = js.Dynamic.literal(xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[axes]
  }
  
  @scala.inline
  implicit class axesMutableBuilder[Self <: axes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX2axis(value: axis): Self = StObject.set(x, "x2axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2axisUndefined: Self = StObject.set(x, "x2axis", js.undefined)
    
    @scala.inline
    def setXaxis(value: axis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2axis(value: axis): Self = StObject.set(x, "y2axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2axisUndefined: Self = StObject.set(x, "y2axis", js.undefined)
    
    @scala.inline
    def setYaxis(value: axis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
  }
}
