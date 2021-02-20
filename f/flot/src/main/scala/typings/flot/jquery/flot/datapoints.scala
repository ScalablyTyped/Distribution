package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait datapoints extends StObject {
  
  var format: js.Array[datapointFormat] = js.native
  
  var points: js.Array[Double] = js.native
  
  var pointsize: Double = js.native
}
object datapoints {
  
  @scala.inline
  def apply(format: js.Array[datapointFormat], points: js.Array[Double], pointsize: Double): datapoints = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsize = pointsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapoints]
  }
  
  @scala.inline
  implicit class datapointsMutableBuilder[Self <: datapoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: js.Array[datapointFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatVarargs(value: datapointFormat*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setPointsize(value: Double): Self = StObject.set(x, "pointsize", value.asInstanceOf[js.Any])
  }
}
