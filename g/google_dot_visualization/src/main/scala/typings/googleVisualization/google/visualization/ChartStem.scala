package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStem extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
}
object ChartStem {
  
  @scala.inline
  def apply(): ChartStem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStem]
  }
  
  @scala.inline
  implicit class ChartStemMutableBuilder[Self <: ChartStem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
