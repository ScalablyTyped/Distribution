package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measurements extends StObject {
  
  var animationId: Double
  
  var latestValues: ResolvedValues
  
  var layoutBox: Box
  
  var measuredBox: Box
  
  var source: Double
}
object Measurements {
  
  inline def apply(
    animationId: Double,
    latestValues: ResolvedValues,
    layoutBox: Box,
    measuredBox: Box,
    source: Double
  ): Measurements = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], latestValues = latestValues.asInstanceOf[js.Any], layoutBox = layoutBox.asInstanceOf[js.Any], measuredBox = measuredBox.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Measurements] (val x: Self) extends AnyVal {
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setLatestValues(value: ResolvedValues): Self = StObject.set(x, "latestValues", value.asInstanceOf[js.Any])
    
    inline def setLayoutBox(value: Box): Self = StObject.set(x, "layoutBox", value.asInstanceOf[js.Any])
    
    inline def setMeasuredBox(value: Box): Self = StObject.set(x, "measuredBox", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
