package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartOptions extends StObject {
  
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var greenColor: js.UndefOr[String] = js.undefined
  
  var greenFrom: js.UndefOr[Double] = js.undefined
  
  var greenTo: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var majorTicks: js.UndefOr[js.Array[String]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorTicks: js.UndefOr[Double] = js.undefined
  
  var redColor: js.UndefOr[String] = js.undefined
  
  var redFrom: js.UndefOr[Double] = js.undefined
  
  var redTo: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var yellowColor: js.UndefOr[String] = js.undefined
  
  var yellowFrom: js.UndefOr[Double] = js.undefined
  
  var yellowTo: js.UndefOr[Double] = js.undefined
}
object GaugeChartOptions {
  
  inline def apply(): GaugeChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartOptions]
  }
  
  extension [Self <: GaugeChartOptions](x: Self) {
    
    inline def setAnimation(value: TransitionAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    inline def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    inline def setGreenColor(value: String): Self = StObject.set(x, "greenColor", value.asInstanceOf[js.Any])
    
    inline def setGreenColorUndefined: Self = StObject.set(x, "greenColor", js.undefined)
    
    inline def setGreenFrom(value: Double): Self = StObject.set(x, "greenFrom", value.asInstanceOf[js.Any])
    
    inline def setGreenFromUndefined: Self = StObject.set(x, "greenFrom", js.undefined)
    
    inline def setGreenTo(value: Double): Self = StObject.set(x, "greenTo", value.asInstanceOf[js.Any])
    
    inline def setGreenToUndefined: Self = StObject.set(x, "greenTo", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMajorTicks(value: js.Array[String]): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMajorTicksVarargs(value: String*): Self = StObject.set(x, "majorTicks", js.Array(value :_*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorTicks(value: Double): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setRedColor(value: String): Self = StObject.set(x, "redColor", value.asInstanceOf[js.Any])
    
    inline def setRedColorUndefined: Self = StObject.set(x, "redColor", js.undefined)
    
    inline def setRedFrom(value: Double): Self = StObject.set(x, "redFrom", value.asInstanceOf[js.Any])
    
    inline def setRedFromUndefined: Self = StObject.set(x, "redFrom", js.undefined)
    
    inline def setRedTo(value: Double): Self = StObject.set(x, "redTo", value.asInstanceOf[js.Any])
    
    inline def setRedToUndefined: Self = StObject.set(x, "redTo", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setYellowColor(value: String): Self = StObject.set(x, "yellowColor", value.asInstanceOf[js.Any])
    
    inline def setYellowColorUndefined: Self = StObject.set(x, "yellowColor", js.undefined)
    
    inline def setYellowFrom(value: Double): Self = StObject.set(x, "yellowFrom", value.asInstanceOf[js.Any])
    
    inline def setYellowFromUndefined: Self = StObject.set(x, "yellowFrom", js.undefined)
    
    inline def setYellowTo(value: Double): Self = StObject.set(x, "yellowTo", value.asInstanceOf[js.Any])
    
    inline def setYellowToUndefined: Self = StObject.set(x, "yellowTo", js.undefined)
  }
}
