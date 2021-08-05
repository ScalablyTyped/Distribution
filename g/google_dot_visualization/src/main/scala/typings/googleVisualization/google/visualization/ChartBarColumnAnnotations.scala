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
  
  inline def apply(): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
  
  extension [Self <: ChartBarColumnAnnotations](x: Self) {
    
    inline def setAlwaysOutside(value: Boolean): Self = StObject.set(x, "alwaysOutside", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOutsideUndefined: Self = StObject.set(x, "alwaysOutside", js.undefined)
  }
}
