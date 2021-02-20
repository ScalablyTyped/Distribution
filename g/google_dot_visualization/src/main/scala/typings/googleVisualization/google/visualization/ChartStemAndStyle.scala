package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStemAndStyle extends StObject {
  
  var stem: js.UndefOr[ChartStem] = js.native
  
  var style: js.UndefOr[String] = js.native
}
object ChartStemAndStyle {
  
  @scala.inline
  def apply(): ChartStemAndStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStemAndStyle]
  }
  
  @scala.inline
  implicit class ChartStemAndStyleMutableBuilder[Self <: ChartStemAndStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStem(value: ChartStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
