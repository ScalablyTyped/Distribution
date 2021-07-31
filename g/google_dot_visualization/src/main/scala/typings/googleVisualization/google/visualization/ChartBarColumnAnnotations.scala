package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBarColumnAnnotations
  extends StObject
     with ChartAnnotations {
  
  var alwaysOutside: js.UndefOr[Boolean] = js.undefined
}
object ChartBarColumnAnnotations {
  
  @scala.inline
  def apply(): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
  
  @scala.inline
  implicit class ChartBarColumnAnnotationsMutableBuilder[Self <: ChartBarColumnAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysOutside(value: Boolean): Self = StObject.set(x, "alwaysOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysOutsideUndefined: Self = StObject.set(x, "alwaysOutside", js.undefined)
  }
}
